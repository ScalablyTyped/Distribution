package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Targeting represents different criteria that can be used by advertisers to
  * target ad inventory. For example, they can choose to target ad requests
  * only if the user is in the US. Multiple types of targeting are always
  * applied as a logical AND, unless noted otherwise.
  */
@js.native
trait SchemaMarketplaceTargeting extends StObject {
  
  /**
    * Geo criteria IDs to be included/excluded.
    */
  var geoTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  
  /**
    * Inventory sizes to be included/excluded.
    */
  var inventorySizeTargeting: js.UndefOr[SchemaInventorySizeTargeting] = js.native
  
  /**
    * Placement targeting information, e.g., URL, mobile applications.
    */
  var placementTargeting: js.UndefOr[SchemaPlacementTargeting] = js.native
  
  /**
    * Technology targeting information, e.g., operating system, device
    * category.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
  
  /**
    * Video targeting information.
    */
  var videoTargeting: js.UndefOr[SchemaVideoTargeting] = js.native
}
object SchemaMarketplaceTargeting {
  
  @scala.inline
  def apply(): SchemaMarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceTargeting]
  }
  
  @scala.inline
  implicit class SchemaMarketplaceTargetingMutableBuilder[Self <: SchemaMarketplaceTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    @scala.inline
    def setInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    @scala.inline
    def setPlacementTargeting(value: SchemaPlacementTargeting): Self = StObject.set(x, "placementTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTargetingUndefined: Self = StObject.set(x, "placementTargeting", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    @scala.inline
    def setVideoTargeting(value: SchemaVideoTargeting): Self = StObject.set(x, "videoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTargetingUndefined: Self = StObject.set(x, "videoTargeting", js.undefined)
  }
}
