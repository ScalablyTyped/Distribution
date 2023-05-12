package typings.libp2p.anon

import typings.libp2p.distSrcInsecurePbProtoMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/insecure/pb/proto.PublicKey> */
trait PartialPublicKey extends StObject {
  
  var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var Type: js.UndefOr[KeyType] = js.undefined
}
object PartialPublicKey {
  
  inline def apply(): PartialPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPublicKey] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
