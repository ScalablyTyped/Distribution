package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.findLoops.
  */
trait IFindChainsOptions extends IPointMatchOptions {
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.undefined
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object IFindChainsOptions {
  @scala.inline
  def apply(
    byLayers: js.UndefOr[Boolean] = js.undefined,
    pointMatchingDistance: Int | Double = null,
    shallow: js.UndefOr[Boolean] = js.undefined
  ): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byLayers)) __obj.updateDynamic("byLayers")(byLayers.asInstanceOf[js.Any])
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindChainsOptions]
  }
}

