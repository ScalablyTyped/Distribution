package typings.leaflet.mod

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
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
}

