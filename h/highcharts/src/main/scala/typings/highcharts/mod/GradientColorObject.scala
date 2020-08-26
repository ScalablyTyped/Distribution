package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientColorObject extends _ColorType {
  /**
    * Holds an object that defines the start position and the end position
    * relative to the shape.
    */
  var linearGradient: js.UndefOr[LinearGradientColorObject] = js.native
  /**
    * Holds an object that defines the center position and the radius.
    */
  var radialGradient: js.UndefOr[RadialGradientColorObject] = js.native
  /**
    * The first item in each tuple is the position in the gradient, where 0 is
    * the start of the gradient and 1 is the end of the gradient. Multiple
    * stops can be applied. The second item is the color for each stop. This
    * color can also be given in the rgba format.
    */
  var stops: js.Array[GradientColorStopObject] = js.native
}

object GradientColorObject {
  @scala.inline
  def apply(stops: js.Array[GradientColorStopObject]): GradientColorObject = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorObject]
  }
  @scala.inline
  implicit class GradientColorObjectOps[Self <: GradientColorObject] (val x: Self) extends AnyVal {
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
    def setStopsVarargs(value: GradientColorStopObject*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[GradientColorStopObject]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinearGradient(value: LinearGradientColorObject): Self = this.set("linearGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearGradient: Self = this.set("linearGradient", js.undefined)
    @scala.inline
    def setRadialGradient(value: RadialGradientColorObject): Self = this.set("radialGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialGradient: Self = this.set("radialGradient", js.undefined)
  }
  
}

