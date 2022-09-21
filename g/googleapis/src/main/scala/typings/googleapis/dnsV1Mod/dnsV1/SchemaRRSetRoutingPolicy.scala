package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicy extends StObject {
  
  var geo: js.UndefOr[SchemaRRSetRoutingPolicyGeoPolicy] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var primaryBackup: js.UndefOr[SchemaRRSetRoutingPolicyPrimaryBackupPolicy] = js.undefined
  
  var wrr: js.UndefOr[SchemaRRSetRoutingPolicyWrrPolicy] = js.undefined
}
object SchemaRRSetRoutingPolicy {
  
  inline def apply(): SchemaRRSetRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicy]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicy](x: Self) {
    
    inline def setGeo(value: SchemaRRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimaryBackup(value: SchemaRRSetRoutingPolicyPrimaryBackupPolicy): Self = StObject.set(x, "primaryBackup", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBackupUndefined: Self = StObject.set(x, "primaryBackup", js.undefined)
    
    inline def setWrr(value: SchemaRRSetRoutingPolicyWrrPolicy): Self = StObject.set(x, "wrr", value.asInstanceOf[js.Any])
    
    inline def setWrrUndefined: Self = StObject.set(x, "wrr", js.undefined)
  }
}
