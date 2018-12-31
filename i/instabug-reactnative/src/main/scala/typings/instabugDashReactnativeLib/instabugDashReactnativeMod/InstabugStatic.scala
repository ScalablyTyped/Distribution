package typings
package instabugDashReactnativeLib.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstabugStatic extends js.Object {
  var colorTheme: ColorTheme
  var invocationEvent: InvocationEvent
  var locale: Locale
  var strings: Strings
  var welcomeMessageMode: WelcomeMessageMode
  def appendTags(tags: js.Array[java.lang.String]): scala.Unit
  def getAllUserAttributes(callBack: js.Function1[/* allAttributes */ js.Array[java.lang.String], scala.Unit]): scala.Unit
  def getTags(callBack: js.Function1[/* tags */ java.lang.String, scala.Unit]): scala.Unit
  def getUnreadMessagesCount(callBack: js.Function1[/* count */ scala.Double, scala.Unit]): scala.Unit
  def getUserAttribute(key: java.lang.String, callBack: js.Function1[/* attribute */ java.lang.String, scala.Unit]): scala.Unit
  def identifyUserWithEmail(email: java.lang.String, name: java.lang.String): scala.Unit
  def logDebug(info: java.lang.String): scala.Unit
  def logError(info: java.lang.String): scala.Unit
  def logInfo(info: java.lang.String): scala.Unit
  def logOut(): scala.Unit
  def logVerbose(info: java.lang.String): scala.Unit
  def logWarn(info: java.lang.String): scala.Unit
  def removeUserAttribute(key: java.lang.String): scala.Unit
  def resetTags(): scala.Unit
  def setAutoScreenRecordingEnabled(enabled: scala.Boolean): scala.Unit
  def setAutoScreenRecordingMaxDuration(ms: scala.Double): scala.Unit
  def setChatNotificationEnabled(enabled: scala.Boolean): scala.Unit
  def setColorTheme(colorTheme: java.lang.String): scala.Unit
  def setCrashReportingEnabled(enabled: scala.Boolean): scala.Unit
  def setFloatingButtonEdge(): scala.Unit
  def setLocale(locale: java.lang.String): scala.Unit
  def setOnNewMessageHandler(callBacck: js.Function0[scala.Unit]): scala.Unit
  def setPostInvocationHandler(): scala.Unit
  def setPrimaryColor(color: scala.Double): scala.Unit
  def setPromptOptionsEnabled(chat: scala.Boolean, bug: scala.Boolean, feedback: scala.Boolean): scala.Unit
  def setSessionProfilerEnabled(enabled: scala.Boolean): scala.Unit
  def setStringToKey(key: java.lang.String): scala.Unit
  def setSurveysEnabled(enabled: scala.Boolean): scala.Unit
  def setUserAttribute(key: java.lang.String, value: java.lang.String): scala.Unit
  def setUserData(key: java.lang.String): scala.Unit
  def setUserStepsEnabled(enabled: scala.Boolean): scala.Unit
  def setViewHierarchyEnabled(enabled: scala.Boolean): scala.Unit
  def setWelcomeMessageMode(welcomeMsg: java.lang.String): scala.Unit
  def startWithToken(token: java.lang.String, event: js.Array[java.lang.String]): scala.Unit
}

