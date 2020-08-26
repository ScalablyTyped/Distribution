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
  def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  @scala.inline
  implicit class SchemaDimensionOps[Self <: SchemaDimension] (val x: Self) extends AnyVal {
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
    def setDimensionType(value: String): Self = this.set("dimensionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionType: Self = this.set("dimensionType", js.undefined)
    @scala.inline
    def setDimensionValuesVarargs(value: SchemaDimensionDimensionValue*): Self = this.set("dimensionValues", js.Array(value :_*))
    @scala.inline
    def setDimensionValues(value: js.Array[SchemaDimensionDimensionValue]): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
  }
  
}

