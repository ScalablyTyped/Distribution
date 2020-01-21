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
  def apply(pointMatchingDistance: Int | Double = null, removeFromOriginal: js.UndefOr[Boolean] = js.undefined): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromOriginal)) __obj.updateDynamic("removeFromOriginal")(removeFromOriginal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindLoopsOptions]
  }
}

