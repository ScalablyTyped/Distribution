package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketplaceTargeting extends StObject {
  
  /** Geo criteria IDs to be included/excluded. */
  var geoTargeting: js.UndefOr[CriteriaTargeting] = js.undefined
  
  /** Inventory sizes to be included/excluded. */
  var inventorySizeTargeting: js.UndefOr[InventorySizeTargeting] = js.undefined
  
  /** Placement targeting information, e.g., URL, mobile applications. */
  var placementTargeting: js.UndefOr[PlacementTargeting] = js.undefined
  
  /** Technology targeting information, e.g., operating system, device category. */
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
  
  /** Video targeting information. */
  var videoTargeting: js.UndefOr[VideoTargeting] = js.undefined
}
object MarketplaceTargeting {
  
  inline def apply(): MarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceTargeting]
  }
  
  extension [Self <: MarketplaceTargeting](x: Self) {
    
    inline def setGeoTargeting(value: CriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setInventorySizeTargeting(value: InventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    inline def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    inline def setPlacementTargeting(value: PlacementTargeting): Self = StObject.set(x, "placementTargeting", value.asInstanceOf[js.Any])
    
    inline def setPlacementTargetingUndefined: Self = StObject.set(x, "placementTargeting", js.undefined)
    
    inline def setTechnologyTargeting(value: TechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    inline def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    inline def setVideoTargeting(value: VideoTargeting): Self = StObject.set(x, "videoTargeting", value.asInstanceOf[js.Any])
    
    inline def setVideoTargetingUndefined: Self = StObject.set(x, "videoTargeting", js.undefined)
  }
}
