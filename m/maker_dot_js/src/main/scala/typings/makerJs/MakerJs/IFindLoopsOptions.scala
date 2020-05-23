package typings.makerJs.MakerJs

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
  var removeFromOriginal: js.UndefOr[Boolean] = js.undefined
}

object IFindLoopsOptions {
  @scala.inline
  def apply(
    pointMatchingDistance: js.UndefOr[Double] = js.undefined,
    removeFromOriginal: js.UndefOr[Boolean] = js.undefined
  ): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pointMatchingDistance)) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromOriginal)) __obj.updateDynamic("removeFromOriginal")(removeFromOriginal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindLoopsOptions]
  }
}

