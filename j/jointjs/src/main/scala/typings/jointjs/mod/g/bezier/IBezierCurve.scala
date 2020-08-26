package typings.jointjs.mod.g.bezier

import typings.jointjs.mod.g.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBezierCurve extends js.Object {
  var p0: Point = js.native
  var p1: Point = js.native
  var p2: Point = js.native
  var p3: Point = js.native
}

object IBezierCurve {
  @scala.inline
  def apply(p0: Point, p1: Point, p2: Point, p3: Point): IBezierCurve = {
    val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBezierCurve]
  }
  @scala.inline
  implicit class IBezierCurveOps[Self <: IBezierCurve] (val x: Self) extends AnyVal {
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
    def setP0(value: Point): Self = this.set("p0", value.asInstanceOf[js.Any])
    @scala.inline
    def setP1(value: Point): Self = this.set("p1", value.asInstanceOf[js.Any])
    @scala.inline
    def setP2(value: Point): Self = this.set("p2", value.asInstanceOf[js.Any])
    @scala.inline
    def setP3(value: Point): Self = this.set("p3", value.asInstanceOf[js.Any])
  }
  
}

