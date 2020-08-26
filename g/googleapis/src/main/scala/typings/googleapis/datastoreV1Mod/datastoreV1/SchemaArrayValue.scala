package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array value.
  */
@js.native
trait SchemaArrayValue extends js.Object {
  /**
    * Values in the array. The order of values in an array is preserved as long
    * as all values have identical settings for &#39;exclude_from_indexes&#39;.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.native
}

object SchemaArrayValue {
  @scala.inline
  def apply(): SchemaArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArrayValue]
  }
  @scala.inline
  implicit class SchemaArrayValueOps[Self <: SchemaArrayValue] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: SchemaValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SchemaValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

