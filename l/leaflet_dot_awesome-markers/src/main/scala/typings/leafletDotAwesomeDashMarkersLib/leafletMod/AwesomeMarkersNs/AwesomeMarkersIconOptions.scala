package typings
package leafletDotAwesomeDashMarkersLib.leafletMod.AwesomeMarkersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwesomeMarkersIconOptions
  extends leafletLib.leafletMod.BaseIconOptions {
  /**
    * Additional classes in the created tag
    */
  var extraClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the icon. See glyphicons or font-awesome.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
    */
  var iconColor: js.UndefOr[
    leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.white | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.black | java.lang.String
  ] = js.undefined
  /**
    * Color of the marker
    */
  var markerColor: js.UndefOr[
    leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.red | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkred | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.orange | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.green | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkgreen | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.blue | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.purple | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkpurple | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.cadetblue
  ] = js.undefined
  /**
    * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
    */
  var prefix: js.UndefOr[
    leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.fa | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.glyphicon
  ] = js.undefined
  /**
    * Make the icon spin. true or false. Font-awesome required
    */
  var spin: js.UndefOr[scala.Boolean] = js.undefined
}

object AwesomeMarkersIconOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    className: java.lang.String = null,
    extraClasses: java.lang.String = null,
    icon: java.lang.String = null,
    iconAnchor: leafletLib.leafletMod.PointExpression = null,
    iconColor: leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.white | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.black | java.lang.String = null,
    iconRetinaUrl: java.lang.String = null,
    iconSize: leafletLib.leafletMod.PointExpression = null,
    iconUrl: java.lang.String = null,
    markerColor: leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.red | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkred | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.orange | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.green | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkgreen | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.blue | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.purple | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.darkpurple | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.cadetblue = null,
    pane: java.lang.String = null,
    popupAnchor: leafletLib.leafletMod.PointExpression = null,
    prefix: leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.fa | leafletDotAwesomeDashMarkersLib.leafletDotAwesomeDashMarkersLibStrings.glyphicon = null,
    shadowAnchor: leafletLib.leafletMod.PointExpression = null,
    shadowRetinaUrl: java.lang.String = null,
    shadowSize: leafletLib.leafletMod.PointExpression = null,
    shadowUrl: java.lang.String = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipAnchor: leafletLib.leafletMod.PointExpression = null
  ): AwesomeMarkersIconOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraClasses != null) __obj.updateDynamic("extraClasses")(extraClasses)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl)
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl)
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwesomeMarkersIconOptions]
  }
}

