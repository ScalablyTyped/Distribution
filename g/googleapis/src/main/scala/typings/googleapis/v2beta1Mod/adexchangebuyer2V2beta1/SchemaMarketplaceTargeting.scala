package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMarketplaceTargeting extends StObject {
  
  /**
    * Geo criteria IDs to be included/excluded.
    */
  var geoTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * Inventory sizes to be included/excluded.
    */
  var inventorySizeTargeting: js.UndefOr[SchemaInventorySizeTargeting] = js.undefined
  
  /**
    * Placement targeting information, e.g., URL, mobile applications.
    */
  var placementTargeting: js.UndefOr[SchemaPlacementTargeting] = js.undefined
  
  /**
    * Technology targeting information, e.g., operating system, device category.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.undefined
  
  /**
    * Video targeting information.
    */
  var videoTargeting: js.UndefOr[SchemaVideoTargeting] = js.undefined
}
object SchemaMarketplaceTargeting {
  
  inline def apply(): SchemaMarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceTargeting]
  }
  
  extension [Self <: SchemaMarketplaceTargeting](x: Self) {
    
    inline def setGeoTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    inline def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    inline def setPlacementTargeting(value: SchemaPlacementTargeting): Self = StObject.set(x, "placementTargeting", value.asInstanceOf[js.Any])
    
    inline def setPlacementTargetingUndefined: Self = StObject.set(x, "placementTargeting", js.undefined)
    
    inline def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    inline def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    inline def setVideoTargeting(value: SchemaVideoTargeting): Self = StObject.set(x, "videoTargeting", value.asInstanceOf[js.Any])
    
    inline def setVideoTargetingUndefined: Self = StObject.set(x, "videoTargeting", js.undefined)
  }
}
