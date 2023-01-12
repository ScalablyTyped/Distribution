package typings.leafletFreehandshapes

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PolylineOptions
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.add
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.delete
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.disable
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.enable
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.off
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.on
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.subtract
import typings.leafletFreehandshapes.leafletFreehandshapesStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", "FreeHandShapes")
  @js.native
  open class FreeHandShapes () extends FeatureGroup_[Any] {
    def this(options: FreeHandShapesOptions) = this()
    
    def addLayer(layer: Layer, noevent: Boolean): this.type = js.native
    
    def addPolygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Boolean,
      nomerge: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Boolean,
      nomerge: Boolean,
      noevent: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Boolean,
      nomerge: Unit,
      noevent: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Unit,
      nomerge: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Unit,
      nomerge: Boolean,
      noevent: Boolean
    ): Unit = js.native
    def addPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Unit,
      nomerge: Unit,
      noevent: Boolean
    ): Unit = js.native
    
    def drawStartedEvents(): Unit = js.native
    def drawStartedEvents(onoff: on | off): Unit = js.native
    
    def getCoordsFromLatLngs(latlngs: js.Array[Any]): js.Array[Any] = js.native
    
    @JSName("getEvents")
    def getEvents_MFreeHandShapes(): StringDictionary[LeafletEventHandlerFn] = js.native
    
    def getLatLngsFromJSON(json: Feature[Geometry, GeoJsonProperties]): js.Array[Any] = js.native
    
    def getPolygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Polygon = js.native
    
    def getSimplified(): js.Array[LatLngTuple] = js.native
    def getSimplified(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): js.Array[LatLngTuple] = js.native
    
    def initialize(): Unit = js.native
    def initialize(options: FreeHandShapesOptions): Unit = js.native
    
    def merge(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Unit = js.native
    
    def mouseDown(event: LeafletMouseEvent): Unit = js.native
    
    def mouseMove(event: LeafletMouseEvent): Unit = js.native
    
    def mouseUpLeave(): Unit = js.native
    
    def polygonClick(polygon: Polygon): Unit = js.native
    def polygonClick(polygon: Polygon, event: LeafletEvent): Unit = js.native
    
    def resetTracer(): Unit = js.native
    
    def setMapClass(): Unit = js.native
    
    def setMapPermissions(): Unit = js.native
    def setMapPermissions(method: enable | disable): Unit = js.native
    
    def setMode(): Unit = js.native
    def setMode(`type`: add | subtract | view | delete): Unit = js.native
    
    def startDraw(): Unit = js.native
    
    def stopDraw(): Unit = js.native
    
    def subtract(polygon: Polygon): Unit = js.native
    
    def subtractPolygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Unit = js.native
    def subtractPolygon(
      latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
      force: Boolean
    ): Unit = js.native
    
    def zoomMoveStart(): Unit = js.native
  }
  
  trait FreeHandShapesOptions extends StObject {
    
    var concave_polygons: js.UndefOr[Boolean] = js.undefined
    
    var merge_polygons: js.UndefOr[Boolean] = js.undefined
    
    var polygon: js.UndefOr[PolylineOptions] = js.undefined
    
    var polyline: js.UndefOr[PolylineOptions] = js.undefined
    
    var simplify_tolerance: js.UndefOr[Double] = js.undefined
  }
  object FreeHandShapesOptions {
    
    inline def apply(): FreeHandShapesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreeHandShapesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FreeHandShapesOptions] (val x: Self) extends AnyVal {
      
      inline def setConcave_polygons(value: Boolean): Self = StObject.set(x, "concave_polygons", value.asInstanceOf[js.Any])
      
      inline def setConcave_polygonsUndefined: Self = StObject.set(x, "concave_polygons", js.undefined)
      
      inline def setMerge_polygons(value: Boolean): Self = StObject.set(x, "merge_polygons", value.asInstanceOf[js.Any])
      
      inline def setMerge_polygonsUndefined: Self = StObject.set(x, "merge_polygons", js.undefined)
      
      inline def setPolygon(value: PolylineOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setPolyline(value: PolylineOptions): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      inline def setSimplify_tolerance(value: Double): Self = StObject.set(x, "simplify_tolerance", value.asInstanceOf[js.Any])
      
      inline def setSimplify_toleranceUndefined: Self = StObject.set(x, "simplify_tolerance", js.undefined)
    }
  }
  
  trait Polygon extends StObject {
    
    def destroy(): Unit
    
    def getGroup(): Unit
    
    def onClick(event: LeafletEvent): Unit
  }
  object Polygon {
    
    inline def apply(destroy: () => Unit, getGroup: () => Unit, onClick: LeafletEvent => Unit): Polygon = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getGroup = js.Any.fromFunction0(getGroup), onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetGroup(value: () => Unit): Self = StObject.set(x, "getGroup", js.Any.fromFunction0(value))
      
      inline def setOnClick(value: LeafletEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
