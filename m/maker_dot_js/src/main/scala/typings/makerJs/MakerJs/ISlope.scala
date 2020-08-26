package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slope and y-intercept of a line.
  */
@js.native
trait ISlope extends js.Object {
  /**
    * Boolean to see if line has slope or is vertical.
    */
  var hasSlope: Boolean = js.native
  /**
    * Line used to calculate this slope.
    */
  var line: IPathLine = js.native
  /**
    * Optional value of non-vertical slope.
    */
  var slope: js.UndefOr[Double] = js.native
  /**
    * Optional value of y when x = 0.
    */
  var yIntercept: js.UndefOr[Double] = js.native
}

object ISlope {
  @scala.inline
  def apply(hasSlope: Boolean, line: IPathLine): ISlope = {
    val __obj = js.Dynamic.literal(hasSlope = hasSlope.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlope]
  }
  @scala.inline
  implicit class ISlopeOps[Self <: ISlope] (val x: Self) extends AnyVal {
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
    def setHasSlope(value: Boolean): Self = this.set("hasSlope", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: IPathLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlope(value: Double): Self = this.set("slope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlope: Self = this.set("slope", js.undefined)
    @scala.inline
    def setYIntercept(value: Double): Self = this.set("yIntercept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYIntercept: Self = this.set("yIntercept", js.undefined)
  }
  
}

