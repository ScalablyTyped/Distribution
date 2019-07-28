package typings.heremaps.HNs.mapNs.ViewPortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which may be used to initialize new ViewPort instance
  * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
  * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
  * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or or padding has been changed, default is true
  */
trait Options extends js.Object {
  var fixedCenter: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fixedCenter: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    padding: Padding = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixedCenter)) __obj.updateDynamic("fixedCenter")(fixedCenter)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[Options]
  }
}

