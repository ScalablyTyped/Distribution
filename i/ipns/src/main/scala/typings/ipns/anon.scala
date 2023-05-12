package typings.ipns

import typings.ipns.distSrcPbIpnsMod.IpnsEntry.ValidityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ipns.ipns/dist/src/pb/ipns.IpnsEntry> */
  trait PartialIpnsEntry extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var sequence: js.UndefOr[js.BigInt] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signatureV2: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var ttl: js.UndefOr[js.BigInt] = js.undefined
    
    var validity: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var validityType: js.UndefOr[ValidityType] = js.undefined
    
    var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialIpnsEntry {
    
    inline def apply(): PartialIpnsEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIpnsEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIpnsEntry] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
      
      inline def setSequence(value: js.BigInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setSignatureV2(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signatureV2", value.asInstanceOf[js.Any])
      
      inline def setSignatureV2Undefined: Self = StObject.set(x, "signatureV2", js.undefined)
      
      inline def setTtl(value: js.BigInt): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValidity(value: js.typedarray.Uint8Array): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
      
      inline def setValidityType(value: ValidityType): Self = StObject.set(x, "validityType", value.asInstanceOf[js.Any])
      
      inline def setValidityTypeUndefined: Self = StObject.set(x, "validityType", js.undefined)
      
      inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
