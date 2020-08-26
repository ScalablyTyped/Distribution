package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerAxisCoordinateObject extends js.Object {
  /**
    * Related axis.
    */
  var axis: Axis = js.native
  /**
    * Axis value.
    */
  var value: Double = js.native
}

object PointerAxisCoordinateObject {
  @scala.inline
  def apply(axis: Axis, value: Double): PointerAxisCoordinateObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerAxisCoordinateObject]
  }
  @scala.inline
  implicit class PointerAxisCoordinateObjectOps[Self <: PointerAxisCoordinateObject] (val x: Self) extends AnyVal {
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
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

