package typings.leafletDraw.mod

import typings.leaflet.mod.Handler
import typings.leaflet.mod.LatLngExpression
import typings.leafletDraw.mod.EditOptions.EditPolyVerticesEditOptions
import typings.leafletDraw.mod.EditOptions.EditSimpleShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Edit {
  
  @JSImport("leaflet", "Edit.Circle")
  @js.native
  open class Circle protected () extends CircleMarker {
    def this(shape: Circle) = this()
    def this(shape: Circle, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.CircleMarker")
  @js.native
  open class CircleMarker protected () extends SimpleShape {
    def this(shape: CircleMarker) = this()
    def this(shape: CircleMarker, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.Marker")
  @js.native
  open class Marker protected () extends Handler {
    def this(marker: Marker) = this()
    def this(marker: Marker, options: js.Object) = this()
  }
  
  @JSImport("leaflet", "Edit.PolyVerticesEdit")
  @js.native
  open class PolyVerticesEdit protected () extends Handler {
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression]) = this()
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression], options: EditPolyVerticesEditOptions) = this()
    
    def updateMarkers(): Unit = js.native
  }
  
  @JSImport("leaflet", "Edit.Polyline")
  @js.native
  open class Polyline protected () extends Handler {
    def this(polyline: typings.leafletDraw.mod.Draw.Polyline) = this()
    
    def updateMarkers(): Unit = js.native
  }
  
  @JSImport("leaflet", "Edit.Rectangle")
  @js.native
  open class Rectangle protected () extends SimpleShape {
    def this(shape: Rectangle) = this()
    def this(shape: Rectangle, options: EditSimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Edit.SimpleShape")
  @js.native
  open class SimpleShape protected () extends Handler {
    def this(shape: SimpleShape) = this()
    def this(shape: SimpleShape, options: EditSimpleShapeOptions) = this()
    
    def updateMarkers(): Unit = js.native
  }
}
