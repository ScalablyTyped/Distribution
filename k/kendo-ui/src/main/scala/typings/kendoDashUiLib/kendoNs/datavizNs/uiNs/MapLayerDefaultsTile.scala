package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsTile extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var subdomains: js.UndefOr[js.Any] = js.undefined
  var urlTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object MapLayerDefaultsTile {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    subdomains: js.Any = null,
    urlTemplate: java.lang.String = null
  ): MapLayerDefaultsTile = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains)
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate)
    __obj.asInstanceOf[MapLayerDefaultsTile]
  }
}

