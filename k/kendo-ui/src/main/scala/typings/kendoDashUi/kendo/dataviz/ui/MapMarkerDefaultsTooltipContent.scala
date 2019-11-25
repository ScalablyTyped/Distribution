package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerDefaultsTooltipContent extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object MapMarkerDefaultsTooltipContent {
  @scala.inline
  def apply(url: String = null): MapMarkerDefaultsTooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerDefaultsTooltipContent]
  }
}

