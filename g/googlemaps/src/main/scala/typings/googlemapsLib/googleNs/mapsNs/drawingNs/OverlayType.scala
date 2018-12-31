package typings
package googlemapsLib.googleNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayType extends js.Object

@JSGlobal("google.maps.drawing.OverlayType")
@js.native
object OverlayType extends js.Object {
  /**
    * Specifies that the DrawingManager creates circles, and that the overlay
    * given in the overlaycomplete event is a circle.
    */
  @js.native
  sealed trait CIRCLE
    extends googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType
  
  /**
    * Specifies that the DrawingManager creates markers, and that the overlay
    * given in the overlaycomplete event is a marker.
    */
  @js.native
  sealed trait MARKER
    extends googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType
  
  /**
    * Specifies that the DrawingManager creates polygons, and that the
    * overlay given in the overlaycomplete event is a polygon.
    */
  @js.native
  sealed trait POLYGON
    extends googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType
  
  /**
    * Specifies that the DrawingManager creates polylines, and that the
    * overlay given in the overlaycomplete event is a polyline.
    */
  @js.native
  sealed trait POLYLINE
    extends googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType
  
  /**
    * Specifies that the DrawingManager creates rectangles, and that the
    * overlay given in the overlaycomplete event is a rectangle.
    */
  @js.native
  sealed trait RECTANGLE
    extends googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType
  
  val CIRCLE: CIRCLE with java.lang.String = js.native
  val MARKER: MARKER with java.lang.String = js.native
  val POLYGON: POLYGON with java.lang.String = js.native
  val POLYLINE: POLYLINE with java.lang.String = js.native
  val RECTANGLE: RECTANGLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.drawingNs.OverlayType with java.lang.String] = js.native
}

