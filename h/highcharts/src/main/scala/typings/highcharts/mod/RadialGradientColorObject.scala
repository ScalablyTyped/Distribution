package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradientColorObject extends js.Object {
  /**
    * Center horizontal position relative to the shape. Float ranges 0-1.
    */
  var cx: Double = js.native
  /**
    * Center vertical position relative to the shape. Float ranges 0-1.
    */
  var cy: Double = js.native
  /**
    * Radius relative to the shape. Float ranges 0-1.
    */
  var r: Double = js.native
}

object RadialGradientColorObject {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): RadialGradientColorObject = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientColorObject]
  }
  @scala.inline
  implicit class RadialGradientColorObjectOps[Self <: RadialGradientColorObject] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

