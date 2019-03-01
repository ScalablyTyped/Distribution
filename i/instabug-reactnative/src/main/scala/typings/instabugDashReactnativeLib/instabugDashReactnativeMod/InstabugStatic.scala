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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendTags")(appendTags)
    __obj.updateDynamic("colorTheme")(colorTheme)
    __obj.updateDynamic("getAllUserAttributes")(getAllUserAttributes)
    __obj.updateDynamic("getTags")(getTags)
    __obj.updateDynamic("getUnreadMessagesCount")(getUnreadMessagesCount)
    __obj.updateDynamic("getUserAttribute")(getUserAttribute)
    __obj.updateDynamic("identifyUserWithEmail")(identifyUserWithEmail)
    __obj.updateDynamic("invocationEvent")(invocationEvent)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("logDebug")(logDebug)
    __obj.updateDynamic("logError")(logError)
    __obj.updateDynamic("logInfo")(logInfo)
    __obj.updateDynamic("logOut")(logOut)
    __obj.updateDynamic("logVerbose")(logVerbose)
    __obj.updateDynamic("logWarn")(logWarn)
    __obj.updateDynamic("removeUserAttribute")(removeUserAttribute)
    __obj.updateDynamic("resetTags")(resetTags)
    __obj.updateDynamic("setAutoScreenRecordingEnabled")(setAutoScreenRecordingEnabled)
    __obj.updateDynamic("setAutoScreenRecordingMaxDuration")(setAutoScreenRecordingMaxDuration)
    __obj.updateDynamic("setChatNotificationEnabled")(setChatNotificationEnabled)
    __obj.updateDynamic("setColorTheme")(setColorTheme)
    __obj.updateDynamic("setCrashReportingEnabled")(setCrashReportingEnabled)
    __obj.updateDynamic("setFloatingButtonEdge")(setFloatingButtonEdge)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("setOnNewMessageHandler")(setOnNewMessageHandler)
    __obj.updateDynamic("setPostInvocationHandler")(setPostInvocationHandler)
    __obj.updateDynamic("setPrimaryColor")(setPrimaryColor)
    __obj.updateDynamic("setPromptOptionsEnabled")(setPromptOptionsEnabled)
    __obj.updateDynamic("setSessionProfilerEnabled")(setSessionProfilerEnabled)
    __obj.updateDynamic("setStringToKey")(setStringToKey)
    __obj.updateDynamic("setSurveysEnabled")(setSurveysEnabled)
    __obj.updateDynamic("setUserAttribute")(setUserAttribute)
    __obj.updateDynamic("setUserData")(setUserData)
    __obj.updateDynamic("setUserStepsEnabled")(setUserStepsEnabled)
    __obj.updateDynamic("setViewHierarchyEnabled")(setViewHierarchyEnabled)
    __obj.updateDynamic("setWelcomeMessageMode")(setWelcomeMessageMode)
    __obj.updateDynamic("startWithToken")(startWithToken)
    __obj.updateDynamic("strings")(strings)
    __obj.updateDynamic("welcomeMessageMode")(welcomeMessageMode)
    __obj.asInstanceOf[InstabugStatic]
  }
}

