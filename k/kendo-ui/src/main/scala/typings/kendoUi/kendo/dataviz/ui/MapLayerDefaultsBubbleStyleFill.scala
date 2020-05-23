package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBubbleStyleFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object MapLayerDefaultsBubbleStyleFill {
  @scala.inline
  def apply(color: String = null, opacity: js.UndefOr[Double] = js.undefined): MapLayerDefaultsBubbleStyleFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyleFill]
  }
}

