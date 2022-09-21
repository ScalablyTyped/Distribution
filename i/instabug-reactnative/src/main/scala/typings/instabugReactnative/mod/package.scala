package typings.instabugReactnative.mod

import typings.instabugReactnative.anon.ComponentId
import typings.instabugReactnative.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addExperiments(experiments: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExperiments")(experiments.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def addFileAttachment(filePath: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFileAttachment")(filePath.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addPrivateView(viewRef: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPrivateView")(viewRef.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def appendTags(tags: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def callPrivateApi(apiName: String, param: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callPrivateApi")(apiName.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def clearAllExperiments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllExperiments")().asInstanceOf[Unit]

inline def clearAllUserAttributes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllUserAttributes")().asInstanceOf[Unit]

inline def clearLogs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLogs")().asInstanceOf[Unit]

inline def componentDidAppearListener(componentObj: ComponentId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("componentDidAppearListener")(componentObj.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]

inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]

inline def getAllUserAttributes(userAttributesCallback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllUserAttributes")(userAttributesCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getTags(tagsCallback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(tagsCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getUserAttribute(key: String, userAttributeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserAttribute")(key.asInstanceOf[js.Any], userAttributeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def identifyUser(email: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identifyUser")(email.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isRunningLive(runningLiveCallBack: js.Function1[/* isLive */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunningLive")(runningLiveCallBack.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logDebug(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDebug")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logError(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logError")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logInfo(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logInfo")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logOut(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logOut")().asInstanceOf[Unit]

inline def logUserEvent(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logUserEvent")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logVerbose(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logVerbose")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def logWarn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logWarn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def onNavigationStateChange(prevState: Any, currentState: Any, action: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onNavigationStateChange")(prevState.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def onReportSubmitHandler(preSendingHandler: js.Function1[/* presendingHandler */ Report, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReportSubmitHandler")(preSendingHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def onStateChange(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onStateChange")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeExperiments(experiments: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExperiments")(experiments.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removePrivateView(viewRef: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePrivateView")(viewRef.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeUserAttribute(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUserAttribute")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def reportScreenChange(screenName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportScreenChange")(screenName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def resetTags(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTags")().asInstanceOf[Unit]

inline def setColorTheme(colorTheme: colorTheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setColorTheme")(colorTheme.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setDebugEnabled(isDebugEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugEnabled")(isDebugEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setIBGLogPrintsToConsole(printsToConsole: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIBGLogPrintsToConsole")(printsToConsole.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLocale(locale: locale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setPrimaryColor(color: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrimaryColor")(color.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setPrivateView(viewRef: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrivateView")(viewRef.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setReproStepsMode(reproStepsMode: reproStepsMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReproStepsMode")(reproStepsMode.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setSdkDebugLogsLevel(sdkDebugLogsLevel: sdkDebugLogsLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSdkDebugLogsLevel")(sdkDebugLogsLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setSessionProfilerEnabled(sessionProfilerEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSessionProfilerEnabled")(sessionProfilerEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setString(key: strings, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setString")(key.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTrackUserSteps(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTrackUserSteps")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setUserAttribute(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setUserData(userData: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserData")(userData.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setWelcomeMessageMode(welcomeMessageMode: welcomeMessageMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWelcomeMessageMode")(welcomeMessageMode.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]

inline def showWelcomeMessage(welcomeMessageMode: welcomeMessageMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showWelcomeMessage")(welcomeMessageMode.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def start(token: String, invocationEvent: js.Array[invocationEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(token.asInstanceOf[js.Any], invocationEvent.asInstanceOf[js.Any])).asInstanceOf[Unit]
