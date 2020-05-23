package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsTile extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var subdomains: js.UndefOr[js.Any] = js.undefined
  var urlTemplate: js.UndefOr[String] = js.undefined
}

object MapLayerDefaultsTile {
  @scala.inline
  def apply(
    attribution: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    subdomains: js.Any = null,
    urlTemplate: String = null
  ): MapLayerDefaultsTile = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsTile]
  }
}

