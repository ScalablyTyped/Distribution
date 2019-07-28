package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends LayerOptions {
  var padding: js.UndefOr[Double] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(attribution: String = null, padding: Int | Double = null, pane: String = null): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[RendererOptions]
  }
}

