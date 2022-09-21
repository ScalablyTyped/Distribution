package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyPrimaryBackupPolicy extends StObject {
  
  /**
    * Backup targets provide a regional failover policy for the otherwise global primary targets. If serving state is set to BACKUP, this policy essentially becomes a geo routing policy.
    */
  var backupGeoTargets: js.UndefOr[SchemaRRSetRoutingPolicyGeoPolicy] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var primaryTargets: js.UndefOr[SchemaRRSetRoutingPolicyHealthCheckTargets] = js.undefined
  
  /**
    * When serving state is PRIMARY, this field provides the option of sending a small percentage of the traffic to the backup targets.
    */
  var trickleTraffic: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRRSetRoutingPolicyPrimaryBackupPolicy {
  
  inline def apply(): SchemaRRSetRoutingPolicyPrimaryBackupPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyPrimaryBackupPolicy]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyPrimaryBackupPolicy](x: Self) {
    
    inline def setBackupGeoTargets(value: SchemaRRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "backupGeoTargets", value.asInstanceOf[js.Any])
    
    inline def setBackupGeoTargetsUndefined: Self = StObject.set(x, "backupGeoTargets", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimaryTargets(value: SchemaRRSetRoutingPolicyHealthCheckTargets): Self = StObject.set(x, "primaryTargets", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTargetsUndefined: Self = StObject.set(x, "primaryTargets", js.undefined)
    
    inline def setTrickleTraffic(value: Double): Self = StObject.set(x, "trickleTraffic", value.asInstanceOf[js.Any])
    
    inline def setTrickleTrafficNull: Self = StObject.set(x, "trickleTraffic", null)
    
    inline def setTrickleTrafficUndefined: Self = StObject.set(x, "trickleTraffic", js.undefined)
  }
}
