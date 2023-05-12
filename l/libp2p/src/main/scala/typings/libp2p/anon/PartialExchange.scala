package typings.libp2p.anon

import typings.libp2p.distSrcInsecurePbProtoMod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/insecure/pb/proto.Exchange> */
trait PartialExchange extends StObject {
  
  var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var pubkey: js.UndefOr[PublicKey] = js.undefined
}
object PartialExchange {
  
  inline def apply(): PartialExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialExchange] (val x: Self) extends AnyVal {
    
    inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPubkey(value: PublicKey): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    
    inline def setPubkeyUndefined: Self = StObject.set(x, "pubkey", js.undefined)
  }
}
