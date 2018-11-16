package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CircleOptions extends js.Object {
  /** The center */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /** Indicates whether this Circle handles mouse events. Defaults to true. */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to true, the user can drag this circle over the map. Defaults to
       * false.
       */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to true, the user can edit this circle by dragging the control
       * points shown at the center and around the circumference of the circle.
       * Defaults to false.
       */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The fill color. All CSS3 colors are supported except for extended named
       * colors.
       */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Map on which to display Circle. */
  var map: js.UndefOr[Map] = js.undefined
  /** The radius in meters on the Earth's surface */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
       * The stroke color. All CSS3 colors are supported except for extended
       * named colors.
       */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * The stroke position. Defaults to CENTER. This property is not supported
       * on Internet Explorer 8 and earlier.
       */
  var strokePosition: js.UndefOr[StrokePosition] = js.undefined
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  /** Whether this circle is visible on the map. Defaults to true. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

