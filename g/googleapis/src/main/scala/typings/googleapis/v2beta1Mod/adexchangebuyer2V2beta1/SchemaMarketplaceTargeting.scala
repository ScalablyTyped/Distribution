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
  def apply(
    geoTargeting: SchemaCriteriaTargeting = null,
    inventorySizeTargeting: SchemaInventorySizeTargeting = null,
    placementTargeting: SchemaPlacementTargeting = null,
    technologyTargeting: SchemaTechnologyTargeting = null,
    videoTargeting: SchemaVideoTargeting = null
  ): SchemaMarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (inventorySizeTargeting != null) __obj.updateDynamic("inventorySizeTargeting")(inventorySizeTargeting.asInstanceOf[js.Any])
    if (placementTargeting != null) __obj.updateDynamic("placementTargeting")(placementTargeting.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    if (videoTargeting != null) __obj.updateDynamic("videoTargeting")(videoTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMarketplaceTargeting]
  }
}

