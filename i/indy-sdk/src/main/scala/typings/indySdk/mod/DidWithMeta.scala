package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidWithMeta extends StObject {
  
  var did: Did
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var tempVerkey: js.UndefOr[Verkey] = js.undefined
  
  var verkey: Verkey
}
object DidWithMeta {
  
  inline def apply(did: Did, verkey: Verkey): DidWithMeta = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidWithMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidWithMeta] (val x: Self) extends AnyVal {
    
    inline def setDid(value: Did): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTempVerkey(value: Verkey): Self = StObject.set(x, "tempVerkey", value.asInstanceOf[js.Any])
    
    inline def setTempVerkeyUndefined: Self = StObject.set(x, "tempVerkey", js.undefined)
    
    inline def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
  }
}
