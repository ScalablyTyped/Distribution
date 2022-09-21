package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRecordSet extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For example, www.example.com.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
    */
  var routingPolicy: js.UndefOr[SchemaRRSetRoutingPolicy] = js.undefined
  
  /**
    * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
    */
  var rrdatas: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * As defined in RFC 4034 (section 3.2).
    */
  var signatureRrdatas: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Number of seconds that this ResourceRecordSet can be cached by resolvers.
    */
  var ttl: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The identifier of a supported record type. See the list of Supported DNS record types.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceRecordSet {
  
  inline def apply(): SchemaResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecordSet]
  }
  
  extension [Self <: SchemaResourceRecordSet](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoutingPolicy(value: SchemaRRSetRoutingPolicy): Self = StObject.set(x, "routingPolicy", value.asInstanceOf[js.Any])
    
    inline def setRoutingPolicyUndefined: Self = StObject.set(x, "routingPolicy", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasNull: Self = StObject.set(x, "rrdatas", null)
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasNull: Self = StObject.set(x, "signatureRrdatas", null)
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value*))
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
