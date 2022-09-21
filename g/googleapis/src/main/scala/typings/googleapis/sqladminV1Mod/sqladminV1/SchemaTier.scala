package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTier extends StObject {
  
  /**
    * The maximum disk size of this tier in bytes.
    */
  var DiskQuota: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum RAM usage of this tier in bytes.
    */
  var RAM: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#tier`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The applicable regions for this tier.
    */
  var region: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An identifier for the machine type, for example, `db-custom-1-3840`. For related information, see [Pricing](/sql/pricing).
    */
  var tier: js.UndefOr[String | Null] = js.undefined
}
object SchemaTier {
  
  inline def apply(): SchemaTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTier]
  }
  
  extension [Self <: SchemaTier](x: Self) {
    
    inline def setDiskQuota(value: String): Self = StObject.set(x, "DiskQuota", value.asInstanceOf[js.Any])
    
    inline def setDiskQuotaNull: Self = StObject.set(x, "DiskQuota", null)
    
    inline def setDiskQuotaUndefined: Self = StObject.set(x, "DiskQuota", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRAM(value: String): Self = StObject.set(x, "RAM", value.asInstanceOf[js.Any])
    
    inline def setRAMNull: Self = StObject.set(x, "RAM", null)
    
    inline def setRAMUndefined: Self = StObject.set(x, "RAM", js.undefined)
    
    inline def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value*))
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
