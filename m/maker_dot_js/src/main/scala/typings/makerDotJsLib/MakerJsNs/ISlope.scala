package typings
package makerDotJsLib.MakerJsNs

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
  var hasSlope: scala.Boolean
  /**
    * Line used to calculate this slope.
    */
  var line: IPathLine
  /**
    * Optional value of non-vertical slope.
    */
  var slope: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional value of y when x = 0.
    */
  var yIntercept: js.UndefOr[scala.Double] = js.undefined
}

object ISlope {
  @scala.inline
  def apply(
    hasSlope: scala.Boolean,
    line: IPathLine,
    slope: scala.Int | scala.Double = null,
    yIntercept: scala.Int | scala.Double = null
  ): ISlope = {
    val __obj = js.Dynamic.literal(hasSlope = hasSlope, line = line)
    if (slope != null) __obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
    if (yIntercept != null) __obj.updateDynamic("yIntercept")(yIntercept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlope]
  }
}

