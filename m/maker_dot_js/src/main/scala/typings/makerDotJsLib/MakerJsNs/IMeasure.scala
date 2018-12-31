package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measurement of extents, the high and low points.
  */
trait IMeasure extends js.Object {
  /**
    * The point containing both the highest x and y values of the rectangle containing the item being measured.
    */
  var high: IPoint
  /**
    * The point containing both the lowest x and y values of the rectangle containing the item being measured.
    */
  var low: IPoint
}

