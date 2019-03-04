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
    appendTags: js.Function1[js.Array[java.lang.String], scala.Unit],
    colorTheme: ColorTheme,
    getAllUserAttributes: js.Function1[
      js.Function1[/* allAttributes */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    getTags: js.Function1[js.Function1[/* tags */ java.lang.String, scala.Unit], scala.Unit],
    getUnreadMessagesCount: js.Function1[js.Function1[/* count */ scala.Double, scala.Unit], scala.Unit],
    getUserAttribute: js.Function2[
      java.lang.String, 
      js.Function1[/* attribute */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    identifyUserWithEmail: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    invocationEvent: InvocationEvent,
    locale: Locale,
    logDebug: js.Function1[java.lang.String, scala.Unit],
    logError: js.Function1[java.lang.String, scala.Unit],
    logInfo: js.Function1[java.lang.String, scala.Unit],
    logOut: js.Function0[scala.Unit],
    logVerbose: js.Function1[java.lang.String, scala.Unit],
    logWarn: js.Function1[java.lang.String, scala.Unit],
    removeUserAttribute: js.Function1[java.lang.String, scala.Unit],
    resetTags: js.Function0[scala.Unit],
    setAutoScreenRecordingEnabled: js.Function1[scala.Boolean, scala.Unit],
    setAutoScreenRecordingMaxDuration: js.Function1[scala.Double, scala.Unit],
    setChatNotificationEnabled: js.Function1[scala.Boolean, scala.Unit],
    setColorTheme: js.Function1[java.lang.String, scala.Unit],
    setCrashReportingEnabled: js.Function1[scala.Boolean, scala.Unit],
    setFloatingButtonEdge: js.Function0[scala.Unit],
    setLocale: js.Function1[java.lang.String, scala.Unit],
    setOnNewMessageHandler: js.Function1[js.Function0[scala.Unit], scala.Unit],
    setPostInvocationHandler: js.Function0[scala.Unit],
    setPrimaryColor: js.Function1[scala.Double, scala.Unit],
    setPromptOptionsEnabled: js.Function3[scala.Boolean, scala.Boolean, scala.Boolean, scala.Unit],
    setSessionProfilerEnabled: js.Function1[scala.Boolean, scala.Unit],
    setStringToKey: js.Function1[java.lang.String, scala.Unit],
    setSurveysEnabled: js.Function1[scala.Boolean, scala.Unit],
    setUserAttribute: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setUserData: js.Function1[java.lang.String, scala.Unit],
    setUserStepsEnabled: js.Function1[scala.Boolean, scala.Unit],
    setViewHierarchyEnabled: js.Function1[scala.Boolean, scala.Unit],
    setWelcomeMessageMode: js.Function1[java.lang.String, scala.Unit],
    startWithToken: js.Function2[java.lang.String, js.Array[java.lang.String], scala.Unit],
    strings: Strings,
    welcomeMessageMode: WelcomeMessageMode
  ): InstabugStatic = {
    val __obj = js.Dynamic.literal(appendTags = appendTags, colorTheme = colorTheme, getAllUserAttributes = getAllUserAttributes, getTags = getTags, getUnreadMessagesCount = getUnreadMessagesCount, getUserAttribute = getUserAttribute, identifyUserWithEmail = identifyUserWithEmail, invocationEvent = invocationEvent, locale = locale, logDebug = logDebug, logError = logError, logInfo = logInfo, logOut = logOut, logVerbose = logVerbose, logWarn = logWarn, removeUserAttribute = removeUserAttribute, resetTags = resetTags, setAutoScreenRecordingEnabled = setAutoScreenRecordingEnabled, setAutoScreenRecordingMaxDuration = setAutoScreenRecordingMaxDuration, setChatNotificationEnabled = setChatNotificationEnabled, setColorTheme = setColorTheme, setCrashReportingEnabled = setCrashReportingEnabled, setFloatingButtonEdge = setFloatingButtonEdge, setLocale = setLocale, setOnNewMessageHandler = setOnNewMessageHandler, setPostInvocationHandler = setPostInvocationHandler, setPrimaryColor = setPrimaryColor, setPromptOptionsEnabled = setPromptOptionsEnabled, setSessionProfilerEnabled = setSessionProfilerEnabled, setStringToKey = setStringToKey, setSurveysEnabled = setSurveysEnabled, setUserAttribute = setUserAttribute, setUserData = setUserData, setUserStepsEnabled = setUserStepsEnabled, setViewHierarchyEnabled = setViewHierarchyEnabled, setWelcomeMessageMode = setWelcomeMessageMode, startWithToken = startWithToken, strings = strings, welcomeMessageMode = welcomeMessageMode)
  
    __obj.asInstanceOf[InstabugStatic]
  }
}

