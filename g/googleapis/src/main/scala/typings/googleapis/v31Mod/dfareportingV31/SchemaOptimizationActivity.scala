package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative optimization activity.
  */
@js.native
trait SchemaOptimizationActivity extends js.Object {
  /**
    * Floodlight activity ID of this optimization activity. This is a required
    * field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight activity. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Weight associated with this optimization. The weight assigned will be
    * understood in proportion to the weights assigned to the other
    * optimization activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaOptimizationActivity {
  @scala.inline
  def apply(
    floodlightActivityId: String = null,
    floodlightActivityIdDimensionValue: SchemaDimensionValue = null,
    weight: js.UndefOr[Double] = js.undefined
  ): SchemaOptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOptimizationActivity]
  }
}

