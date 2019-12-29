package typings.leaflet.leafletMod

import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivIconOptions extends BaseIconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.undefined
  var html: js.UndefOr[String | HTMLElement | `false`] = js.undefined
}

object DivIconOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    bgPos: PointExpression = null,
    className: String = null,
    html: String | HTMLElement | `false` = null,
    iconAnchor: PointExpression = null,
    iconRetinaUrl: String = null,
    iconSize: PointExpression = null,
    iconUrl: String = null,
    pane: String = null,
    popupAnchor: PointExpression = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: String = null,
    shadowSize: PointExpression = null,
    shadowUrl: String = null,
    tooltipAnchor: PointExpression = null
  ): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bgPos != null) __obj.updateDynamic("bgPos")(bgPos.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl.asInstanceOf[js.Any])
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivIconOptions]
  }
}

