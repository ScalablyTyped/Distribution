package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slope and y-intercept of a line.
  */
trait ISlope extends js.Object {
  /**
    * Boolean to see if line has slope or is vertical.
    */
  var hasSlope: Boolean
  /**
    * Line used to calculate this slope.
    */
  var line: IPathLine
  /**
    * Optional value of non-vertical slope.
    */
  var slope: js.UndefOr[Double] = js.undefined
  /**
    * Optional value of y when x = 0.
    */
  var yIntercept: js.UndefOr[Double] = js.undefined
}

object ISlope {
  @scala.inline
  def apply(hasSlope: Boolean, line: IPathLine, slope: Int | Double = null, yIntercept: Int | Double = null): ISlope = {
    val __obj = js.Dynamic.literal(hasSlope = hasSlope.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (slope != null) __obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
    if (yIntercept != null) __obj.updateDynamic("yIntercept")(yIntercept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlope]
  }
}

