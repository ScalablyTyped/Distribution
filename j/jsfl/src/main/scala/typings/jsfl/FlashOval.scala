package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Oval object is a shape that is drawn using the Oval Primitive tool. To determine if an item is an Oval object, use shape.isOvalObject. */
@js.native
trait FlashOval extends js.Object {
  /** Read-only property; a Boolean value that specifies whether the Close Path check box in the Property inspector is selected. If the start angle and end angle values for the object are the same, setting this property has no effect until the values change. To set this value, use document.setOvalObjectProperty(). */
  var closePath: Boolean = js.native
  /** Read-only property; a float value that specifies the end angle of the Oval object. Acceptable values are from 0 to 360. */
  var endAngle: Double = js.native
  /** Read-only property; a float value that specifies the inner radius of the Oval object as a percentage. Acceptable values are from 0 to 99. */
  var innerRadius: Double = js.native
  /** Read-only property; a float value that specifies the start angle of the Oval object. Acceptable values are from 0 to 360. To set this value, use document.setOvalObjectProperty(). */
  var startAngle: Double = js.native
}

object FlashOval {
  @scala.inline
  def apply(closePath: Boolean, endAngle: Double, innerRadius: Double, startAngle: Double): FlashOval = {
    val __obj = js.Dynamic.literal(closePath = closePath.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashOval]
  }
  @scala.inline
  implicit class FlashOvalOps[Self <: FlashOval] (val x: Self) extends AnyVal {
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
    def setClosePath(value: Boolean): Self = this.set("closePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
  }
  
}

