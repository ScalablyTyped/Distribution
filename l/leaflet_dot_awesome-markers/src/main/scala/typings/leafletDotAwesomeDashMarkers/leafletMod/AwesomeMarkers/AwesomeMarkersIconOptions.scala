package typings.leafletDotAwesomeDashMarkers.leafletMod.AwesomeMarkers

import typings.leaflet.leafletMod.BaseIconOptions
import typings.leaflet.leafletMod.PointExpression
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.black
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.blue
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.cadetblue
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.darkgreen
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.darkpurple
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.darkred
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.fa
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.glyphicon
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.green
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.orange
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.purple
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.red
import typings.leafletDotAwesomeDashMarkers.leafletDotAwesomeDashMarkersStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwesomeMarkersIconOptions extends BaseIconOptions {
  /**
    * Additional classes in the created tag
    */
  var extraClasses: js.UndefOr[String] = js.undefined
  /**
    * Name of the icon. See glyphicons or font-awesome.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
    */
  var iconColor: js.UndefOr[white | black | String] = js.undefined
  /**
    * Color of the marker
    */
  var markerColor: js.UndefOr[
    red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue
  ] = js.undefined
  /**
    * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
    */
  var prefix: js.UndefOr[fa | glyphicon] = js.undefined
  /**
    * Make the icon spin. true or false. Font-awesome required
    */
  var spin: js.UndefOr[Boolean] = js.undefined
}

object AwesomeMarkersIconOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    className: String = null,
    extraClasses: String = null,
    icon: String = null,
    iconAnchor: PointExpression = null,
    iconColor: white | black | String = null,
    iconRetinaUrl: String = null,
    iconSize: PointExpression = null,
    iconUrl: String = null,
    markerColor: red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue = null,
    pane: String = null,
    popupAnchor: PointExpression = null,
    prefix: fa | glyphicon = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: String = null,
    shadowSize: PointExpression = null,
    shadowUrl: String = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    tooltipAnchor: PointExpression = null
  ): AwesomeMarkersIconOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraClasses != null) __obj.updateDynamic("extraClasses")(extraClasses.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwesomeMarkersIconOptions]
  }
}

