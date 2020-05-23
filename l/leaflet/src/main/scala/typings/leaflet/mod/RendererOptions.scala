package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends LayerOptions {
  var padding: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    tolerance: js.UndefOr[Double] = js.undefined
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererOptions]
  }
}

