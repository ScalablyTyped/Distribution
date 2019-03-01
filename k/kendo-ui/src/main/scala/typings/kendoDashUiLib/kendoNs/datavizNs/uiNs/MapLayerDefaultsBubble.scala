package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBubble extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[MapLayerDefaultsBubbleStyle] = js.undefined
  var symbol: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object MapLayerDefaultsBubble {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    style: MapLayerDefaultsBubbleStyle = null,
    symbol: java.lang.String | js.Function = null
  ): MapLayerDefaultsBubble = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBubble]
  }
}

