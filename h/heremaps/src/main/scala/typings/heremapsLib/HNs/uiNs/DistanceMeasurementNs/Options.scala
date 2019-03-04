package typings
package heremapsLib.HNs.uiNs.DistanceMeasurementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property startIcon {H.map.Icon=} - the icon to use for the first measurement point
  * @property stopoverIcon {H.map.Icon=} - the icon to use for the intermediate measurement points
  * @property endIcon {H.map.Icon=} - the icon to use for the last measurement point
  * @property splitIcon {H.map.Icon=} - the icon to use for indicating position under pointer over the line where new point will be created once user clicks
  * @property lineStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to use for connecting lines of the measurement points
  * @property distanceFormatter {function(number)=} - Optional function used for formatting a distance. By default distance measurement tool will do the formatting according to the
  * specified measurement unit (see H.ui.UI.Options#unitSystem)
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment] = js.undefined
  var distanceFormatter: js.UndefOr[js.Function1[/* n */ scala.Double, scala.Unit]] = js.undefined
  var endIcon: js.UndefOr[heremapsLib.HNs.mapNs.Icon] = js.undefined
  var lineStyle: heremapsLib.HNs.mapNs.SpatialStyle | heremapsLib.HNs.mapNs.SpatialStyleNs.Options
  var splitIcon: js.UndefOr[heremapsLib.HNs.mapNs.Icon] = js.undefined
  var startIcon: js.UndefOr[heremapsLib.HNs.mapNs.Icon] = js.undefined
  var stopoverIcon: js.UndefOr[heremapsLib.HNs.mapNs.Icon] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    lineStyle: heremapsLib.HNs.mapNs.SpatialStyle | heremapsLib.HNs.mapNs.SpatialStyleNs.Options,
    alignment: heremapsLib.HNs.uiNs.LayoutAlignment = null,
    distanceFormatter: js.Function1[/* n */ scala.Double, scala.Unit] = null,
    endIcon: heremapsLib.HNs.mapNs.Icon = null,
    splitIcon: heremapsLib.HNs.mapNs.Icon = null,
    startIcon: heremapsLib.HNs.mapNs.Icon = null,
    stopoverIcon: heremapsLib.HNs.mapNs.Icon = null
  ): Options = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (distanceFormatter != null) __obj.updateDynamic("distanceFormatter")(distanceFormatter)
    if (endIcon != null) __obj.updateDynamic("endIcon")(endIcon)
    if (splitIcon != null) __obj.updateDynamic("splitIcon")(splitIcon)
    if (startIcon != null) __obj.updateDynamic("startIcon")(startIcon)
    if (stopoverIcon != null) __obj.updateDynamic("stopoverIcon")(stopoverIcon)
    __obj.asInstanceOf[Options]
  }
}

