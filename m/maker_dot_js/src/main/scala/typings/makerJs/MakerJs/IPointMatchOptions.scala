package typings.makerJs.MakerJs

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
  var pointMatchingDistance: js.UndefOr[Double] = js.undefined
}

object IPointMatchOptions {
  @scala.inline
  def apply(pointMatchingDistance: js.UndefOr[Double] = js.undefined): IPointMatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pointMatchingDistance)) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointMatchOptions]
  }
}

