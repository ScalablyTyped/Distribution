package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/AppAccess.html
	 */
@JSGlobal("AppAccess")
@js.native
class AppAccess () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getAllRunningAppsInChannel
  		 * @since AppServer 82904
  		 */
  def getAllRunningAppsInChannel(): js.Array[AppInstance] = js.native
  def getAllRunningAppsInChannel(includeSelf: Boolean): js.Array[AppInstance] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getOwnInstance
  		 */
  def getOwnInstance(): AppInstance = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getRunningAppInChannel
  		 * @since AppServer 82904
  		 */
  def getRunningAppInChannel(appId: java.lang.String): AppInstance | Null = js.native
}
