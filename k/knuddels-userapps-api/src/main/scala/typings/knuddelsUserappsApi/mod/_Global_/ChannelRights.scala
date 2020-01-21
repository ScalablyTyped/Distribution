package typings.knuddelsUserappsApi.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html
	 */
@JSGlobal("ChannelRights")
@js.native
class ChannelRights () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelModerators
  		 */
  def getChannelModerators(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelOwners
  		 */
  def getChannelOwners(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getEventModerators
  		 */
  def getEventModerators(): js.Array[User] = js.native
}

