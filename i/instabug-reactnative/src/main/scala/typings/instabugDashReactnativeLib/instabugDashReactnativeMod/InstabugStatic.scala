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

object InstabugStatic {
  @scala.inline
  def apply(
    appendTags: js.Array[java.lang.String] => scala.Unit,
    colorTheme: ColorTheme,
    getAllUserAttributes: js.Function1[/* allAttributes */ js.Array[java.lang.String], scala.Unit] => scala.Unit,
    getTags: js.Function1[/* tags */ java.lang.String, scala.Unit] => scala.Unit,
    getUnreadMessagesCount: js.Function1[/* count */ scala.Double, scala.Unit] => scala.Unit,
    getUserAttribute: (java.lang.String, js.Function1[/* attribute */ java.lang.String, scala.Unit]) => scala.Unit,
    identifyUserWithEmail: (java.lang.String, java.lang.String) => scala.Unit,
    invocationEvent: InvocationEvent,
    locale: Locale,
    logDebug: java.lang.String => scala.Unit,
    logError: java.lang.String => scala.Unit,
    logInfo: java.lang.String => scala.Unit,
    logOut: () => scala.Unit,
    logVerbose: java.lang.String => scala.Unit,
    logWarn: java.lang.String => scala.Unit,
    removeUserAttribute: java.lang.String => scala.Unit,
    resetTags: () => scala.Unit,
    setAutoScreenRecordingEnabled: scala.Boolean => scala.Unit,
    setAutoScreenRecordingMaxDuration: scala.Double => scala.Unit,
    setChatNotificationEnabled: scala.Boolean => scala.Unit,
    setColorTheme: java.lang.String => scala.Unit,
    setCrashReportingEnabled: scala.Boolean => scala.Unit,
    setFloatingButtonEdge: () => scala.Unit,
    setLocale: java.lang.String => scala.Unit,
    setOnNewMessageHandler: js.Function0[scala.Unit] => scala.Unit,
    setPostInvocationHandler: () => scala.Unit,
    setPrimaryColor: scala.Double => scala.Unit,
    setPromptOptionsEnabled: (scala.Boolean, scala.Boolean, scala.Boolean) => scala.Unit,
    setSessionProfilerEnabled: scala.Boolean => scala.Unit,
    setStringToKey: java.lang.String => scala.Unit,
    setSurveysEnabled: scala.Boolean => scala.Unit,
    setUserAttribute: (java.lang.String, java.lang.String) => scala.Unit,
    setUserData: java.lang.String => scala.Unit,
    setUserStepsEnabled: scala.Boolean => scala.Unit,
    setViewHierarchyEnabled: scala.Boolean => scala.Unit,
    setWelcomeMessageMode: java.lang.String => scala.Unit,
    startWithToken: (java.lang.String, js.Array[java.lang.String]) => scala.Unit,
    strings: Strings,
    welcomeMessageMode: WelcomeMessageMode
  ): InstabugStatic = {
    val __obj = js.Dynamic.literal(appendTags = js.Any.fromFunction1(appendTags), colorTheme = colorTheme, getAllUserAttributes = js.Any.fromFunction1(getAllUserAttributes), getTags = js.Any.fromFunction1(getTags), getUnreadMessagesCount = js.Any.fromFunction1(getUnreadMessagesCount), getUserAttribute = js.Any.fromFunction2(getUserAttribute), identifyUserWithEmail = js.Any.fromFunction2(identifyUserWithEmail), invocationEvent = invocationEvent, locale = locale, logDebug = js.Any.fromFunction1(logDebug), logError = js.Any.fromFunction1(logError), logInfo = js.Any.fromFunction1(logInfo), logOut = js.Any.fromFunction0(logOut), logVerbose = js.Any.fromFunction1(logVerbose), logWarn = js.Any.fromFunction1(logWarn), removeUserAttribute = js.Any.fromFunction1(removeUserAttribute), resetTags = js.Any.fromFunction0(resetTags), setAutoScreenRecordingEnabled = js.Any.fromFunction1(setAutoScreenRecordingEnabled), setAutoScreenRecordingMaxDuration = js.Any.fromFunction1(setAutoScreenRecordingMaxDuration), setChatNotificationEnabled = js.Any.fromFunction1(setChatNotificationEnabled), setColorTheme = js.Any.fromFunction1(setColorTheme), setCrashReportingEnabled = js.Any.fromFunction1(setCrashReportingEnabled), setFloatingButtonEdge = js.Any.fromFunction0(setFloatingButtonEdge), setLocale = js.Any.fromFunction1(setLocale), setOnNewMessageHandler = js.Any.fromFunction1(setOnNewMessageHandler), setPostInvocationHandler = js.Any.fromFunction0(setPostInvocationHandler), setPrimaryColor = js.Any.fromFunction1(setPrimaryColor), setPromptOptionsEnabled = js.Any.fromFunction3(setPromptOptionsEnabled), setSessionProfilerEnabled = js.Any.fromFunction1(setSessionProfilerEnabled), setStringToKey = js.Any.fromFunction1(setStringToKey), setSurveysEnabled = js.Any.fromFunction1(setSurveysEnabled), setUserAttribute = js.Any.fromFunction2(setUserAttribute), setUserData = js.Any.fromFunction1(setUserData), setUserStepsEnabled = js.Any.fromFunction1(setUserStepsEnabled), setViewHierarchyEnabled = js.Any.fromFunction1(setViewHierarchyEnabled), setWelcomeMessageMode = js.Any.fromFunction1(setWelcomeMessageMode), startWithToken = js.Any.fromFunction2(startWithToken), strings = strings, welcomeMessageMode = welcomeMessageMode)
  
    __obj.asInstanceOf[InstabugStatic]
  }
}

