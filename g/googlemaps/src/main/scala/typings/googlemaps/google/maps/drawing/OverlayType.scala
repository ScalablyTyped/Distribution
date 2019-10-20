package typings.googlemaps.google.maps.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayType extends js.Object

/**
  * The types of overlay that may be created by the DrawingManager. Specify
  * these by value, or by using the constant's name. For example, 'polygon'
  * or google.maps.drawing.OverlayType.POLYGON.
  */
@JSGlobal("google.maps.drawing.OverlayType")
@js.native
object OverlayType extends js.Object {
  /**
    * Specifies that the DrawingManager creates circles, and that the overlay
    * given in the overlaycomplete event is a circle.
    */
  @js.native
  sealed trait CIRCLE extends OverlayType
  
  /**
    * Specifies that the DrawingManager creates markers, and that the overlay
    * given in the overlaycomplete event is a marker.
    */
  @js.native
  sealed trait MARKER extends OverlayType
  
  /**
    * Specifies that the DrawingManager creates polygons, and that the
    * overlay given in the overlaycomplete event is a polygon.
    */
  @js.native
  sealed trait POLYGON extends OverlayType
  
  /**
    * Specifies that the DrawingManager creates polylines, and that the
    * overlay given in the overlaycomplete event is a polyline.
    */
  @js.native
  sealed trait POLYLINE extends OverlayType
  
  /**
    * Specifies that the DrawingManager creates rectangles, and that the
    * overlay given in the overlaycomplete event is a rectangle.
    */
  @js.native
  sealed trait RECTANGLE extends OverlayType
  
  /* "circle" */ val CIRCLE: typings.googlemaps.google.maps.drawing.OverlayType.CIRCLE with String = js.native
  /* "marker" */ val MARKER: typings.googlemaps.google.maps.drawing.OverlayType.MARKER with String = js.native
  /* "polygon" */ val POLYGON: typings.googlemaps.google.maps.drawing.OverlayType.POLYGON with String = js.native
  /* "polyline" */ val POLYLINE: typings.googlemaps.google.maps.drawing.OverlayType.POLYLINE with String = js.native
  /* "rectangle" */ val RECTANGLE: typings.googlemaps.google.maps.drawing.OverlayType.RECTANGLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayType with String] = js.native
}

