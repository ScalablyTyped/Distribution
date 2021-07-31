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
  
  @scala.inline
  def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  @scala.inline
  implicit class SchemaQuotaMutableBuilder[Self <: SchemaQuota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsKeysPerManagedZone(value: Double): Self = StObject.set(x, "dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsKeysPerManagedZoneUndefined: Self = StObject.set(x, "dnsKeysPerManagedZone", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedZones(value: Double): Self = StObject.set(x, "managedZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedZonesPerNetwork(value: Double): Self = StObject.set(x, "managedZonesPerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedZonesPerNetworkUndefined: Self = StObject.set(x, "managedZonesPerNetwork", js.undefined)
    
    @scala.inline
    def setManagedZonesUndefined: Self = StObject.set(x, "managedZones", js.undefined)
    
    @scala.inline
    def setNetworksPerManagedZone(value: Double): Self = StObject.set(x, "networksPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksPerManagedZoneUndefined: Self = StObject.set(x, "networksPerManagedZone", js.undefined)
    
    @scala.inline
    def setResourceRecordsPerRrset(value: Double): Self = StObject.set(x, "resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordsPerRrsetUndefined: Self = StObject.set(x, "resourceRecordsPerRrset", js.undefined)
    
    @scala.inline
    def setRrsetAdditionsPerChange(value: Double): Self = StObject.set(x, "rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrsetAdditionsPerChangeUndefined: Self = StObject.set(x, "rrsetAdditionsPerChange", js.undefined)
    
    @scala.inline
    def setRrsetDeletionsPerChange(value: Double): Self = StObject.set(x, "rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrsetDeletionsPerChangeUndefined: Self = StObject.set(x, "rrsetDeletionsPerChange", js.undefined)
    
    @scala.inline
    def setRrsetsPerManagedZone(value: Double): Self = StObject.set(x, "rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrsetsPerManagedZoneUndefined: Self = StObject.set(x, "rrsetsPerManagedZone", js.undefined)
    
    @scala.inline
    def setTotalRrdataSizePerChange(value: Double): Self = StObject.set(x, "totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRrdataSizePerChangeUndefined: Self = StObject.set(x, "totalRrdataSizePerChange", js.undefined)
    
    @scala.inline
    def setWhitelistedKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = StObject.set(x, "whitelistedKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistedKeySpecsUndefined: Self = StObject.set(x, "whitelistedKeySpecs", js.undefined)
    
    @scala.inline
    def setWhitelistedKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = StObject.set(x, "whitelistedKeySpecs", js.Array(value :_*))
  }
}
