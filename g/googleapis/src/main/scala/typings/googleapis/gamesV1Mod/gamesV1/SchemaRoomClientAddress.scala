package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the client address when setting up a room.
  */
@js.native
trait SchemaRoomClientAddress extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomClientAddress.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The XMPP address of the client on the Google Games XMPP network.
    */
  var xmppAddress: js.UndefOr[String] = js.native
}

object SchemaRoomClientAddress {
  @scala.inline
  def apply(kind: String = null, xmppAddress: String = null): SchemaRoomClientAddress = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (xmppAddress != null) __obj.updateDynamic("xmppAddress")(xmppAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomClientAddress]
  }
}

