package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Assignment.
  */
@js.native
trait SchemaPlacementAssignment extends js.Object {
  /**
    * Whether this placement assignment is active. When true, the placement
    * will be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * ID of the placement to be assigned. This is a required field.
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the placement. This is a read-only,
    * auto-generated field.
    */
  var placementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether the placement to be assigned requires SSL. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
}

object SchemaPlacementAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    placementId: String = null,
    placementIdDimensionValue: SchemaDimensionValue = null,
    sslRequired: js.UndefOr[Boolean] = js.undefined
  ): SchemaPlacementAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (placementId != null) __obj.updateDynamic("placementId")(placementId.asInstanceOf[js.Any])
    if (placementIdDimensionValue != null) __obj.updateDynamic("placementIdDimensionValue")(placementIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlacementAssignment]
  }
}

