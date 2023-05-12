package typings.libp2p.anon

import typings.libp2p.distSrcAutonatPbMod.Message.Dial
import typings.libp2p.distSrcAutonatPbMod.Message.DialResponse
import typings.libp2p.distSrcAutonatPbMod.Message.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/autonat/pb.Message> */
trait PartialMessage extends StObject {
  
  var dial: js.UndefOr[Dial] = js.undefined
  
  var dialResponse: js.UndefOr[DialResponse] = js.undefined
  
  var `type`: js.UndefOr[MessageType] = js.undefined
}
object PartialMessage {
  
  inline def apply(): PartialMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessage] (val x: Self) extends AnyVal {
    
    inline def setDial(value: Dial): Self = StObject.set(x, "dial", value.asInstanceOf[js.Any])
    
    inline def setDialResponse(value: DialResponse): Self = StObject.set(x, "dialResponse", value.asInstanceOf[js.Any])
    
    inline def setDialResponseUndefined: Self = StObject.set(x, "dialResponse", js.undefined)
    
    inline def setDialUndefined: Self = StObject.set(x, "dial", js.undefined)
    
    inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
