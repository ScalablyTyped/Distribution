package typings.googleapis.v32Mod.dfareportingV32

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
  def apply(): SchemaOptimizationActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptimizationActivity]
  }
  @scala.inline
  implicit class SchemaOptimizationActivityOps[Self <: SchemaOptimizationActivity] (val x: Self) extends AnyVal {
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
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    @scala.inline
    def setFloodlightActivityIdDimensionValue(value: SchemaDimensionValue): Self = this.set("floodlightActivityIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityIdDimensionValue: Self = this.set("floodlightActivityIdDimensionValue", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

