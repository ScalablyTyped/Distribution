package typings
package makerDotJsLib.MakerJsNs

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
  var byLayers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

object IFindChainsOptions {
  @scala.inline
  def apply(
    byLayers: js.UndefOr[scala.Boolean] = js.undefined,
    pointMatchingDistance: scala.Int | scala.Double = null,
    shallow: js.UndefOr[scala.Boolean] = js.undefined
  ): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byLayers)) __obj.updateDynamic("byLayers")(byLayers)
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[IFindChainsOptions]
  }
}

