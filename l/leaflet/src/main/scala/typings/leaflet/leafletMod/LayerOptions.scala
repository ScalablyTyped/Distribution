package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(attribution: String = null, pane: String = null): LayerOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[LayerOptions]
  }
}

