package typings.instabugReactnative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def addFileAttachment(filePath: java.lang.String, fileName: java.lang.String): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addFileAttachment")(filePath.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendTags(tags: js.Array[java.lang.String]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendTags")(tags.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def callPrivateApi(apiName: java.lang.String, param: js.Any): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("callPrivateApi")(apiName.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearAllUserAttributes(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearAllUserAttributes")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearLogs(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearLogs")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def componentDidAppearListener(componentObj: typings.instabugReactnative.anon.ComponentId): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("componentDidAppearListener")(componentObj.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def disable(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def enable(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAllUserAttributes(userAttributesCallback: js.Function0[scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAllUserAttributes")(userAttributesCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getTags(tagsCallback: js.Function0[scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(tagsCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getUnreadMessagesCount(messageCountCallback: js.Function1[/* count */ scala.Double, scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnreadMessagesCount")(messageCountCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getUserAttribute(key: java.lang.String, userAttributeCallback: js.Function0[scala.Unit]): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUserAttribute")(key.asInstanceOf[js.Any], userAttributeCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def identifyUser(email: java.lang.String, name: java.lang.String): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identifyUser")(email.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def identifyUserWithEmail(email: java.lang.String, name: java.lang.String): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identifyUserWithEmail")(email.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isRunningLive(runningLiveCallBack: js.Function0[scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRunningLive")(runningLiveCallBack.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logDebug(message: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logDebug")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logError(message: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logError")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logInfo(message: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logInfo")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logOut(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logOut")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def logUserEvent(name: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logUserEvent")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logUserEventWithName(name: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logUserEventWithName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def logUserEventWithName(name: java.lang.String, params: js.Any): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logUserEventWithName")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logVerbose(message: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logVerbose")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logWarn(message: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("logWarn")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def onNavigationStateChange(prevState: js.Any, currentState: js.Any, action: js.Any): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onNavigationStateChange")(prevState.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def onReportSubmitHandler(
    preSendingHandler: js.Function1[/* presendingHandler */ typings.instabugReactnative.mod.Report, scala.Unit]
  ): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onReportSubmitHandler")(preSendingHandler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def onStateChange(state: js.Any): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onStateChange")(state.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def removeUserAttribute(key: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeUserAttribute")(key.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def reportJSException(Exception: js.Object): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reportJSException")(Exception.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def reportScreenChange(screenName: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reportScreenChange")(screenName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def resetTags(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resetTags")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setAutoScreenRecordingEnabled(autoScreenRecordingEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScreenRecordingEnabled")(autoScreenRecordingEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setAutoScreenRecordingMaxDuration(autoScreenRecordingMaxDuration: scala.Double): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setAutoScreenRecordingMaxDuration")(autoScreenRecordingMaxDuration.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setChatNotificationEnabled(isChatNotificationEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setChatNotificationEnabled")(isChatNotificationEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setColorTheme(colorTheme: typings.instabugReactnative.mod.colorTheme): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setColorTheme")(colorTheme.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setCrashReportingEnabled(enableCrashReporter: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setCrashReportingEnabled")(enableCrashReporter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setDebugEnabled(isDebugEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDebugEnabled")(isDebugEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setDidSelectPromptOptionHandler(didSelectPromptOptionHandler: js.Function0[scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDidSelectPromptOptionHandler")(didSelectPromptOptionHandler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setEmailFieldRequiredForActions(isEmailFieldRequired: scala.Boolean, actionTypes: typings.instabugReactnative.mod.actionTypes): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setEmailFieldRequiredForActions")(isEmailFieldRequired.asInstanceOf[js.Any], actionTypes.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setEnableInAppNotificationSound(shouldPlaySound: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setEnableInAppNotificationSound")(shouldPlaySound.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setEnabledAttachmentTypes(
    screenshot: scala.Boolean,
    extraScreenshot: scala.Boolean,
    galleryImage: scala.Boolean,
    screenRecording: scala.Boolean
  ): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setEnabledAttachmentTypes")(screenshot.asInstanceOf[js.Any], extraScreenshot.asInstanceOf[js.Any], galleryImage.asInstanceOf[js.Any], screenRecording.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setFloatingButtonEdge(floatingButtonEdge: scala.Double, offsetFromTop: scala.Double): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setFloatingButtonEdge")(floatingButtonEdge.asInstanceOf[js.Any], offsetFromTop.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setIBGLogPrintsToConsole(printsToConsole: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setIBGLogPrintsToConsole")(printsToConsole.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLocale(locale: typings.instabugReactnative.mod.locale): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setOnNewMessageHandler(onNewMessageHandler: js.Function0[scala.Unit]): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOnNewMessageHandler")(onNewMessageHandler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setPrimaryColor(color: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setPrimaryColor")(color.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setPrivateView(viewRef: js.Object): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setPrivateView")(viewRef.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setPushNotificationsEnabled(isPushNotificationEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationsEnabled")(isPushNotificationEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setReproStepsMode(reproStepsMode: typings.instabugReactnative.mod.reproStepsMode): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setReproStepsMode")(reproStepsMode.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setSdkDebugLogsLevel(sdkDebugLogsLevel: typings.instabugReactnative.mod.sdkDebugLogsLevel): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setSdkDebugLogsLevel")(sdkDebugLogsLevel.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setSessionProfilerEnabled(sessionProfilerEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setSessionProfilerEnabled")(sessionProfilerEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setShouldShowSurveysWelcomeScreen(shouldShowWelcomeScreen: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setShouldShowSurveysWelcomeScreen")(shouldShowWelcomeScreen.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setString(key: typings.instabugReactnative.mod.strings, string: java.lang.String): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setString")(key.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setStringToKey(string: java.lang.String, key: typings.instabugReactnative.mod.strings): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setStringToKey")(string.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setSurveysEnabled(surveysEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setSurveysEnabled")(surveysEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTrackUserSteps(isEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTrackUserSteps")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setUserAttribute(key: java.lang.String, value: java.lang.String): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setUserAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setUserData(userData: java.lang.String): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setUserData")(userData.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setVideoRecordingFloatingButtonPosition(position: typings.instabugReactnative.mod.IBGPosition): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVideoRecordingFloatingButtonPosition")(position.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setViewHierarchyEnabled(viewHierarchyEnabled: scala.Boolean): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setViewHierarchyEnabled")(viewHierarchyEnabled.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setWelcomeMessageMode(welcomeMessageMode: typings.instabugReactnative.mod.welcomeMessageMode): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setWelcomeMessageMode")(welcomeMessageMode.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def show(): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def showWelcomeMessage(welcomeMessageMode: typings.instabugReactnative.mod.welcomeMessageMode): scala.Unit = typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showWelcomeMessage")(welcomeMessageMode.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def start(
    token: java.lang.String,
    invocationEvent: js.Array[typings.instabugReactnative.mod.invocationEvent]
  ): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("start")(token.asInstanceOf[js.Any], invocationEvent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def startWithToken(
    token: java.lang.String,
    invocationEvent: js.Array[typings.instabugReactnative.mod.invocationEvent]
  ): scala.Unit = (typings.instabugReactnative.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startWithToken")(token.asInstanceOf[js.Any], invocationEvent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
