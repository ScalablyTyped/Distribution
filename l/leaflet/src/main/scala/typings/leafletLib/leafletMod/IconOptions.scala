package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends BaseIconOptions {
  @JSName("iconUrl")
  var iconUrl_IconOptions: java.lang.String
}

object IconOptions {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    attribution: java.lang.String = null,
    className: java.lang.String = null,
    iconAnchor: PointExpression = null,
    iconRetinaUrl: java.lang.String = null,
    iconSize: PointExpression = null,
    pane: java.lang.String = null,
    popupAnchor: PointExpression = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: java.lang.String = null,
    shadowSize: PointExpression = null,
    shadowUrl: java.lang.String = null,
    tooltipAnchor: PointExpression = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (className != null) __obj.updateDynamic("className")(className)
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl)
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl)
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

