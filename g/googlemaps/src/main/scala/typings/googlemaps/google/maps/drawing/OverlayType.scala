package typings.googlemaps.google.maps.drawing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OverlayType with String] = js.native
  /* "circle" */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with String]
  
  /* "marker" */ @js.native
  object MARKER extends TopLevel[MARKER with String]
  
  /* "polygon" */ @js.native
  object POLYGON extends TopLevel[POLYGON with String]
  
  /* "polyline" */ @js.native
  object POLYLINE extends TopLevel[POLYLINE with String]
  
  /* "rectangle" */ @js.native
  object RECTANGLE extends TopLevel[RECTANGLE with String]
  
}

