package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveLayerOptions extends LayerOptions {
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
}

object InteractiveLayerOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    pane: String = null
  ): InteractiveLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[InteractiveLayerOptions]
  }
}

