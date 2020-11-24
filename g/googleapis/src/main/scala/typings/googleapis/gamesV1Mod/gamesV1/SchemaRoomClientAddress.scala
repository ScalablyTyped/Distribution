package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaRoomClientAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomClientAddress]
  }
  
  @scala.inline
  implicit class SchemaRoomClientAddressOps[Self <: SchemaRoomClientAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setXmppAddress(value: String): Self = this.set("xmppAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmppAddress: Self = this.set("xmppAddress", js.undefined)
  }
}
