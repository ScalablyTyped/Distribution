package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/AppAccess.html
  */
@JSGlobal("AppAccess")
@js.native
open class AppAccess () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getAllGlobalAppInstances
    * @since AppServer 20210803-133329
    */
  def getAllGlobalAppInstances(): js.Array[GlobalAppInstance] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getAllRunningAppsInChannel
    * @since AppServer 82904
    */
  def getAllRunningAppsInChannel(): js.Array[AppInstance] = js.native
  def getAllRunningAppsInChannel(includeSelf: Boolean): js.Array[AppInstance] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getGlobalAppInstance
    * @since AppServer 20210803-133329
    */
  def getGlobalAppInstance(globalAppId: java.lang.String): GlobalAppInstance | Null = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getOwnInstance
    */
  def getOwnInstance(): AppInstance = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getRunningAppInChannel
    * @since AppServer 82904
    */
  def getRunningAppInChannel(appId: java.lang.String): AppInstance | Null = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_registerGlobalApp
    * @since AppServer 20210803-133329
    */
  def registerGlobalApp(globalAppConfig: GlobalAppConfig): GlobalAppInstance = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_unregisterGlobalApp
    * @since AppServer 20210803-133329
    */
  def unregisterGlobalApp(globalAppId: java.lang.String): GlobalAppInstance | Null = js.native
}
