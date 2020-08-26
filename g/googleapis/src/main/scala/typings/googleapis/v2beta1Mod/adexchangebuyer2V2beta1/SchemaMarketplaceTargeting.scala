package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting represents different criteria that can be used by advertisers to
  * target ad inventory. For example, they can choose to target ad requests
  * only if the user is in the US. Multiple types of targeting are always
  * applied as a logical AND, unless noted otherwise.
  */
@js.native
trait SchemaMarketplaceTargeting extends js.Object {
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
  implicit class SchemaMarketplaceTargetingOps[Self <: SchemaMarketplaceTargeting] (val x: Self) extends AnyVal {
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
    def setGeoTargeting(value: SchemaCriteriaTargeting): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    @scala.inline
    def setInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = this.set("inventorySizeTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventorySizeTargeting: Self = this.set("inventorySizeTargeting", js.undefined)
    @scala.inline
    def setPlacementTargeting(value: SchemaPlacementTargeting): Self = this.set("placementTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTargeting: Self = this.set("placementTargeting", js.undefined)
    @scala.inline
    def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = this.set("technologyTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechnologyTargeting: Self = this.set("technologyTargeting", js.undefined)
    @scala.inline
    def setVideoTargeting(value: SchemaVideoTargeting): Self = this.set("videoTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoTargeting: Self = this.set("videoTargeting", js.undefined)
  }
  
}

