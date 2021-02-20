package typings.ibmMobilefirst

import typings.ibmMobilefirst.WL.App.ActionReceiverCallback
import typings.ibmMobilefirst.WL.App.BackgroundHandler.Handler
import typings.ibmMobilefirst.WL.App.Callback
import typings.ibmMobilefirst.WL.App.Data
import typings.ibmMobilefirst.WL.App.KeepAliveInBackgroundOptions
import typings.ibmMobilefirst.WL.App.OpenURLOptions
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WL {
    
    @JSGlobal("WL")
    @js.native
    val ^ : js.Any = js.native
    
    object Analytics {
      
      @JSGlobal("WL.Analytics.disable")
      @js.native
      def disable(): Unit = js.native
      
      @JSGlobal("WL.Analytics.enable")
      @js.native
      def enable(): Unit = js.native
      
      @JSGlobal("WL.Analytics.log")
      @js.native
      def log(message: String, name: String): Unit = js.native
      
      /**
        * @deprecated since version 6.2. WL.Analytics.restart is now a NOP.
        */
      @JSGlobal("WL.Analytics.restart")
      @js.native
      def restart(): Unit = js.native
      
      @JSGlobal("WL.Analytics.send")
      @js.native
      def send(): Unit = js.native
      
      @JSGlobal("WL.Analytics.state")
      @js.native
      def state(): Unit = js.native
    }
    
    object App {
      
      object BackgroundHandler {
        
        @JSGlobal("WL.App.BackgroundHandler")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("WL.App.BackgroundHandler.defaultIOSBehavior")
        @js.native
        def defaultIOSBehavior: Handler = js.native
        @scala.inline
        def defaultIOSBehavior_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultIOSBehavior")(x.asInstanceOf[js.Any])
        
        /**
          * @deprecated since version 6.0.0
          */
        @JSGlobal("WL.App.BackgroundHandler.hideElements")
        @js.native
        def hideElements: Handler = js.native
        @scala.inline
        def hideElements_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideElements")(x.asInstanceOf[js.Any])
        
        @JSGlobal("WL.App.BackgroundHandler.hideView")
        @js.native
        def hideView: Handler = js.native
        @scala.inline
        def hideView_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideView")(x.asInstanceOf[js.Any])
        
        @JSGlobal("WL.App.BackgroundHandler.setOnAppEnteringBackground")
        @js.native
        def setOnAppEnteringBackground(handler: Handler): Unit = js.native
      }
      
      @JSGlobal("WL.App.addActionReceiver")
      @js.native
      def addActionReceiver(id: String, callback: ActionReceiverCallback): Unit = js.native
      
      /**
        * @deprecate Deprecated.
        */
      @JSGlobal("WL.App.close")
      @js.native
      def close(): Unit = js.native
      
      @JSGlobal("WL.App.copyToClipboard")
      @js.native
      def copyToClipboard(stringToCopy: String): Unit = js.native
      @JSGlobal("WL.App.copyToClipboard")
      @js.native
      def copyToClipboard(stringToCopy: String, callback: Callback): Unit = js.native
      
      @JSGlobal("WL.App.getDeviceLanguage")
      @js.native
      def getDeviceLanguage(): String = js.native
      
      @JSGlobal("WL.App.getDeviceLocale")
      @js.native
      def getDeviceLocale(): String = js.native
      
      /**
        * TODO: declare exception type. (Exceptions that are thrown by the IBM® Worklight® client runtime framework)
        */
      @JSGlobal("WL.App.getErrorMessage")
      @js.native
      def getErrorMessage(exception: js.Any): String = js.native
      
      @JSGlobal("WL.App.hideSplashScreen")
      @js.native
      def hideSplashScreen(): Unit = js.native
      
      @JSGlobal("WL.App.openURL")
      @js.native
      def openURL(url: String): Unit = js.native
      @JSGlobal("WL.App.openURL")
      @js.native
      def openURL(url: String, target: js.UndefOr[scala.Nothing], options: OpenURLOptions): Unit = js.native
      @JSGlobal("WL.App.openURL")
      @js.native
      def openURL(url: String, target: String): Unit = js.native
      @JSGlobal("WL.App.openURL")
      @js.native
      def openURL(url: String, target: String, options: OpenURLOptions): Unit = js.native
      
      @JSGlobal("WL.App.overrideBackButton")
      @js.native
      def overrideBackButton(callback: Callback): Unit = js.native
      
      @JSGlobal("WL.App.removeActionReceiver")
      @js.native
      def removeActionReceiver(id: String): Unit = js.native
      
      /**
        * @deprecated since version 6.0.0
        */
      @JSGlobal("WL.App.resetBackButton")
      @js.native
      def resetBackButton(): Unit = js.native
      
      @JSGlobal("WL.App.sendActionToNative")
      @js.native
      def sendActionToNative(action: String): Unit = js.native
      @JSGlobal("WL.App.sendActionToNative")
      @js.native
      def sendActionToNative(action: String, data: Data): Unit = js.native
      
      @JSGlobal("WL.App.setKeepAliveInBackground")
      @js.native
      def setKeepAliveInBackground(enabled: Boolean): Unit = js.native
      @JSGlobal("WL.App.setKeepAliveInBackground")
      @js.native
      def setKeepAliveInBackground(enabled: Boolean, options: KeepAliveInBackgroundOptions): Unit = js.native
      
      @JSGlobal("WL.App.showSplashScreen")
      @js.native
      def showSplashScreen(): Unit = js.native
    }
    
    object AppProperty {
      
      @JSGlobal("WL.AppProperty")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.AppProperty.AIR_ICON_128x128_PATH")
      @js.native
      def AIRICON128x128PATH: String = js.native
      
      @scala.inline
      def AIRICON128x128PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIR_ICON_128x128_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.AIR_ICON_16x16_PATH")
      @js.native
      def AIRICON16x16PATH: String = js.native
      
      @scala.inline
      def AIRICON16x16PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIR_ICON_16x16_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_DISPLAY_NAME")
      @js.native
      def APP_DISPLAY_NAME: String = js.native
      @scala.inline
      def APP_DISPLAY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_DISPLAY_NAME")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_LOGIN_TYPE")
      @js.native
      def APP_LOGIN_TYPE: String = js.native
      @scala.inline
      def APP_LOGIN_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_LOGIN_TYPE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.APP_VERSION")
      @js.native
      def APP_VERSION: String = js.native
      @scala.inline
      def APP_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_VERSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.DOWNLOAD_APP_LINK")
      @js.native
      def DOWNLOAD_APP_LINK: String = js.native
      @scala.inline
      def DOWNLOAD_APP_LINK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWNLOAD_APP_LINK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.LATEST_VERSION")
      @js.native
      def LATEST_VERSION: String = js.native
      @scala.inline
      def LATEST_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LATEST_VERSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.MAIN_FILE_PATH")
      @js.native
      def MAIN_FILE_PATH: String = js.native
      @scala.inline
      def MAIN_FILE_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN_FILE_PATH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.SHOW_IN_TASKBAR")
      @js.native
      def SHOW_IN_TASKBAR: String = js.native
      @scala.inline
      def SHOW_IN_TASKBAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_IN_TASKBAR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.AppProperty.THUMBNAIL_IMAGE_URL")
      @js.native
      def THUMBNAIL_IMAGE_URL: String = js.native
      @scala.inline
      def THUMBNAIL_IMAGE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBNAIL_IMAGE_URL")(x.asInstanceOf[js.Any])
    }
    
    object Badge {
      
      @JSGlobal("WL.Badge.setNumber")
      @js.native
      def setNumber(badgeNumber: Double): Unit = js.native
    }
    
    @JSGlobal("WL.BusyIndicator")
    @js.native
    class BusyIndicator ()
      extends typings.ibmMobilefirst.WL.BusyIndicator {
      def this(containerId: String) = this()
      def this(containerId: js.UndefOr[scala.Nothing], options: typings.ibmMobilefirst.WL.BusyIndicator) = this()
      def this(containerId: String, options: typings.ibmMobilefirst.WL.BusyIndicator) = this()
    }
    
    object Client {
      
      @JSGlobal("WL.Client.AbstractChallengeHandler")
      @js.native
      class AbstractChallengeHandler ()
        extends typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler
      
      @JSGlobal("WL.Client.addGlobalHeader")
      @js.native
      def addGlobalHeader(headerName: String, headerValue: String): Unit = js.native
      
      @JSGlobal("WL.Client.checkForDirectUpdate")
      @js.native
      def checkForDirectUpdate(options: Options): Unit = js.native
      
      @JSGlobal("WL.Client.clearSharedToken")
      @js.native
      def clearSharedToken(`object`: SharedTokenObject): JQueryDeferred[_] = js.native
      
      @JSGlobal("WL.Client.close")
      @js.native
      def close(): Unit = js.native
      
      @JSGlobal("WL.Client.connect")
      @js.native
      def connect(): Unit = js.native
      @JSGlobal("WL.Client.connect")
      @js.native
      def connect(options: ConnectOptions): Unit = js.native
      
      @JSGlobal("WL.Client.createChallengeHandler")
      @js.native
      def createChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
      
      @JSGlobal("WL.Client.createProvisioningChallengeHandler")
      @js.native
      def createProvisioningChallengeHandler(realmName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
      
      @JSGlobal("WL.Client.createWLChallengeHandler")
      @js.native
      def createWLChallengeHandler(realName: String): typings.ibmMobilefirst.WL.Client.AbstractChallengeHandler = js.native
      
      @JSGlobal("WL.Client.deleteUserPref")
      @js.native
      def deleteUserPref(key: String): Unit = js.native
      @JSGlobal("WL.Client.deleteUserPref")
      @js.native
      def deleteUserPref(key: String, options: Options): Unit = js.native
      
      /**
        * See WL.AppProperty for possible results
        */
      @JSGlobal("WL.Client.getAppProperty")
      @js.native
      def getAppProperty(property: js.Any): js.Any = js.native
      
      /**
        * See WL.Environment for possible results
        */
      @JSGlobal("WL.Client.getEnvironment")
      @js.native
      def getEnvironment(): String = js.native
      
      @JSGlobal("WL.Client.getLanguage")
      @js.native
      def getLanguage(): String = js.native
      
      @JSGlobal("WL.Client.getLastAccessToken")
      @js.native
      def getLastAccessToken(): String = js.native
      @JSGlobal("WL.Client.getLastAccessToken")
      @js.native
      def getLastAccessToken(scope: String): String = js.native
      
      @JSGlobal("WL.Client.getLoginName")
      @js.native
      def getLoginName(realmName: String): String = js.native
      
      /**
        * @deprecated since version 7.0
        */
      @JSGlobal("WL.Client.getRequiredAccessTokenScope")
      @js.native
      def getRequiredAccessTokenScope(status: Double, header: String): String = js.native
      
      @JSGlobal("WL.Client.getSharedToken")
      @js.native
      def getSharedToken(`object`: SharedTokenObject): JQueryDeferred[_] = js.native
      
      @JSGlobal("WL.Client.getUserInfo")
      @js.native
      def getUserInfo(realm: String, key: String): js.Any = js.native
      
      @JSGlobal("WL.Client.getUserName")
      @js.native
      def getUserName(realm: js.Any): String = js.native
      
      @JSGlobal("WL.Client.getUserPref")
      @js.native
      def getUserPref(key: js.Any): js.Any = js.native
      
      @JSGlobal("WL.Client.hasUserPref")
      @js.native
      def hasUserPref(key: js.Any): Boolean = js.native
      
      @JSGlobal("WL.Client.init")
      @js.native
      def init(options: InitOptions): Unit = js.native
      
      @JSGlobal("WL.Client.invokeProcedure")
      @js.native
      def invokeProcedure(invocationData: ProcedureInvocationData): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = js.native
      @JSGlobal("WL.Client.invokeProcedure")
      @js.native
      def invokeProcedure(invocationData: ProcedureInvocationData, options: ProcedureInvocationOptions): JQueryDeferred[typings.ibmMobilefirst.WL.Response] = js.native
      
      /**
        * @deprecated since version 4.1.3. Use WL.Device.getNetworkInfo instead.
        */
      @JSGlobal("WL.Client.isConnected")
      @js.native
      def isConnected(): Unit = js.native
      
      @JSGlobal("WL.Client.isUserAuthenticated")
      @js.native
      def isUserAuthenticated(realm: String): Boolean = js.native
      
      /**
        * @deprecated since version 7.0. Use WL.Logger instead.
        */
      @JSGlobal("WL.Client.logActivity")
      @js.native
      def logActivity(activityType: String): Unit = js.native
      
      @JSGlobal("WL.Client.login")
      @js.native
      def login(realm: String): Unit = js.native
      @JSGlobal("WL.Client.login")
      @js.native
      def login(realm: String, options: Options): Unit = js.native
      
      @JSGlobal("WL.Client.logout")
      @js.native
      def logout(realm: String): Unit = js.native
      @JSGlobal("WL.Client.logout")
      @js.native
      def logout(realm: String, options: Options): Unit = js.native
      
      @JSGlobal("WL.Client.minimize")
      @js.native
      def minimize(): Unit = js.native
      
      /**
        * @deprecated since version 7.0
        */
      @JSGlobal("WL.Client.obtainAccessToken")
      @js.native
      def obtainAccessToken(
        scope: String,
        onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
        onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
      ): Unit = js.native
      
      @JSGlobal("WL.Client.purgeEventTransmissionBuffer")
      @js.native
      def purgeEventTransmissionBuffer(): Unit = js.native
      
      @JSGlobal("WL.Client.reloadApp")
      @js.native
      def reloadApp(): Unit = js.native
      
      @JSGlobal("WL.Client.removeGlobalHeader")
      @js.native
      def removeGlobalHeader(headerName: String): Unit = js.native
      
      @JSGlobal("WL.Client.setEventTransmissionPolicy")
      @js.native
      def setEventTransmissionPolicy(policy: EventTransmissionPolicy): Unit = js.native
      
      @JSGlobal("WL.Client.setHeartBeatInterval")
      @js.native
      def setHeartBeatInterval(interval: Double): Unit = js.native
      
      @JSGlobal("WL.Client.setSharedToken")
      @js.native
      def setSharedToken(token: SharedTokenObject): Unit = js.native
      
      @JSGlobal("WL.Client.setUserPref")
      @js.native
      def setUserPref(key: String, value: String): Unit = js.native
      @JSGlobal("WL.Client.setUserPref")
      @js.native
      def setUserPref(key: String, value: String, options: Options): Unit = js.native
      
      @JSGlobal("WL.Client.setUserPrefs")
      @js.native
      def setUserPrefs(userPrefsHash: UserPreferences): Unit = js.native
      @JSGlobal("WL.Client.setUserPrefs")
      @js.native
      def setUserPrefs(userPrefsHash: UserPreferences, options: Options): Unit = js.native
      
      @JSGlobal("WL.Client.transmitEvent")
      @js.native
      def transmitEvent(event: js.Any): Unit = js.native
      @JSGlobal("WL.Client.transmitEvent")
      @js.native
      def transmitEvent(event: js.Any, immediate: Boolean): Unit = js.native
      
      @JSGlobal("WL.Client.updateUserInfo")
      @js.native
      def updateUserInfo(options: Options): Unit = js.native
    }
    
    object Device {
      
      @JSGlobal("WL.Device.getNetworkInfo")
      @js.native
      def getNetworkInfo(callback: js.Function1[/* networkInfo */ NetworkInfo, Unit]): Unit = js.native
    }
    
    object EncryptedCache {
      
      @JSGlobal("WL.EncryptedCache")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.EncryptedCache.ERROR_COULD_NOT_GENERATE_KEY")
      @js.native
      def ERROR_COULD_NOT_GENERATE_KEY: Double = js.native
      @scala.inline
      def ERROR_COULD_NOT_GENERATE_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_COULD_NOT_GENERATE_KEY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_CREDENTIALS_MISMATCH")
      @js.native
      def ERROR_CREDENTIALS_MISMATCH: Double = js.native
      @scala.inline
      def ERROR_CREDENTIALS_MISMATCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CREDENTIALS_MISMATCH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_CLOSED")
      @js.native
      def ERROR_EOC_CLOSED: Double = js.native
      @scala.inline
      def ERROR_EOC_CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_CLOSED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_DELETED")
      @js.native
      def ERROR_EOC_DELETED: Double = js.native
      @scala.inline
      def ERROR_EOC_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_DELETED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_EOC_TO_BE_DELETED")
      @js.native
      def ERROR_EOC_TO_BE_DELETED: Double = js.native
      @scala.inline
      def ERROR_EOC_TO_BE_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_EOC_TO_BE_DELETED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_INVALID_PARAMETER")
      @js.native
      def ERROR_INVALID_PARAMETER: Double = js.native
      @scala.inline
      def ERROR_INVALID_PARAMETER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_INVALID_PARAMETER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_KEY_CREATION_IN_PROGRESS")
      @js.native
      def ERROR_KEY_CREATION_IN_PROGRESS: Double = js.native
      @scala.inline
      def ERROR_KEY_CREATION_IN_PROGRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_KEY_CREATION_IN_PROGRESS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_LOCAL_STORAGE_NOT_SUPPORTED")
      @js.native
      def ERROR_LOCAL_STORAGE_NOT_SUPPORTED: Double = js.native
      @scala.inline
      def ERROR_LOCAL_STORAGE_NOT_SUPPORTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_LOCAL_STORAGE_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_MIGRATION")
      @js.native
      def ERROR_MIGRATION: Double = js.native
      @scala.inline
      def ERROR_MIGRATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MIGRATION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_NO_EOC")
      @js.native
      def ERROR_NO_EOC: Double = js.native
      @scala.inline
      def ERROR_NO_EOC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_EOC")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_NO_SUCH_KEY")
      @js.native
      def ERROR_NO_SUCH_KEY: Double = js.native
      @scala.inline
      def ERROR_NO_SUCH_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_NO_SUCH_KEY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE")
      @js.native
      def ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE: Double = js.native
      @scala.inline
      def ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_UNKNOWN")
      @js.native
      def ERROR_UNKNOWN: Double = js.native
      @scala.inline
      def ERROR_UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_UNKNOWN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.ERROR_UNSAFE_CREDENTIALS")
      @js.native
      def ERROR_UNSAFE_CREDENTIALS: Double = js.native
      @scala.inline
      def ERROR_UNSAFE_CREDENTIALS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_UNSAFE_CREDENTIALS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.OK")
      @js.native
      def OK: Double = js.native
      @scala.inline
      def OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.EncryptedCache.close")
      @js.native
      def close(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
      
      @JSGlobal("WL.EncryptedCache.destroy")
      @js.native
      def destroy(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
      
      @JSGlobal("WL.EncryptedCache.open")
      @js.native
      def open(
        credentials: String,
        createIfNone: Boolean,
        successHandler: StatusHandler,
        failureHandler: StatusHandler
      ): Unit = js.native
      
      @JSGlobal("WL.EncryptedCache.read")
      @js.native
      def read(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
      
      @JSGlobal("WL.EncryptedCache.remove")
      @js.native
      def remove(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
      
      @JSGlobal("WL.EncryptedCache.write")
      @js.native
      def write(key: String, value: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
    }
    
    object Environment {
      
      @JSGlobal("WL.Environment")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.Environment.ADOBE_AIR")
      @js.native
      def ADOBE_AIR: String = js.native
      @scala.inline
      def ADOBE_AIR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADOBE_AIR")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.ANDROID")
      @js.native
      def ANDROID: String = js.native
      @scala.inline
      def ANDROID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.EMBEDDED")
      @js.native
      def EMBEDDED: String = js.native
      @scala.inline
      def EMBEDDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMBEDDED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.IPAD")
      @js.native
      def IPAD: String = js.native
      @scala.inline
      def IPAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPAD")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.IPHONE")
      @js.native
      def IPHONE: String = js.native
      @scala.inline
      def IPHONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPHONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.MOBILE_WEB")
      @js.native
      def MOBILE_WEB: String = js.native
      @scala.inline
      def MOBILE_WEB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOBILE_WEB")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.PREVIEW")
      @js.native
      def PREVIEW: String = js.native
      @scala.inline
      def PREVIEW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREVIEW")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.WINDOWS8")
      @js.native
      def WINDOWS8: String = js.native
      @scala.inline
      def WINDOWS8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS8")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Environment.WINDOWS_PHONE_8")
      @js.native
      def WINDOWS_PHONE_8: String = js.native
      @scala.inline
      def WINDOWS_PHONE_8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS_PHONE_8")(x.asInstanceOf[js.Any])
    }
    
    object Events {
      
      @JSGlobal("WL.Events")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("WL.Events.WORKLIGHT_IS_CONNECTED")
      @js.native
      def WORKLIGHT_IS_CONNECTED: String = js.native
      @scala.inline
      def WORKLIGHT_IS_CONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORKLIGHT_IS_CONNECTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("WL.Events.WORKLIGHT_IS_DISCONNECTED")
      @js.native
      def WORKLIGHT_IS_DISCONNECTED: String = js.native
      @scala.inline
      def WORKLIGHT_IS_DISCONNECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORKLIGHT_IS_DISCONNECTED")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("WL.FailureResponse")
    @js.native
    class FailureResponse ()
      extends typings.ibmMobilefirst.WL.ResponseBase
    
    object Geo {
      
      @JSGlobal("WL.Geo.getDistanceBetweenCoordinates")
      @js.native
      def getDistanceBetweenCoordinates(coordinate1: Coordinate, coordinate2: Coordinate): Double = js.native
      
      @JSGlobal("WL.Geo.getDistanceToCircle")
      @js.native
      def getDistanceToCircle(coordinate: Coordinate, circle: Circle, options: DistanceOptions): Double = js.native
      
      @JSGlobal("WL.Geo.getDistanceToPolygon")
      @js.native
      def getDistanceToPolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: DistanceOptions): Double = js.native
      
      @JSGlobal("WL.Geo.isInsideCircle")
      @js.native
      def isInsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
      
      @JSGlobal("WL.Geo.isInsidePolygon")
      @js.native
      def isInsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
      
      @JSGlobal("WL.Geo.isOutsideCircle")
      @js.native
      def isOutsideCircle(coordinate: Coordinate, circle: Circle, options: InsideOutsideOptions): Boolean = js.native
      
      @JSGlobal("WL.Geo.isOutsidePolygon")
      @js.native
      def isOutsidePolygon(coordinate: Coordinate, polygon: js.Array[Coordinate], options: InsideOutsideOptions): Boolean = js.native
    }
    
    @JSGlobal("WL.Item")
    @js.native
    class Item ()
      extends typings.ibmMobilefirst.WL.Item
    
    object JSONStore {
      
      @JSGlobal("WL.JSONStore.JSONStoreInstance")
      @js.native
      class JSONStoreInstance ()
        extends typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance
      
      /**
        * Creates a query for advanced find. See WL.JSONStore.QueryPart for more information.
        */
      @JSGlobal("WL.JSONStore.QueryPart")
      @js.native
      def QueryPart(): typings.ibmMobilefirst.WL.JSONStore.QueryPartObj = js.native
      
      @JSGlobal("WL.JSONStore.QueryPartObj")
      @js.native
      class QueryPartObj ()
        extends typings.ibmMobilefirst.WL.JSONStore.QueryPartObj
      
      /**
        * Changes the password for the internal storage. You must have an initialized collection before calling WL.JSONStore.changePassword.
        */
      @JSGlobal("WL.JSONStore.changePassword")
      @js.native
      def changePassword(oldPassword: String, newPassword: String, username: String, options: Options): JQueryDeferred[_] = js.native
      
      /**
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      @JSGlobal("WL.JSONStore.clearPassword")
      @js.native
      def clearPassword(): Boolean = js.native
      
      /**
        * Locks access to all the collections until WL.JSONStore.init is called.
        */
      @JSGlobal("WL.JSONStore.closeAll")
      @js.native
      def closeAll(): JQueryDeferred[_] = js.native
      @JSGlobal("WL.JSONStore.closeAll")
      @js.native
      def closeAll(options: Options): JQueryDeferred[_] = js.native
      
      /**
        * Commit a transaction.
        */
      @JSGlobal("WL.JSONStore.commitTransaction")
      @js.native
      def commitTransaction(): JQueryDeferred[Double] = js.native
      
      /**
        * Completely wipes data for all users, destroys the internal storage, and clears security artifacts.
        * @parameters options is @deprecated
        */
      @JSGlobal("WL.JSONStore.destroy")
      @js.native
      def destroy(username: String): JQueryDeferred[Double] = js.native
      @JSGlobal("WL.JSONStore.destroy")
      @js.native
      def destroy(username: String, options: Options): JQueryDeferred[Double] = js.native
      
      /**
        * @deprecated since version 6.2.0.
        */
      @JSGlobal("WL.JSONStore.documentify")
      @js.native
      def documentify(id: Double, data: js.Any): js.Any = js.native
      
      /**
        * Returns information about the file that is used to persist data in the store. The following key value pairs are returned:
        * name - name of the store
        * size - the total size, in bytes, of the store
        * isEncrypted - boolean that is true when encrypted and false otherwise.
        */
      @JSGlobal("WL.JSONStore.fileInfo")
      @js.native
      def fileInfo(): JQueryDeferred[_] = js.native
      
      /**
        * Provides an accessor to the collection if the collection exists, otherwise it returns undefined.
        */
      @JSGlobal("WL.JSONStore.get")
      @js.native
      def get(collectionName: String): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
      
      /**
        * Returns the message that is associated with a JSONStore error code.
        */
      @JSGlobal("WL.JSONStore.getErrorMessage")
      @js.native
      def getErrorMessage(errorCode: Double): String = js.native
      
      @JSGlobal("WL.JSONStore.init")
      @js.native
      def init(collections: js.Any): JQueryDeferred[_] = js.native
      @JSGlobal("WL.JSONStore.init")
      @js.native
      def init(collections: js.Any, options: typings.ibmMobilefirst.WL.JSONStore.InitOptions): JQueryDeferred[_] = js.native
      
      /**
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      @JSGlobal("WL.JSONStore.initCollection")
      @js.native
      def initCollection(name: String, searchFields: js.Any): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
      @JSGlobal("WL.JSONStore.initCollection")
      @js.native
      def initCollection(name: String, searchFields: js.Any, options: typings.ibmMobilefirst.WL.JSONStore.InitOptions): typings.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
      
      /**
        * Roll back a transaction
        */
      @JSGlobal("WL.JSONStore.rollbackTransaction")
      @js.native
      def rollbackTransaction(): JQueryDeferred[Double] = js.native
      
      /**
        * Initiates a transaction
        */
      @JSGlobal("WL.JSONStore.startTransaction")
      @js.native
      def startTransaction(): JQueryDeferred[Double] = js.native
      
      /**
        * Sets the password that is used to generate keys to encrypt data that is stored locally on the device.
        * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
        */
      @JSGlobal("WL.JSONStore.usePassword")
      @js.native
      def usePassword(pwd: String): Boolean = js.native
    }
    
    object LocalStorage {
      
      @JSGlobal("WL.LocalStorage.clear")
      @js.native
      def clear(key: String): Unit = js.native
      
      @JSGlobal("WL.LocalStorage.clearAll")
      @js.native
      def clearAll(): Unit = js.native
      
      @JSGlobal("WL.LocalStorage.getValue")
      @js.native
      def getValue(key: String): String = js.native
      
      @JSGlobal("WL.LocalStorage.setValue")
      @js.native
      def setValue(key: String, value: String): Unit = js.native
    }
    
    /**
      * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
      * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
      */
    @JSGlobal("WL.LogInstance")
    @js.native
    class LogInstance ()
      extends typings.ibmMobilefirst.WL.LogInstance
    
    @JSGlobal("WL.Logger")
    @js.native
    def Logger: typings.ibmMobilefirst.WL.LoggerObject = js.native
    
    /**
      * Artifact to allow chaining of Logger class as: WL.Logger.ctx({pkg: 'something'}).debug('Hello world');
      */
    @JSGlobal("WL.LoggerObject")
    @js.native
    class LoggerObject ()
      extends typings.ibmMobilefirst.WL.LoggerObject
    
    @scala.inline
    def Logger_=(x: typings.ibmMobilefirst.WL.LoggerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Logger")(x.asInstanceOf[js.Any])
    
    object NativePage {
      
      @JSGlobal("WL.NativePage.show")
      @js.native
      def show(className: String, callback: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = js.native
    }
    
    @JSGlobal("WL.Response")
    @js.native
    class Response ()
      extends typings.ibmMobilefirst.WL.Response
    
    @JSGlobal("WL.ResponseBase")
    @js.native
    class ResponseBase ()
      extends typings.ibmMobilefirst.WL.ResponseBase
    
    object SecurityUtils {
      
      @JSGlobal("WL.SecurityUtils.base64Decode")
      @js.native
      def base64Decode(input: String): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.base64Encode")
      @js.native
      def base64Encode(input: String): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.decrypt")
      @js.native
      def decrypt(options: DecryptOptions): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.encrypt")
      @js.native
      def encrypt(options: EncryptOptions): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.keygen")
      @js.native
      def keygen(options: KeygenOptions): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.localRandomString")
      @js.native
      def localRandomString(): JQueryDeferred[String] = js.native
      @JSGlobal("WL.SecurityUtils.localRandomString")
      @js.native
      def localRandomString(bytes: Double): JQueryDeferred[String] = js.native
      
      @JSGlobal("WL.SecurityUtils.remoteRandomString")
      @js.native
      def remoteRandomString(): JQueryDeferred[String] = js.native
      @JSGlobal("WL.SecurityUtils.remoteRandomString")
      @js.native
      def remoteRandomString(bytes: Double): JQueryDeferred[String] = js.native
    }
    
    object SimpleDialog {
      
      @JSGlobal("WL.SimpleDialog.show")
      @js.native
      def show(title: String, text: String, buttons: js.Array[Button]): Unit = js.native
      @JSGlobal("WL.SimpleDialog.show")
      @js.native
      def show(
        title: String,
        text: String,
        buttons: js.Array[Button],
        options: typings.ibmMobilefirst.WL.SimpleDialog.Options
      ): Unit = js.native
    }
    
    object TabBar {
      
      @JSGlobal("WL.TabBar.RemoveAllItems")
      @js.native
      def RemoveAllItems(): Unit = js.native
      
      @JSGlobal("WL.TabBar.addItem")
      @js.native
      def addItem(id: String, callback: js.Function, title: String, options: ItemOptions): typings.ibmMobilefirst.WL.TabBarItem = js.native
      
      @JSGlobal("WL.TabBar.init")
      @js.native
      def init(): Unit = js.native
      
      @JSGlobal("WL.TabBar.isVisible")
      @js.native
      def isVisible(): Boolean = js.native
      
      @JSGlobal("WL.TabBar.setEnabled")
      @js.native
      def setEnabled(isEnabled: Boolean): Unit = js.native
      
      /**
        * @deprecated
        */
      @JSGlobal("WL.TabBar.setParentDivId")
      @js.native
      def setParentDivId(parentId: String): Unit = js.native
      
      @JSGlobal("WL.TabBar.setSelectedItem")
      @js.native
      def setSelectedItem(id: String): Unit = js.native
      
      @JSGlobal("WL.TabBar.setVisible")
      @js.native
      def setVisible(isVisible: Boolean): Unit = js.native
    }
    
    @JSGlobal("WL.TabBarItem")
    @js.native
    class TabBarItem ()
      extends typings.ibmMobilefirst.WL.TabBarItem
    
    object Toast {
      
      @JSGlobal("WL.Toast.show")
      @js.native
      def show(): Unit = js.native
    }
    
    object Trusteer {
      
      @JSGlobal("WL.Trusteer.getRiskAssessment")
      @js.native
      def getRiskAssessment(
        onSuccess: ResponseHandler[typings.ibmMobilefirst.WL.Response],
        onFailure: ResponseHandler[typings.ibmMobilefirst.WL.FailureResponse]
      ): AssetmentRisks = js.native
    }
    
    object UserAuth {
      
      @JSGlobal("WL.UserAuth.deleteCertificate")
      @js.native
      def deleteCertificate(): JQueryDeferred[Unit] = js.native
      @JSGlobal("WL.UserAuth.deleteCertificate")
      @js.native
      def deleteCertificate(provisioningEntity: String): JQueryDeferred[Unit] = js.native
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
    @scala.inline
    def ALWAYS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALWAYS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("WLAuthorizationManager.NEVER")
    @js.native
    def NEVER: String = js.native
    @scala.inline
    def NEVER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEVER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("WLAuthorizationManager.addCachedAuthorizationHeader")
    @js.native
    def addCachedAuthorizationHeader(request: RequestObject): JQueryDeferred[RequestObject] = js.native
    
    @JSGlobal("WLAuthorizationManager.getAppIdentity")
    @js.native
    def getAppIdentity(): JQueryDeferred[_] = js.native
    
    @JSGlobal("WLAuthorizationManager.getAuthorizationScope")
    @js.native
    def getAuthorizationScope(responseAuthenticationHeader: String): String = js.native
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    @JSGlobal("WLAuthorizationManager.getCachedAuthorizationHeader")
    @js.native
    def getCachedAuthorizationHeader(): JQueryDeferred[_] = js.native
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    @JSGlobal("WLAuthorizationManager.getDeviceIdentity")
    @js.native
    def getDeviceIdentity(): JQueryDeferred[_] = js.native
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
      */
    @JSGlobal("WLAuthorizationManager.getUserIdentity")
    @js.native
    def getUserIdentity(): JQueryDeferred[_] = js.native
    
    @JSGlobal("WLAuthorizationManager.isAuthorizationRequired")
    @js.native
    def isAuthorizationRequired(responseStatus: Double, responseAuthenticationHeader: String): Boolean = js.native
    
    /**
      * TODO: Set Promise types. Should be something like: JQueryDeferred<header, error>()
      */
    @JSGlobal("WLAuthorizationManager.obtainAuthorizationHeader")
    @js.native
    def obtainAuthorizationHeader(scope: String): JQueryDeferred[_] = js.native
    
    /**
      * See WLAuthorizarionManager.NEVER and WLAuthorizarionManager.ALWAYS
      */
    @JSGlobal("WLAuthorizationManager.setAuthorizationPersistencePolicy")
    @js.native
    def setAuthorizationPersistencePolicy(authorizationPersistencePolicy: String): Unit = js.native
  }
  
  @JSGlobal("WLResourceRequest")
  @js.native
  class WLResourceRequest protected ()
    extends typings.ibmMobilefirst.WLResourceRequest {
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
    @scala.inline
    def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.DELETE")
    @js.native
    def DELETE: String = js.native
    @scala.inline
    def DELETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.GET")
    @js.native
    def GET: String = js.native
    @scala.inline
    def GET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.HEAD")
    @js.native
    def HEAD: String = js.native
    @scala.inline
    def HEAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEAD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.OPTIONS")
    @js.native
    def OPTIONS: String = js.native
    @scala.inline
    def OPTIONS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.POST")
    @js.native
    def POST: String = js.native
    @scala.inline
    def POST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POST")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.PUT")
    @js.native
    def PUT: String = js.native
    @scala.inline
    def PUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("WLResourceRequest.TRACE")
    @js.native
    def TRACE: String = js.native
    @scala.inline
    def TRACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(x.asInstanceOf[js.Any])
  }
}
