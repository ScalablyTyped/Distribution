package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Cloud SQL service tier resource.
  */
@js.native
trait SchemaTier extends StObject {
  
  /**
    * The maximum disk size of this tier in bytes.
    */
  var DiskQuota: js.UndefOr[String] = js.native
  
  /**
    * The maximum RAM usage of this tier in bytes.
    */
  var RAM: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#tier.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The applicable regions for this tier.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An identifier for the machine type, for example, db-n1-standard-1. For
    * related information, see Pricing.
    */
  var tier: js.UndefOr[String] = js.native
}
object SchemaTier {
  
  @scala.inline
  def apply(): SchemaTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTier]
  }
  
  @scala.inline
  implicit class SchemaTierMutableBuilder[Self <: SchemaTier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskQuota(value: String): Self = StObject.set(x, "DiskQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskQuotaUndefined: Self = StObject.set(x, "DiskQuota", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRAM(value: String): Self = StObject.set(x, "RAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRAMUndefined: Self = StObject.set(x, "RAM", js.undefined)
    
    @scala.inline
    def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value :_*))
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
