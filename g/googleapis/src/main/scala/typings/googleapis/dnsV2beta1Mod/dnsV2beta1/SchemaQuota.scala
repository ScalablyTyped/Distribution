package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuota extends StObject {
  
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#quota&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var managedZones: js.UndefOr[Double] = js.undefined
  
  var managedZonesPerNetwork: js.UndefOr[Double] = js.undefined
  
  var networksPerManagedZone: js.UndefOr[Double] = js.undefined
  
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined
  
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.undefined
  
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.undefined
  
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.undefined
  
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.undefined
  
  var whitelistedKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.undefined
}
object SchemaQuota {
  
  inline def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  extension [Self <: SchemaQuota](x: Self) {
    
    inline def setDnsKeysPerManagedZone(value: Double): Self = StObject.set(x, "dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setDnsKeysPerManagedZoneUndefined: Self = StObject.set(x, "dnsKeysPerManagedZone", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedZones(value: Double): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerNetwork(value: Double): Self = StObject.set(x, "managedZonesPerNetwork", value.asInstanceOf[js.Any])
    
    inline def setManagedZonesPerNetworkUndefined: Self = StObject.set(x, "managedZonesPerNetwork", js.undefined)
    
    inline def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    inline def setNetworksPerManagedZone(value: Double): Self = StObject.set(x, "networksPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setNetworksPerManagedZoneUndefined: Self = StObject.set(x, "networksPerManagedZone", js.undefined)
    
    inline def setResourceRecordsPerRrset(value: Double): Self = StObject.set(x, "resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsPerRrsetUndefined: Self = StObject.set(x, "resourceRecordsPerRrset", js.undefined)
    
    inline def setRrsetAdditionsPerChange(value: Double): Self = StObject.set(x, "rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    
    inline def setRrsetAdditionsPerChangeUndefined: Self = StObject.set(x, "rrsetAdditionsPerChange", js.undefined)
    
    inline def setRrsetDeletionsPerChange(value: Double): Self = StObject.set(x, "rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    
    inline def setRrsetDeletionsPerChangeUndefined: Self = StObject.set(x, "rrsetDeletionsPerChange", js.undefined)
    
    inline def setRrsetsPerManagedZone(value: Double): Self = StObject.set(x, "rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    
    inline def setRrsetsPerManagedZoneUndefined: Self = StObject.set(x, "rrsetsPerManagedZone", js.undefined)
    
    inline def setTotalRrdataSizePerChange(value: Double): Self = StObject.set(x, "totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    
    inline def setTotalRrdataSizePerChangeUndefined: Self = StObject.set(x, "totalRrdataSizePerChange", js.undefined)
    
    inline def setWhitelistedKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = StObject.set(x, "whitelistedKeySpecs", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedKeySpecsUndefined: Self = StObject.set(x, "whitelistedKeySpecs", js.undefined)
    
    inline def setWhitelistedKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = StObject.set(x, "whitelistedKeySpecs", js.Array(value :_*))
  }
}
