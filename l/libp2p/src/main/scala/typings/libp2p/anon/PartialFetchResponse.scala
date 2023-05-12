package typings.libp2p.anon

import typings.libp2p.distSrcFetchPbProtoMod.FetchResponse.StatusCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/fetch/pb/proto.FetchResponse> */
trait PartialFetchResponse extends StObject {
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var status: js.UndefOr[StatusCode] = js.undefined
}
object PartialFetchResponse {
  
  inline def apply(): PartialFetchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFetchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFetchResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
