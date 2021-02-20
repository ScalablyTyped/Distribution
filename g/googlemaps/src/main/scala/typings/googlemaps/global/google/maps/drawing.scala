package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.drawing.DrawingManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("google.maps.drawing.DrawingManager")
  @js.native
  class DrawingManager ()
    extends typings.googlemaps.google.maps.drawing.DrawingManager {
    def this(options: DrawingManagerOptions) = this()
  }
  
  /**
    * The types of overlay that may be created by the DrawingManager. Specify
    * these by value, or by using the constant's name. For example, 'polygon'
    * or google.maps.drawing.OverlayType.POLYGON.
    */
  @JSGlobal("google.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.drawing.OverlayType with String] = js.native
    
    /* "circle" */ val CIRCLE: typings.googlemaps.google.maps.drawing.OverlayType.CIRCLE with String = js.native
    
    /* "marker" */ val MARKER: typings.googlemaps.google.maps.drawing.OverlayType.MARKER with String = js.native
    
    /* "polygon" */ val POLYGON: typings.googlemaps.google.maps.drawing.OverlayType.POLYGON with String = js.native
    
    /* "polyline" */ val POLYLINE: typings.googlemaps.google.maps.drawing.OverlayType.POLYLINE with String = js.native
    
    /* "rectangle" */ val RECTANGLE: typings.googlemaps.google.maps.drawing.OverlayType.RECTANGLE with String = js.native
  }
}
