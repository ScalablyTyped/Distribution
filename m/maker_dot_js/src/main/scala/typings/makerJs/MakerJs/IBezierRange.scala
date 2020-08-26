package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bezier t values for an arc path segment in a bezier curve.
  */
@js.native
trait IBezierRange extends js.Object {
  /**
    * The bezier t-value at the end point.
    */
  var endT: Double = js.native
  /**
    * The bezier t-value at the starting point.
    */
  var startT: Double = js.native
}

object IBezierRange {
  @scala.inline
  def apply(endT: Double, startT: Double): IBezierRange = {
    val __obj = js.Dynamic.literal(endT = endT.asInstanceOf[js.Any], startT = startT.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBezierRange]
  }
  @scala.inline
  implicit class IBezierRangeOps[Self <: IBezierRange] (val x: Self) extends AnyVal {
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
    def setEndT(value: Double): Self = this.set("endT", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartT(value: Double): Self = this.set("startT", value.asInstanceOf[js.Any])
  }
  
}

