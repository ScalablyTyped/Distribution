package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The range of the population values.
  */
@js.native
trait SchemaRange extends js.Object {
  /**
    * The maximum of the population values.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum of the population values.
    */
  var min: js.UndefOr[Double] = js.native
}

object SchemaRange {
  @scala.inline
  def apply(): SchemaRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRange]
  }
  @scala.inline
  implicit class SchemaRangeOps[Self <: SchemaRange] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

