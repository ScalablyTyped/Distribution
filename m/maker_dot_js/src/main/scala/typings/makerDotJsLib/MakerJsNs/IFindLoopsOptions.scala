package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.findLoops.
  */
trait IFindLoopsOptions extends IPointMatchOptions {
  /**
    * Flag to remove looped paths from the original model.
    */
  var removeFromOriginal: js.UndefOr[scala.Boolean] = js.undefined
}

object IFindLoopsOptions {
  @scala.inline
  def apply(
    pointMatchingDistance: scala.Int | scala.Double = null,
    removeFromOriginal: js.UndefOr[scala.Boolean] = js.undefined
  ): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromOriginal)) __obj.updateDynamic("removeFromOriginal")(removeFromOriginal)
    __obj.asInstanceOf[IFindLoopsOptions]
  }
}

