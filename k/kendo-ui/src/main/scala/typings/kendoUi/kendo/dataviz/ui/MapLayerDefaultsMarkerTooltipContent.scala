package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsMarkerTooltipContent extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object MapLayerDefaultsMarkerTooltipContent {
  @scala.inline
  def apply(url: String = null): MapLayerDefaultsMarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipContent]
  }
}

