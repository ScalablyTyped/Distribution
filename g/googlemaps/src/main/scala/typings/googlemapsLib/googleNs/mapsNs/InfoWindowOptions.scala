package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  /**
    * Content to display in the InfoWindow. This can be an HTML element, a
    * plain-text string, or a string containing HTML. The InfoWindow will be
    * sized according to the content. To set an explicit size for the content,
    * set content to be a HTML element with that size.
    * @type {(string|Node)}
    */
  var content: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  /**
    * Disable auto-pan on open. By default, the info window will pan the map so
    * that it is fully visible when it opens.
    */
  var disableAutoPan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum width of the infowindow, regardless of content's width.
    * This value is only considered if it is set before a call to open.
    * To change the maximum width when changing content, call close,
    * setOptions, and then open.
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset, in pixels, of the tip of the info window from the point on
    * the map at whose geographical coordinates the info window is anchored. If
    * an InfoWindow is opened with an anchor, the pixelOffset will be
    * calculated from the anchor's anchorPoint property.
    */
  var pixelOffset: js.UndefOr[Size] = js.undefined
  /**
    * The LatLng at which to display this InfoWindow. If the InfoWindow is
    * opened with an anchor, the anchor's position will be used instead.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /**
    * All InfoWindows are displayed on the map in order of their zIndex,
    * with higher values displaying in front of InfoWindows with lower values.
    * By default, InfoWindows are displayed according to their latitude,
    * with InfoWindows of lower latitudes appearing in front of InfoWindows at
    * higher latitudes. InfoWindows are always displayed in front of markers.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

