package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options when matching points
  */
trait IPointMatchOptions extends js.Object {
  /**
    * Max distance to consider two points as the same.
    */
  var pointMatchingDistance: js.UndefOr[scala.Double] = js.undefined
}

object IPointMatchOptions {
  @scala.inline
  def apply(pointMatchingDistance: scala.Int | scala.Double = null): IPointMatchOptions = {
    val __obj = js.Dynamic.literal()
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointMatchOptions]
  }
}

