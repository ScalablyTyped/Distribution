package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceTargeting extends js.Object {
  
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
  implicit class MarketplaceTargetingOps[Self <: MarketplaceTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeoTargeting(value: CriteriaTargeting): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    
    @scala.inline
    def setInventorySizeTargeting(value: InventorySizeTargeting): Self = this.set("inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySizeTargeting: Self = this.set("inventorySizeTargeting", js.undefined)
    
    @scala.inline
    def setPlacementTargeting(value: PlacementTargeting): Self = this.set("placementTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementTargeting: Self = this.set("placementTargeting", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: TechnologyTargeting): Self = this.set("technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechnologyTargeting: Self = this.set("technologyTargeting", js.undefined)
    
    @scala.inline
    def setVideoTargeting(value: VideoTargeting): Self = this.set("videoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoTargeting: Self = this.set("videoTargeting", js.undefined)
  }
}
