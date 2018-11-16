package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/AppAccess.html
	 */
@JSGlobal("AppAccess")
@js.native
class AppAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getAllRunningAppsInChannel
  		 * @since AppServer 82904
  		 */
  def getAllRunningAppsInChannel(): js.Array[AppInstance] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getAllRunningAppsInChannel
  		 * @since AppServer 82904
  		 */
  def getAllRunningAppsInChannel(includeSelf: scala.Boolean): js.Array[AppInstance] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getOwnInstance
  		 */
  def getOwnInstance(): AppInstance = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppAccess.html#method_getRunningAppInChannel
  		 * @since AppServer 82904
  		 */
  def getRunningAppInChannel(appId: java.lang.String): AppInstance | scala.Null = js.native
}

