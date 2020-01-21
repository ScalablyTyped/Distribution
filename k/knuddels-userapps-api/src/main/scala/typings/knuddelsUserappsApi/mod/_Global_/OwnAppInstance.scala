package typings.knuddelsUserappsApi.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/OwnAppInstance.html
	 */
@JSGlobal("OwnAppInstance")
@js.native
class OwnAppInstance () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/OwnAppInstance.html#method_getOnlineUsers
  		 * @since AppServer 82560
  		 */
  def getOnlineUsers(otherAppInstance: AppInstance, userType: UserType*): js.Array[User] = js.native
}

