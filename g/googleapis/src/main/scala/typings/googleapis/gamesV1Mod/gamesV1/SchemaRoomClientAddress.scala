package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the client address when setting up a room.
  */
@js.native
trait SchemaRoomClientAddress extends StObject {
  
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
  implicit class SchemaRoomClientAddressMutableBuilder[Self <: SchemaRoomClientAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setXmppAddress(value: String): Self = StObject.set(x, "xmppAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmppAddressUndefined: Self = StObject.set(x, "xmppAddress", js.undefined)
  }
}
