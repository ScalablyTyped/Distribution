package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends LayerOptions {
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    pane: java.lang.String = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[RendererOptions]
  }
}

