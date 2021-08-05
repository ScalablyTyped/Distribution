package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRecordSet extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#resourceRecordSet&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaResourceRecordSet {
  
  inline def apply(): SchemaResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecordSet]
  }
  
  extension [Self <: SchemaResourceRecordSet](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
