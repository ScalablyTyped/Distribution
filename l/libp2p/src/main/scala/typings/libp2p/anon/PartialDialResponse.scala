package typings.libp2p.anon

import typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/autonat/pb.Message.DialResponse> */
trait PartialDialResponse extends StObject {
  
  var addr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var status: js.UndefOr[ResponseStatus] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object PartialDialResponse {
  
  inline def apply(): PartialDialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDialResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDialResponse] (val x: Self) extends AnyVal {
    
    inline def setAddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setAddrUndefined: Self = StObject.set(x, "addr", js.undefined)
    
    inline def setStatus(value: ResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
