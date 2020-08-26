package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holder object for the value of an entry in a map field of a data point.  A
  * map value supports a subset of the formats that the regular Value supports.
  */
@js.native
trait SchemaMapValue extends js.Object {
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double] = js.native
}

object SchemaMapValue {
  @scala.inline
  def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  @scala.inline
  implicit class SchemaMapValueOps[Self <: SchemaMapValue] (val x: Self) extends AnyVal {
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
    def setFpVal(value: Double): Self = this.set("fpVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpVal: Self = this.set("fpVal", js.undefined)
  }
  
}

