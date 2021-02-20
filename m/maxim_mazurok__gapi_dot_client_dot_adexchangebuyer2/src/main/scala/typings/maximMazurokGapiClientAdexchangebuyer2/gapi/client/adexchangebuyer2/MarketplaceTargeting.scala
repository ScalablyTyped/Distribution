package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceTargeting extends StObject {
  
  /** Geo criteria IDs to be included/excluded. */
  var geoTargeting: js.UndefOr[CriteriaTargeting] = js.native
  
  /** Inventory sizes to be included/excluded. */
  var inventorySizeTargeting: js.UndefOr[InventorySizeTargeting] = js.native
  
  /** Placement targeting information, e.g., URL, mobile applications. */
  var placementTargeting: js.UndefOr[PlacementTargeting] = js.native
  
  /** Technology targeting information, e.g., operating system, device category. */
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.native
  
  /** Video targeting information. */
  var videoTargeting: js.UndefOr[VideoTargeting] = js.native
}
object MarketplaceTargeting {
  
  @scala.inline
  def apply(): MarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceTargeting]
  }
  
  @scala.inline
  implicit class MarketplaceTargetingMutableBuilder[Self <: MarketplaceTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoTargeting(value: CriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    @scala.inline
    def setInventorySizeTargeting(value: InventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    @scala.inline
    def setPlacementTargeting(value: PlacementTargeting): Self = StObject.set(x, "placementTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTargetingUndefined: Self = StObject.set(x, "placementTargeting", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: TechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    @scala.inline
    def setVideoTargeting(value: VideoTargeting): Self = StObject.set(x, "videoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTargetingUndefined: Self = StObject.set(x, "videoTargeting", js.undefined)
  }
}
