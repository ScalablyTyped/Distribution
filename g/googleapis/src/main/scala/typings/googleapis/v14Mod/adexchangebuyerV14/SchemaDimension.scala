package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message carries publisher provided breakdown. E.g. {dimension_type:
  * &#39;COUNTRY&#39;, [{dimension_value: {id: 1, name: &#39;US&#39;}},
  * {dimension_value: {id: 2, name: &#39;UK&#39;}}]}
  */
@js.native
trait SchemaDimension extends js.Object {
  var dimensionType: js.UndefOr[String] = js.native
  var dimensionValues: js.UndefOr[js.Array[SchemaDimensionDimensionValue]] = js.native
}

object SchemaDimension {
  @scala.inline
  def apply(dimensionType: String = null, dimensionValues: js.Array[SchemaDimensionDimensionValue] = null): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    if (dimensionType != null) __obj.updateDynamic("dimensionType")(dimensionType.asInstanceOf[js.Any])
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimension]
  }
}

