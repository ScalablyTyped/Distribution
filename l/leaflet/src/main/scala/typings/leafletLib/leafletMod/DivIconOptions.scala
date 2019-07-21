package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivIconOptions extends BaseIconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.undefined
  var html: js.UndefOr[java.lang.String | stdLib.HTMLElement | leafletLib.leafletLibNumbers.`false`] = js.undefined
}

object DivIconOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    bgPos: PointExpression = null,
    className: java.lang.String = null,
    html: java.lang.String | stdLib.HTMLElement | leafletLib.leafletLibNumbers.`false` = null,
    iconAnchor: PointExpression = null,
    iconRetinaUrl: java.lang.String = null,
    iconSize: PointExpression = null,
    iconUrl: java.lang.String = null,
    pane: java.lang.String = null,
    popupAnchor: PointExpression = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: java.lang.String = null,
    shadowSize: PointExpression = null,
    shadowUrl: java.lang.String = null,
    tooltipAnchor: PointExpression = null
  ): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bgPos != null) __obj.updateDynamic("bgPos")(bgPos.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl)
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl)
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivIconOptions]
  }
}

