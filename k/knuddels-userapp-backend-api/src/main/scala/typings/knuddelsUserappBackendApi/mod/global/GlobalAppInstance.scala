package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html
  * @since AppServer 20210803-133329
  */
@JSGlobal("GlobalAppInstance")
@js.native
open class GlobalAppInstance () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_closeActiveSessions
    */
  def closeActiveSessions(): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_getActiveSession
    */
  def getActiveSession(userId: Double): AppContentSession | Null = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_getActiveSessions
    */
  def getActiveSessions(): js.Array[AppContentSession] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_getAppConfig
    */
  def getAppConfig(): GlobalAppConfig = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_getOpenSlashCommand
    */
  def getOpenSlashCommand(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppInstance.html#method_setAppConfig
    */
  def setAppConfig(appConfig: GlobalAppConfig): Unit = js.native
}
