package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBubble extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[MapLayerDefaultsBubbleStyle] = js.undefined
  var symbol: js.UndefOr[String | js.Function] = js.undefined
}

object MapLayerDefaultsBubble {
  @scala.inline
  def apply(
    attribution: String = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    opacity: Int | Double = null,
    style: MapLayerDefaultsBubbleStyle = null,
    symbol: String | js.Function = null
  ): MapLayerDefaultsBubble = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBubble]
  }
}

