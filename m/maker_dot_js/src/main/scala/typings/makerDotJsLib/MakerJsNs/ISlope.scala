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

