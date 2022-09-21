package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem extends StObject {
  
  /**
    * For A and AAAA types only. Endpoints to return in the query result only if they are healthy. These can be specified along with rrdata within this item.
    */
  var healthCheckedTargets: js.UndefOr[SchemaRRSetRoutingPolicyHealthCheckTargets] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  var rrdatas: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
    */
  var signatureRrdatas: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem {
  
  inline def apply(): SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem](x: Self) {
    
    inline def setHealthCheckedTargets(value: SchemaRRSetRoutingPolicyHealthCheckTargets): Self = StObject.set(x, "healthCheckedTargets", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckedTargetsUndefined: Self = StObject.set(x, "healthCheckedTargets", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasNull: Self = StObject.set(x, "rrdatas", null)
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasNull: Self = StObject.set(x, "signatureRrdatas", null)
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value*))
  }
}
