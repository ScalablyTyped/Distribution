package typings.ibmMobilefirst

import org.scalablytyped.runtime.StringDictionary
import typings.ibmMobilefirst.WL.App.ActionReceiverCallback
import typings.ibmMobilefirst.WL.App.BackgroundHandler.Handler
import typings.ibmMobilefirst.WL.App.Callback
import typings.ibmMobilefirst.WL.App.Data
import typings.ibmMobilefirst.WL.App.KeepAliveInBackgroundOptions
import typings.ibmMobilefirst.WL.App.OpenURLOptions
import typings.ibmMobilefirst.WL.Client.ChallengeHandlerAuthenticationOptions
import typings.ibmMobilefirst.WL.Client.ChallengeHandlerSubmitLoginFormOptions
import typings.ibmMobilefirst.WL.Client.ChallengehandlerInvocationData
import typings.ibmMobilefirst.WL.Client.ConnectOptions
import typings.ibmMobilefirst.WL.Client.EventTransmissionPolicy
import typings.ibmMobilefirst.WL.Client.InitOptions
import typings.ibmMobilefirst.WL.Client.ProcedureInvocationData
import typings.ibmMobilefirst.WL.Client.ProcedureInvocationOptions
import typings.ibmMobilefirst.WL.Client.SharedTokenObject
import typings.ibmMobilefirst.WL.Client.UserPreferences
import typings.ibmMobilefirst.WL.Device.NetworkInfo
import typings.ibmMobilefirst.WL.EncryptedCache.StatusHandler
import typings.ibmMobilefirst.WL.Geo.Circle
import typings.ibmMobilefirst.WL.Geo.Coordinate
import typings.ibmMobilefirst.WL.Geo.DistanceOptions
import typings.ibmMobilefirst.WL.Geo.InsideOutsideOptions
import typings.ibmMobilefirst.WL.Headers
import typings.ibmMobilefirst.WL.Options
import typings.ibmMobilefirst.WL.ResponseHandler
import typings.ibmMobilefirst.WL.SecurityUtils.DecryptOptions
import typings.ibmMobilefirst.WL.SecurityUtils.EncryptOptions
import typings.ibmMobilefirst.WL.SecurityUtils.KeygenOptions
import typings.ibmMobilefirst.WL.SimpleDialog.Button
import typings.ibmMobilefirst.WL.TabBar.ItemOptions
import typings.ibmMobilefirst.WL.Trusteer.AssetmentRisks
import typings.ibmMobilefirst.WLAuthorizationManager.RequestObject
import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WL {
    
    @JSGlobal("WL")
    @js.native
    val ^ : js.Any = js.native
    
    object Analytics {
      
      @JSGlobal("WL.Analytics")
      @js.native
      val ^ : js.Any = js.native
      
      inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
      
      inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
      
      inline def log(message: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @deprecated since version 6.2. WL.Analytics.restart is now a NOP.
        */
      inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
      
      inline def send(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")().asInstanceOf[Unit]
      
      inline def state(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("state")().asInstanceOf[Unit]
    }
    
    object App {
      
      @JSGlobal("WL.App")
      @js.native
      val ^ : js.Any = js.native
      
      object BackgroundHandler {
        
        @JSGlobal("WL.App.BackgroundHandler")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("WL.App.BackgroundHandler.defaultIOSBehavior")
        @js.native
        def defaultIOSBehavior: Handler = js.native
        inline def defaultIOSBehavior_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultIOSBehavior")(x.asInstanceOf[js.Any])
        
        /**
          * @deprecated since version 6.0.0
          */
        @JSGlobal("WL.App.BackgroundHandler.hideElements")
        @js.native
        def hideElements: Handler = js.native
        inline def hideElements_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideElements")(x.asInstanceOf[js.Any])
        
        @JSGlobal("WL.App.BackgroundHandler.hideView")
        @js.native
        def hideView: Handler = js.native
        inline def hideView_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideView")(x.asInstanceOf[js.Any])
        
        inline def setOnAppEnteringBackground(handler: Handler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnAppEnteringBackground")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
      
      inline def addActionReceiver(id: String, callback: ActionReceiverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addActionReceiver")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @deprecated Deprecated.
        */
      inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
      
      inline def copyToClipboard(stringToCopy: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToClipboard")(stringToCopy.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def copyToClipboard(stringToCopy: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyToClipboard")(stringToCopy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def getDeviceLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceLanguage")().asInstanceOf[String]
      
      inline def getDeviceLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceLocale")().asInstanceOf[String]
      
      /**
        * TODO: declare exception type. (Exceptions that are thrown by the IBM® Worklight® client runtime framework)
        */
      inline def getErrorMessage(exception: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def hideSplashScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideSplashScreen")().asInstanceOf[Unit]
      
      inline def openURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def openURL(url: String, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def openURL(url: String, target: String, options: OpenURLOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def openURL(url: String, target: Unit, options: OpenURLOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def overrideBackButton(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideBackButton")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def removeActionReceiver(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeActionReceiver")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @deprecated since version 6.0.0
        */
      inline def resetBackButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBackButton")().asInstanceOf[Unit]
      
      inline def sendActionToNative(action: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendActionToNative")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def sendActionToNative(action: String, data: Data): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendActionToNative")(action.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setKeepAliveInBackground(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAliveInBackground")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setKeepAliveInBackground(enabled: Boolean, options: KeepAliveInBackgroundOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAliveInBackground")(enabled.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def showSplashScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSplashScreen")().asInstanceOf[Unit]
    }
    
    object AppProperty {
      
      @JSGlobal("WL.AppProperty")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.AppProperty.AIR_ICON_128x128_PATH")
      @js.native
      def AIRICON128x128PATH: String = js.native
      
      inline def AIRICON128x128PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIR_ICON_128x128_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.AIR_ICON_16x16_PATH")
      @js.native
      def AIRICON16x16PATH: String = js.native
      
      inline def AIRICON16x16PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIR_ICON_16x16_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_DISPLAY_NAME")
      @js.native
      def APP_DISPLAY_NAME: String = js.native
      inline def APP_DISPLAY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_DISPLAY_NAME")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_LOGIN_TYPE")
      @js.native
      def APP_LOGIN_TYPE: String = js.native
      inline def APP_LOGIN_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_LOGIN_TYPE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_VERSION")
      @js.native
      def APP_VERSION: String = js.native
      inline def APP_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_VERSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.DOWNLOAD_APP_LINK")
      @js.native
      def DOWNLOAD_APP_LINK: String = js.native
      inline def DOWNLOAD_APP_LINK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWNLOAD_APP_LINK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.LATEST_VERSION")
      @js.native
      def LATEST_VERSION: String = js.native
      inline def LATEST_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LATEST_VERSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.MAIN_FILE_PATH")
      @js.native
      def MAIN_FILE_PATH: String = js.native
      inline def MAIN_FILE_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN_FILE_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.SHOW_IN_TASKBAR")
      @js.native
      def SHOW_IN_TASKBAR: String = js.native
      inline def SHOW_IN_TASKBAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_IN_TASKBAR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.THUMBNAIL_IMAGE_URL")
      @js.native
      def THUMBNAIL_IMAGE_URL: String = js.native
      inline def THUMBNAIL_IMAGE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBNAIL_IMAGE_URL")(x.asInstanceOf[js.Any])
    }
    
    object Badge {
      
      @JSGlobal("WL.Badge")
      @js.native
      val ^ : js.Any = js.native
      
      inline def setNumber(badgeNumber: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNumber")(badgeNumber.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("WL.BusyIndicator")
    @js.native
    open class BusyIndicator ()
      extends StObject
         with typings.ibmMobilefirst.WL.BusyIndicator {
      def this(containerId: String) = this()
      def this(containerId: String, options: typings.ibmMobilefirst.WL.BusyIndicator) = this()
      def this(containerId: Unit, options: typings.ibmMobilefirst.WL.BusyIndicator) = this()
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    object Client {
      
      @JSGlobal("WL.Client")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.Client.AbstractChallengeHandler")
      @js.native
      open class AbstractChallengeHandler ()
        extends StObject
           with typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler {
        
        /* CompleteClass */
        override def handleChallenge(challenge: Any): Boolean = js.native
        
        /* CompleteClass */
        override def isCustomResponse(transport: Any): Boolean = js.native
        
        /* CompleteClass */
        override def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): Unit = js.native
        
        /* CompleteClass */
        override def submitFailure(error: String): Unit = js.native
        
        /* CompleteClass */
        override def submitLoginForm(
          reqURL: String,
          options: ChallengeHandlerSubmitLoginFormOptions,
          submitLoginFormCallback: js.Function1[/* transport */ Any, Unit]
        ): Unit = js.native
        
        /* CompleteClass */
        override def submitSuccess(): Unit = js.native
      }
      
      inline def addGlobalHeader(headerName: String, headerValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalHeader")(headerName.asInstanceOf[js.Any], headerValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def checkForDirectUpdate(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkForDirectUpdate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def clearSharedToken(`object`: SharedTokenObject): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSharedToken")(`object`.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
      
      inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
      
      inline def connect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Unit]
      inline def connect(options: ConnectOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def createChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createChallengeHandler")(realmName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler]
      
      inline def createProvisioningChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createProvisioningChallengeHandler")(realmName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler]
      
      inline def createWLChallengeHandler(realName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createWLChallengeHandler")(realName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler]
      
      inline def deleteUserPref(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUserPref")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def deleteUserPref(key: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUserPref")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * See WL.AppProperty for possible results
        */
      inline def getAppProperty(property: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppProperty")(property.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * See WL.Environment for possible results
        */
      inline def getEnvironment(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironment")().asInstanceOf[String]
      
      inline def getLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String]
      
      inline def getLastAccessToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastAccessToken")().asInstanceOf[String]
      inline def getLastAccessToken(scope: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastAccessToken")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getLoginName(realmName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoginName")(realmName.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * @deprecated since version 7.0
        */
      inline def getRequiredAccessTokenScope(status: Double, header: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredAccessTokenScope")(status.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def getSharedToken(`object`: SharedTokenObject): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSharedToken")(`object`.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
      
      inline def getUserInfo(realm: String, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserInfo")(realm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def getUserName(realm: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserName")(realm.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getUserPref(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserPref")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def hasUserPref(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUserPref")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def invokeProcedure(invocationData: ProcedureInvocationData): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeProcedure")(invocationData.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[typings.ibmMobilefirst.WL.Response]]
      inline def invokeProcedure(invocationData: ProcedureInvocationData, options: ProcedureInvocationOptions): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeProcedure")(invocationData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryDeferred[typings.ibmMobilefirst.WL.Response]]
      
      /**
        * @deprecated since version 4.1.3. Use WL.Device.getNetworkInfo instead.
        */
      inline def isConnected(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnected")().asInstanceOf[Unit]
      
      inline def isUserAuthenticated(realm: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserAuthenticated")(realm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * @deprecated since version 7.0. Use WL.Logger instead.
        */
      inline def logActivity(activityType: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logActivity")(activityType.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def login(realm: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(realm.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def login(realm: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(realm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def logout(realm: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(realm.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def logout(realm: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logout")(realm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def minimize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("minimize")().asInstanceOf[Unit]
      
      /**
        * @deprecated since version 7.0
        */
      inline def obtainAccessToken(
        scope: String,
        onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
        onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obtainAccessToken")(scope.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def purgeEventTransmissionBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeEventTransmissionBuffer")().asInstanceOf[Unit]
      
      inline def reloadApp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadApp")().asInstanceOf[Unit]
      
      inline def removeGlobalHeader(headerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGlobalHeader")(headerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setEventTransmissionPolicy(policy: EventTransmissionPolicy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEventTransmissionPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setHeartBeatInterval(interval: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeartBeatInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setSharedToken(token: SharedTokenObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSharedToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setUserPref(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserPref")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setUserPref(key: String, value: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserPref")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setUserPrefs(userPrefsHash: UserPreferences): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserPrefs")(userPrefsHash.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setUserPrefs(userPrefsHash: UserPreferences, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserPrefs")(userPrefsHash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def transmitEvent(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transmitEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def transmitEvent(event: Any, immediate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transmitEvent")(event.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def updateUserInfo(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateUserInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object Device {
      
      @JSGlobal("WL.Device")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getNetworkInfo(callback: js.Function1[/* networkInfo */ NetworkInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object EncryptedCache {
      
      @JSGlobal("WL.EncryptedCache")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.EncryptedCache.ERROR_COULD_NOT_GENERATE_KEY")
      @js.native
      def ERROR_COULD_NOT_GENERATE_KEY: Double = js.native
      inline def ERROR_COULD_NOT_GENERATE_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_COULD_NOT_GENERATE_KEY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_CREDENTIALS_MISMATCH")
      @js.native
      def ERROR_CREDENTIALS_MISMATCH: Double = js.native
      inline def ERROR_CREDENTIALS_MISMATCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CREDENTIALS_MISMATCH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_CLOSED")
      @js.native
      def ERROR_EOC_CLOSED: Double = js.native
      inline def ERROR_EOC_CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_CLOSED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_DELETED")
      @js.native
      def ERROR_EOC_DELETED: Double = js.native
      inline def ERROR_EOC_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_DELETED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_TO_BE_DELETED")
      @js.native
      def ERROR_EOC_TO_BE_DELETED: Double = js.native
      inline def ERROR_EOC_TO_BE_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_TO_BE_DELETED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_INVALID_PARAMETER")
      @js.native
      def ERROR_INVALID_PARAMETER: Double = js.native
      inline def ERROR_INVALID_PARAMETER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INVALID_PARAMETER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_KEY_CREATION_IN_PROGRESS")
      @js.native
      def ERROR_KEY_CREATION_IN_PROGRESS: Double = js.native
      inline def ERROR_KEY_CREATION_IN_PROGRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_KEY_CREATION_IN_PROGRESS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_LOCAL_STORAGE_NOT_SUPPORTED")
      @js.native
      def ERROR_LOCAL_STORAGE_NOT_SUPPORTED: Double = js.native
      inline def ERROR_LOCAL_STORAGE_NOT_SUPPORTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LOCAL_STORAGE_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_MIGRATION")
      @js.native
      def ERROR_MIGRATION: Double = js.native
      inline def ERROR_MIGRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MIGRATION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_NO_EOC")
      @js.native
      def ERROR_NO_EOC: Double = js.native
      inline def ERROR_NO_EOC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_EOC")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_NO_SUCH_KEY")
      @js.native
      def ERROR_NO_SUCH_KEY: Double = js.native
      inline def ERROR_NO_SUCH_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_SUCH_KEY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE")
      @js.native
      def ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE: Double = js.native
      inline def ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_UNKNOWN")
      @js.native
      def ERROR_UNKNOWN: Double = js.native
      inline def ERROR_UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_UNKNOWN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_UNSAFE_CREDENTIALS")
      @js.native
      def ERROR_UNSAFE_CREDENTIALS: Double = js.native
      inline def ERROR_UNSAFE_CREDENTIALS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_UNSAFE_CREDENTIALS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.OK")
      @js.native
      def OK: Double = js.native
      inline def OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
      
      inline def close(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def destroy(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def open(
        credentials: String,
        createIfNone: Boolean,
        successHandler: StatusHandler,
        failureHandler: StatusHandler
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(credentials.asInstanceOf[js.Any], createIfNone.asInstanceOf[js.Any], successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def read(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(key.asInstanceOf[js.Any], successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def remove(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def write(key: String, value: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], successHandler.asInstanceOf[js.Any], failureHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    object Environment {
      
      @JSGlobal("WL.Environment")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.Environment.ADOBE_AIR")
      @js.native
      def ADOBE_AIR: String = js.native
      inline def ADOBE_AIR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADOBE_AIR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.ANDROID")
      @js.native
      def ANDROID: String = js.native
      inline def ANDROID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.EMBEDDED")
      @js.native
      def EMBEDDED: String = js.native
      inline def EMBEDDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMBEDDED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.IPAD")
      @js.native
      def IPAD: String = js.native
      inline def IPAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPAD")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.IPHONE")
      @js.native
      def IPHONE: String = js.native
      inline def IPHONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPHONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.MOBILE_WEB")
      @js.native
      def MOBILE_WEB: String = js.native
      inline def MOBILE_WEB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOBILE_WEB")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.PREVIEW")
      @js.native
      def PREVIEW: String = js.native
      inline def PREVIEW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREVIEW")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.WINDOWS8")
      @js.native
      def WINDOWS8: String = js.native
      inline def WINDOWS8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS8")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.WINDOWS_PHONE_8")
      @js.native
      def WINDOWS_PHONE_8: String = js.native
      inline def WINDOWS_PHONE_8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS_PHONE_8")(x.asInstanceOf[js.Any])
    }
    
    object Events {
      
      @JSGlobal("WL.Events")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.Events.WORKLIGHT_IS_CONNECTED")
      @js.native
      def WORKLIGHT_IS_CONNECTED: String = js.native
      inline def WORKLIGHT_IS_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORKLIGHT_IS_CONNECTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Events.WORKLIGHT_IS_DISCONNECTED")
      @js.native
      def WORKLIGHT_IS_DISCONNECTED: String = js.native
      inline def WORKLIGHT_IS_DISCONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORKLIGHT_IS_DISCONNECTED")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("WL.FailureResponse")
    @js.native
    open class FailureResponse ()
      extends StObject
         with typings.ibmMobilefirst.WL.ResponseBase {
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var errorMsg: String = js.native
      
      /* CompleteClass */
      var headerJSON: StringDictionary[Any] = js.native
      
      /* CompleteClass */
      var invocationContext: Any = js.native
      
      // JSON Object
      /* CompleteClass */
      var readyState: Double = js.native
      
      /* CompleteClass */
      var request: Any = js.native
      
      /* CompleteClass */
      var responseJSON: StringDictionary[Any] = js.native
      
      // JSON Object
      /* CompleteClass */
      var responseText: String = js.native
      
      /* CompleteClass */
      var responseXML: String = js.native
      
      /* CompleteClass */
      var status: Double = js.native
      
      /* CompleteClass */
      var statusText: String = js.native
    }
    
    object Geo {
      
      @JSGlobal("WL.Geo")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDistanceBetweenCoordinates(coordinate1: Coordinate, coordinate2: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceBetweenCoordinates")(coordinate1.asInstanceOf[js.Any], coordinate2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def getDistanceToCircle(coordinate: Coordinate, circle: Circle, options: DistanceOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToCircle")(coordinate.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def getDistanceToPolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: DistanceOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToPolygon")(coordinate.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def isInsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsideCircle")(coordinate.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isInsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsidePolygon")(coordinate.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isOutsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOutsideCircle")(coordinate.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isOutsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOutsidePolygon")(coordinate.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
    
    @JSGlobal("WL.Item")
    @js.native
    open class Item ()
      extends StObject
         with typings.ibmMobilefirst.WL.Item {
      
      /* CompleteClass */
      override def setEnabled(isEnable: String): Unit = js.native
      
      /* CompleteClass */
      override def setImagePath(imagePath: String): Unit = js.native
      
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
    }
    
    object JSONStore {
      
      @JSGlobal("WL.JSONStore")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.JSONStore.JSONStoreInstance")
      @js.native
      open class JSONStoreInstance ()
        extends StObject
           with typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance
      
      /**
        * Creates a query for advanced find. See WL.JSONStore.QueryPart for more information.
        */
      inline def QueryPart(): typings.ibmMobilefirst.WL.JSONStore.QueryPartObj = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryPart")().asInstanceOf[typings.ibmMobilefirst.WL.JSONStore.QueryPartObj]
      
      @JSGlobal("WL.JSONStore.QueryPartObj")
      @js.native
      open class QueryPartObj ()
        extends StObject
           with typings.ibmMobilefirst.WL.JSONStore.QueryPartObj {
        
        /**
          * Add a between clause to a query for advanced find.
          */
        /* CompleteClass */
        override def between(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add an equal to clause to a query for advanced find.
          */
        /* CompleteClass */
        override def equal(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a greater or equal thanclause to a query for advanced find.
          */
        /* CompleteClass */
        override def greaterOrEqualThan(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a greater than clause to a query for advanced find.
          */
        /* CompleteClass */
        override def greaterThan(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add an in clause to a query for advanced find.
          */
        /* CompleteClass */
        override def inside(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a left clause to a query for advanced find.
          */
        /* CompleteClass */
        override def leftLike(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a less or equal than clause to a query for advanced find.
          */
        /* CompleteClass */
        override def lessOrEqualThan(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a less than clause to a query for advanced find.
          */
        /* CompleteClass */
        override def lessThan(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a like clause to a query for advanced find.
          */
        /* CompleteClass */
        override def like(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not between clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notBetween(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not equal to clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notEqual(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not in clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notInside(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not left clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notLeftLike(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not like clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notLike(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a not right clause to a query for advanced find.
          */
        /* CompleteClass */
        override def notRightLike(searchField: Any, value: Any): js.Array[Any] = js.native
        
        /**
          * Add a right clause to a query for advanced find.
          */
        /* CompleteClass */
        override def rightLike(searchField: Any, value: Any): js.Array[Any] = js.native
      }
      
      /**
        * Changes the password for the internal storage. You must have an initialized collection before calling WL.JSONStore.changePassword.
        */
      inline def changePassword(oldPassword: String, newPassword: String, username: String, options: Options): JQueryDeferred[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], username.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryDeferred[Any]]
      
      /**
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      inline def clearPassword(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPassword")().asInstanceOf[Boolean]
      
      /**
        * Locks access to all the collections until WL.JSONStore.init is called.
        */
      inline def closeAll(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[JQueryDeferred[Any]]
      inline def closeAll(options: Options): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
      
      /**
        * Commit a transaction.
        */
      inline def commitTransaction(): JQueryDeferred[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("commitTransaction")().asInstanceOf[JQueryDeferred[Double]]
      
      /**
        * Completely wipes data for all users, destroys the internal storage, and clears security artifacts.
        * @param options is @deprecated
        */
      inline def destroy(username: String): JQueryDeferred[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(username.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Double]]
      inline def destroy(username: String, options: Options): JQueryDeferred[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(username.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryDeferred[Double]]
      
      /**
        * @deprecated since version 6.2.0.
        */
      inline def documentify(id: Double, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("documentify")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * Returns information about the file that is used to persist data in the store. The following key value pairs are returned:
        * name - name of the store
        * size - the total size, in bytes, of the store
        * isEncrypted - boolean that is true when encrypted and false otherwise.
        */
      inline def fileInfo(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileInfo")().asInstanceOf[JQueryDeferred[Any]]
      
      /**
        * Provides an accessor to the collection if the collection exists, otherwise it returns undefined.
        */
      inline def get(collectionName: String): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(collectionName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance]
      
      /**
        * Returns the message that is associated with a JSONStore error code.
        */
      inline def getErrorMessage(errorCode: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(errorCode.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def init(collections: Any): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(collections.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
      inline def init(collections: Any, options: typings.ibmMobilefirst.WL.JSONStore.InitOptions): JQueryDeferred[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(collections.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryDeferred[Any]]
      
      /**
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      inline def initCollection(name: String, searchFields: Any): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("initCollection")(name.asInstanceOf[js.Any], searchFields.asInstanceOf[js.Any])).asInstanceOf[typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance]
      inline def initCollection(name: String, searchFields: Any, options: typings.ibmMobilefirst.WL.JSONStore.InitOptions): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("initCollection")(name.asInstanceOf[js.Any], searchFields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance]
      
      /**
        * Roll back a transaction
        */
      inline def rollbackTransaction(): JQueryDeferred[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rollbackTransaction")().asInstanceOf[JQueryDeferred[Double]]
      
      /**
        * Initiates a transaction
        */
      inline def startTransaction(): JQueryDeferred[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")().asInstanceOf[JQueryDeferred[Double]]
      
      /**
        * Sets the password that is used to generate keys to encrypt data that is stored locally on the device.
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      inline def usePassword(pwd: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usePassword")(pwd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object LocalStorage {
      
      @JSGlobal("WL.LocalStorage")
      @js.native
      val ^ : js.Any = js.native
      
      inline def clear(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
      
      inline def getValue(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def setValue(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
      * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
      */
    @JSGlobal("WL.LogInstance")
    @js.native
    open class LogInstance ()
      extends StObject
         with typings.ibmMobilefirst.WL.LogInstance {
      
      /* CompleteClass */
      override def debug(message: String): Unit = js.native
      
      /* CompleteClass */
      override def error(message: String): Unit = js.native
      
      /* CompleteClass */
      override def fatal(message: String): Unit = js.native
      
      /* CompleteClass */
      override def info(message: String): Unit = js.native
      
      /* CompleteClass */
      override def trace(message: String): Unit = js.native
      
      /* CompleteClass */
      override def warn(message: String): Unit = js.native
    }
    
    @JSGlobal("WL.Logger")
    @js.native
    def Logger: typings.ibmMobilefirst.WL.LoggerObject = js.native
    
    /**
      * Artifact to allow chaining of Logger class as: WL.Logger.ctx({pkg: 'something'}).debug('Hello world');
      */
    @JSGlobal("WL.LoggerObject")
    @js.native
    open class LoggerObject ()
      extends StObject
         with typings.ibmMobilefirst.WL.LoggerObject
    
    inline def Logger_=(x: typings.ibmMobilefirst.WL.LoggerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Logger")(x.asInstanceOf[js.Any])
    
    object NativePage {
      
      @JSGlobal("WL.NativePage")
      @js.native
      val ^ : js.Any = js.native
      
      inline def show(className: String, callback: js.Function1[/* data */ Any, Unit], data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(className.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("WL.Response")
    @js.native
    open class Response ()
      extends StObject
         with typings.ibmMobilefirst.WL.Response {
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var errorMsg: String = js.native
      
      /* CompleteClass */
      override def getAllHeaders(): Headers = js.native
      
      /* CompleteClass */
      override def getHeader(name: Any): String = js.native
      
      /* CompleteClass */
      override def getHeaderNames(): js.Array[String] = js.native
      
      /* CompleteClass */
      var headerJSON: StringDictionary[Any] = js.native
      
      /* CompleteClass */
      var invocationContext: Any = js.native
      
      // JSON Object
      /* CompleteClass */
      var readyState: Double = js.native
      
      /* CompleteClass */
      var request: Any = js.native
      
      /* CompleteClass */
      var responseJSON: StringDictionary[Any] = js.native
      
      // JSON Object
      /* CompleteClass */
      var responseText: String = js.native
      
      /* CompleteClass */
      var responseXML: String = js.native
      
      /* CompleteClass */
      var status: Double = js.native
      
      /* CompleteClass */
      var statusText: String = js.native
    }
    
    @JSGlobal("WL.ResponseBase")
    @js.native
    open class ResponseBase ()
      extends StObject
         with typings.ibmMobilefirst.WL.ResponseBase {
      
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /* CompleteClass */
      var errorMsg: String = js.native
      
      /* CompleteClass */
      var headerJSON: StringDictionary[Any] = js.native
      
      /* CompleteClass */
      var invocationContext: Any = js.native
      
      // JSON Object
      /* CompleteClass */
      var readyState: Double = js.native
      
      /* CompleteClass */
      var request: Any = js.native
      
      /* CompleteClass */
      var responseJSON: StringDictionary[Any] = js.native
      
      // JSON Object
      /* CompleteClass */
      var responseText: String = js.native
      
      /* CompleteClass */
      var responseXML: String = js.native
      
      /* CompleteClass */
      var status: Double = js.native
      
      /* CompleteClass */
      var statusText: String = js.native
    }
    
    object SecurityUtils {
      
      @JSGlobal("WL.SecurityUtils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def base64Decode(input: String): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(input.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def base64Encode(input: String): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(input.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def decrypt(options: DecryptOptions): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def encrypt(options: EncryptOptions): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def keygen(options: KeygenOptions): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def localRandomString(): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("localRandomString")().asInstanceOf[JQueryDeferred[String]]
      inline def localRandomString(bytes: Double): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("localRandomString")(bytes.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
      
      inline def remoteRandomString(): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteRandomString")().asInstanceOf[JQueryDeferred[String]]
      inline def remoteRandomString(bytes: Double): JQueryDeferred[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteRandomString")(bytes.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[String]]
    }
    
    object SimpleDialog {
      
      @JSGlobal("WL.SimpleDialog")
      @js.native
      val ^ : js.Any = js.native
      
      inline def show(title: String, text: String, buttons: js.Array[Button]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(title.asInstanceOf[js.Any], text.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def show(
        title: String,
        text: String,
        buttons: js.Array[Button],
        options: typings.ibmMobilefirst.WL.SimpleDialog.Options
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(title.asInstanceOf[js.Any], text.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    object TabBar {
      
      @JSGlobal("WL.TabBar")
      @js.native
      val ^ : js.Any = js.native
      
      inline def RemoveAllItems(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAllItems")().asInstanceOf[Unit]
      
      inline def addItem(id: String, callback: js.Function, title: String, options: ItemOptions): typings.ibmMobilefirst.WL.TabBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ibmMobilefirst.WL.TabBarItem]
      
      inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
      
      inline def isVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")().asInstanceOf[Boolean]
      
      inline def setEnabled(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @deprecated
        */
      inline def setParentDivId(parentId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setParentDivId")(parentId.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setSelectedItem(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectedItem")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setVisible(isVisible: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisible")(isVisible.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("WL.TabBarItem")
    @js.native
    open class TabBarItem ()
      extends StObject
         with typings.ibmMobilefirst.WL.TabBarItem
    
    object Toast {
      
      @JSGlobal("WL.Toast")
      @js.native
      val ^ : js.Any = js.native
      
      inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
    }
    
    object Trusteer {
      
      @JSGlobal("WL.Trusteer")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getRiskAssessment(
        onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
        onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
      ): AssetmentRisks = (^.asInstanceOf[js.Dynamic].applyDynamic("getRiskAssessment")(onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[AssetmentRisks]
    }
    
    object UserAuth {
      
      @JSGlobal("WL.UserAuth")
      @js.native
      val ^ : js.Any = js.native
      
      inline def deleteCertificate(): JQueryDeferred[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCertificate")().asInstanceOf[JQueryDeferred[Unit]]
      inline def deleteCertificate(provisioningEntity: String): JQueryDeferred[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCertificate")(provisioningEntity.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Unit]]
    }
  }
  
  object WLAuthorizationManager {
    
    @JSGlobal("WLAuthorizationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * AuthorizationPersistencePolicy possible values
      */
    @JSGlobal("WLAuthorizationManager.ALWAYS")
    @js.native
    def ALWAYS: String = js.native
    inline def ALWAYS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALWAYS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("WLAuthorizationManager.NEVER")
    @js.native
    def NEVER: String = js.native
    inline def NEVER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEVER")(x.asInstanceOf[js.Any])
    
    inline def addCachedAuthorizationHeader(request: RequestObject): JQueryDeferred[RequestObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCachedAuthorizationHeader")(request.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[RequestObject]]
    
    inline def getAppIdentity(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppIdentity")().asInstanceOf[JQueryDeferred[Any]]
    
    inline def getAuthorizationScope(responseAuthenticationHeader: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationScope")(responseAuthenticationHeader.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    inline def getCachedAuthorizationHeader(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachedAuthorizationHeader")().asInstanceOf[JQueryDeferred[Any]]
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    inline def getDeviceIdentity(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceIdentity")().asInstanceOf[JQueryDeferred[Any]]
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    inline def getUserIdentity(): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserIdentity")().asInstanceOf[JQueryDeferred[Any]]
    
    inline def isAuthorizationRequired(responseStatus: Double, responseAuthenticationHeader: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAuthorizationRequired")(responseStatus.asInstanceOf[js.Any], responseAuthenticationHeader.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<header, error>()
      */
    inline def obtainAuthorizationHeader(scope: String): JQueryDeferred[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("obtainAuthorizationHeader")(scope.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[Any]]
    
    /**
      * See WLAuthorizarionManager.NEVER and WLAuthorizarionManager.ALWAYS
      */
    inline def setAuthorizationPersistencePolicy(authorizationPersistencePolicy: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAuthorizationPersistencePolicy")(authorizationPersistencePolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("WLResourceRequest")
  @js.native
  open class WLResourceRequest protected ()
    extends StObject
       with typings.ibmMobilefirst.WLResourceRequest {
    def this(url: String, method: String) = this()
    def this(url: String, method: String, timeout: Double) = this()
  }
  object WLResourceRequest {
    
    @JSGlobal("WLResourceRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("WLResourceRequest.CONNECT")
    @js.native
    def CONNECT: String = js.native
    inline def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.DELETE")
    @js.native
    def DELETE: String = js.native
    inline def DELETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.GET")
    @js.native
    def GET: String = js.native
    inline def GET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.HEAD")
    @js.native
    def HEAD: String = js.native
    inline def HEAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEAD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.OPTIONS")
    @js.native
    def OPTIONS: String = js.native
    inline def OPTIONS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.POST")
    @js.native
    def POST: String = js.native
    inline def POST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POST")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.PUT")
    @js.native
    def PUT: String = js.native
    inline def PUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.TRACE")
    @js.native
    def TRACE: String = js.native
    inline def TRACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(x.asInstanceOf[js.Any])
  }
}
