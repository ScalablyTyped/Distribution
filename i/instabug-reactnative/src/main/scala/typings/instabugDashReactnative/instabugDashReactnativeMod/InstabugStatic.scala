package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstabugStatic extends js.Object {
  var colorTheme: ColorTheme
  var invocationEvent: InvocationEvent
  var locale: Locale
  var strings: Strings
  var welcomeMessageMode: WelcomeMessageMode
  def appendTags(tags: js.Array[String]): Unit
  def getAllUserAttributes(callBack: js.Function1[/* allAttributes */ js.Array[String], Unit]): Unit
  def getTags(callBack: js.Function1[/* tags */ String, Unit]): Unit
  def getUnreadMessagesCount(callBack: js.Function1[/* count */ Double, Unit]): Unit
  def getUserAttribute(key: String, callBack: js.Function1[/* attribute */ String, Unit]): Unit
  def identifyUserWithEmail(email: String, name: String): Unit
  def logDebug(info: String): Unit
  def logError(info: String): Unit
  def logInfo(info: String): Unit
  def logOut(): Unit
  def logVerbose(info: String): Unit
  def logWarn(info: String): Unit
  def removeUserAttribute(key: String): Unit
  def resetTags(): Unit
  def setAutoScreenRecordingEnabled(enabled: Boolean): Unit
  def setAutoScreenRecordingMaxDuration(ms: Double): Unit
  def setChatNotificationEnabled(enabled: Boolean): Unit
  def setColorTheme(colorTheme: String): Unit
  def setCrashReportingEnabled(enabled: Boolean): Unit
  def setFloatingButtonEdge(): Unit
  def setLocale(locale: String): Unit
  def setOnNewMessageHandler(callBacck: js.Function0[Unit]): Unit
  def setPostInvocationHandler(): Unit
  def setPrimaryColor(color: Double): Unit
  def setPromptOptionsEnabled(chat: Boolean, bug: Boolean, feedback: Boolean): Unit
  def setSessionProfilerEnabled(enabled: Boolean): Unit
  def setStringToKey(key: String): Unit
  def setSurveysEnabled(enabled: Boolean): Unit
  def setUserAttribute(key: String, value: String): Unit
  def setUserData(key: String): Unit
  def setUserStepsEnabled(enabled: Boolean): Unit
  def setViewHierarchyEnabled(enabled: Boolean): Unit
  def setWelcomeMessageMode(welcomeMsg: String): Unit
  def startWithToken(token: String, event: js.Array[String]): Unit
}

object InstabugStatic {
  @scala.inline
  def apply(
    appendTags: js.Array[String] => Unit,
    colorTheme: ColorTheme,
    getAllUserAttributes: js.Function1[/* allAttributes */ js.Array[String], Unit] => Unit,
    getTags: js.Function1[/* tags */ String, Unit] => Unit,
    getUnreadMessagesCount: js.Function1[/* count */ Double, Unit] => Unit,
    getUserAttribute: (String, js.Function1[/* attribute */ String, Unit]) => Unit,
    identifyUserWithEmail: (String, String) => Unit,
    invocationEvent: InvocationEvent,
    locale: Locale,
    logDebug: String => Unit,
    logError: String => Unit,
    logInfo: String => Unit,
    logOut: () => Unit,
    logVerbose: String => Unit,
    logWarn: String => Unit,
    removeUserAttribute: String => Unit,
    resetTags: () => Unit,
    setAutoScreenRecordingEnabled: Boolean => Unit,
    setAutoScreenRecordingMaxDuration: Double => Unit,
    setChatNotificationEnabled: Boolean => Unit,
    setColorTheme: String => Unit,
    setCrashReportingEnabled: Boolean => Unit,
    setFloatingButtonEdge: () => Unit,
    setLocale: String => Unit,
    setOnNewMessageHandler: js.Function0[Unit] => Unit,
    setPostInvocationHandler: () => Unit,
    setPrimaryColor: Double => Unit,
    setPromptOptionsEnabled: (Boolean, Boolean, Boolean) => Unit,
    setSessionProfilerEnabled: Boolean => Unit,
    setStringToKey: String => Unit,
    setSurveysEnabled: Boolean => Unit,
    setUserAttribute: (String, String) => Unit,
    setUserData: String => Unit,
    setUserStepsEnabled: Boolean => Unit,
    setViewHierarchyEnabled: Boolean => Unit,
    setWelcomeMessageMode: String => Unit,
    startWithToken: (String, js.Array[String]) => Unit,
    strings: Strings,
    welcomeMessageMode: WelcomeMessageMode
  ): InstabugStatic = {
    val __obj = js.Dynamic.literal(appendTags = js.Any.fromFunction1(appendTags), colorTheme = colorTheme, getAllUserAttributes = js.Any.fromFunction1(getAllUserAttributes), getTags = js.Any.fromFunction1(getTags), getUnreadMessagesCount = js.Any.fromFunction1(getUnreadMessagesCount), getUserAttribute = js.Any.fromFunction2(getUserAttribute), identifyUserWithEmail = js.Any.fromFunction2(identifyUserWithEmail), invocationEvent = invocationEvent, locale = locale, logDebug = js.Any.fromFunction1(logDebug), logError = js.Any.fromFunction1(logError), logInfo = js.Any.fromFunction1(logInfo), logOut = js.Any.fromFunction0(logOut), logVerbose = js.Any.fromFunction1(logVerbose), logWarn = js.Any.fromFunction1(logWarn), removeUserAttribute = js.Any.fromFunction1(removeUserAttribute), resetTags = js.Any.fromFunction0(resetTags), setAutoScreenRecordingEnabled = js.Any.fromFunction1(setAutoScreenRecordingEnabled), setAutoScreenRecordingMaxDuration = js.Any.fromFunction1(setAutoScreenRecordingMaxDuration), setChatNotificationEnabled = js.Any.fromFunction1(setChatNotificationEnabled), setColorTheme = js.Any.fromFunction1(setColorTheme), setCrashReportingEnabled = js.Any.fromFunction1(setCrashReportingEnabled), setFloatingButtonEdge = js.Any.fromFunction0(setFloatingButtonEdge), setLocale = js.Any.fromFunction1(setLocale), setOnNewMessageHandler = js.Any.fromFunction1(setOnNewMessageHandler), setPostInvocationHandler = js.Any.fromFunction0(setPostInvocationHandler), setPrimaryColor = js.Any.fromFunction1(setPrimaryColor), setPromptOptionsEnabled = js.Any.fromFunction3(setPromptOptionsEnabled), setSessionProfilerEnabled = js.Any.fromFunction1(setSessionProfilerEnabled), setStringToKey = js.Any.fromFunction1(setStringToKey), setSurveysEnabled = js.Any.fromFunction1(setSurveysEnabled), setUserAttribute = js.Any.fromFunction2(setUserAttribute), setUserData = js.Any.fromFunction1(setUserData), setUserStepsEnabled = js.Any.fromFunction1(setUserStepsEnabled), setViewHierarchyEnabled = js.Any.fromFunction1(setViewHierarchyEnabled), setWelcomeMessageMode = js.Any.fromFunction1(setWelcomeMessageMode), startWithToken = js.Any.fromFunction2(startWithToken), strings = strings, welcomeMessageMode = welcomeMessageMode)
  
    __obj.asInstanceOf[InstabugStatic]
  }
}

