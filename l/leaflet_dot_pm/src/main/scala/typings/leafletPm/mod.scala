package typings.leafletPm

import typings.leaflet.mod.Layer
import typings.leaflet.mod.PathOptions
import typings.leafletPm.mod.PM.Edit.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait LayerGroup extends StObject {
    
    var pm: typings.leafletPm.mod.PM.Edit.LayerGroup = js.native
  }
  object LayerGroup {
    
    @scala.inline
    def apply(pm: typings.leafletPm.mod.PM.Edit.LayerGroup): LayerGroup = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerGroup]
    }
    
    @scala.inline
    implicit class LayerGroupMutableBuilder[Self <: LayerGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPm(value: typings.leafletPm.mod.PM.Edit.LayerGroup): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Map extends StObject {
    
    var pm: typings.leafletPm.mod.PM.Map = js.native
  }
  object Map {
    
    @scala.inline
    def apply(pm: typings.leafletPm.mod.PM.Map): Map = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPm(value: typings.leafletPm.mod.PM.Map): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Marker extends StObject {
    
    var pm: typings.leafletPm.mod.PM.Edit.Marker = js.native
  }
  object Marker {
    
    @scala.inline
    def apply(pm: typings.leafletPm.mod.PM.Edit.Marker): Marker = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit class MarkerMutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPm(value: typings.leafletPm.mod.PM.Edit.Marker): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  object PM {
    
    @js.native
    trait Draw extends StObject {
      
      def getShapes(): js.Array[String] = js.native
    }
    object Draw {
      
      @scala.inline
      def apply(getShapes: () => js.Array[String]): Draw = {
        val __obj = js.Dynamic.literal(getShapes = js.Any.fromFunction0(getShapes))
        __obj.asInstanceOf[Draw]
      }
      
      @scala.inline
      implicit class DrawMutableBuilder[Self <: Draw] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetShapes(value: () => js.Array[String]): Self = StObject.set(x, "getShapes", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait DrawOptions extends StObject {
      
      var hintlineStyle: js.UndefOr[PathOptions] = js.native
      
      var pathOptions: js.UndefOr[PathOptions] = js.native
      
      var templineStyle: js.UndefOr[PathOptions] = js.native
    }
    object DrawOptions {
      
      @scala.inline
      def apply(): DrawOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DrawOptions]
      }
      
      @scala.inline
      implicit class DrawOptionsMutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHintlineStyle(value: PathOptions): Self = StObject.set(x, "hintlineStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHintlineStyleUndefined: Self = StObject.set(x, "hintlineStyle", js.undefined)
        
        @scala.inline
        def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        @scala.inline
        def setTemplineStyle(value: PathOptions): Self = StObject.set(x, "templineStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplineStyleUndefined: Self = StObject.set(x, "templineStyle", js.undefined)
      }
    }
    
    object Edit {
      
      @js.native
      trait LayerGroup extends StObject {
        
        def disable(): Unit = js.native
        
        def dragging(): Boolean = js.native
        
        def enable(): Unit = js.native
        def enable(options: EditOptions): Unit = js.native
        
        def enabled(): Boolean = js.native
        
        def findLayers(): js.Array[Layer] = js.native
        
        def getOptions(): EditOptions = js.native
        
        def toggleEdit(): Unit = js.native
        def toggleEdit(options: EditOptions): Unit = js.native
      }
      
      @js.native
      trait Line extends StObject {
        
        def disable(): Unit = js.native
        def disable(poly: Layer): Unit = js.native
        
        def enable(): Unit = js.native
        def enable(options: EditOptions): Unit = js.native
        
        def enabled(): Boolean = js.native
        
        def toggleEdit(): Unit = js.native
        def toggleEdit(options: EditOptions): Unit = js.native
      }
      
      @js.native
      trait Marker extends StObject {
        
        def disable(): Unit = js.native
        
        def enable(): Unit = js.native
        def enable(options: EditOptions): Unit = js.native
        
        def enabled(): Boolean = js.native
        
        def toggleEdit(): Unit = js.native
        def toggleEdit(options: EditOptions): Unit = js.native
      }
    }
    
    @js.native
    trait EditOptions extends StObject {
      
      var draggable: js.UndefOr[Boolean] = js.native
      
      var snapDistance: js.UndefOr[Double] = js.native
      
      var snappable: js.UndefOr[Boolean] = js.native
    }
    object EditOptions {
      
      @scala.inline
      def apply(): EditOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EditOptions]
      }
      
      @scala.inline
      implicit class EditOptionsMutableBuilder[Self <: EditOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        @scala.inline
        def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapDistanceUndefined: Self = StObject.set(x, "snapDistance", js.undefined)
        
        @scala.inline
        def setSnappable(value: Boolean): Self = StObject.set(x, "snappable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnappableUndefined: Self = StObject.set(x, "snappable", js.undefined)
      }
    }
    
    @js.native
    trait Map extends StObject {
      
      var Draw: typings.leafletPm.mod.PM.Draw = js.native
      
      def addControls(): Unit = js.native
      def addControls(options: ToolbarOptions): Unit = js.native
      
      def disableDraw(shape: String): Unit = js.native
      
      def enableDraw(shape: String): Unit = js.native
      def enableDraw(shape: String, options: DrawOptions): Unit = js.native
      
      def globalEditEnabled(): Boolean = js.native
      
      def setPathOptions(options: PathOptions): Unit = js.native
      
      def toggleGlobalEditMode(): Unit = js.native
      def toggleGlobalEditMode(options: EditOptions): Unit = js.native
      
      def toggleRemoval(enabled: Boolean): Unit = js.native
    }
    
    @js.native
    trait ToolbarOptions extends StObject {
      
      var deleteLayer: js.UndefOr[Boolean] = js.native
      
      // topleft | topright | bottomleft | bottomright
      var drawMarker: js.UndefOr[Boolean] = js.native
      
      var drawPolygon: js.UndefOr[Boolean] = js.native
      
      var drawPolyline: js.UndefOr[Boolean] = js.native
      
      var editPolygon: js.UndefOr[Boolean] = js.native
      
      var position: js.UndefOr[String] = js.native
    }
    object ToolbarOptions {
      
      @scala.inline
      def apply(): ToolbarOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ToolbarOptions]
      }
      
      @scala.inline
      implicit class ToolbarOptionsMutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleteLayer(value: Boolean): Self = StObject.set(x, "deleteLayer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteLayerUndefined: Self = StObject.set(x, "deleteLayer", js.undefined)
        
        @scala.inline
        def setDrawMarker(value: Boolean): Self = StObject.set(x, "drawMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawMarkerUndefined: Self = StObject.set(x, "drawMarker", js.undefined)
        
        @scala.inline
        def setDrawPolygon(value: Boolean): Self = StObject.set(x, "drawPolygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawPolygonUndefined: Self = StObject.set(x, "drawPolygon", js.undefined)
        
        @scala.inline
        def setDrawPolyline(value: Boolean): Self = StObject.set(x, "drawPolyline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawPolylineUndefined: Self = StObject.set(x, "drawPolyline", js.undefined)
        
        @scala.inline
        def setEditPolygon(value: Boolean): Self = StObject.set(x, "editPolygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditPolygonUndefined: Self = StObject.set(x, "editPolygon", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
  }
  
  @js.native
  trait Polygon extends StObject {
    
    var pm: Line = js.native
  }
  object Polygon {
    
    @scala.inline
    def apply(pm: Line): Polygon = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPm(value: Line): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polyline extends StObject {
    
    var pm: Line = js.native
  }
  object Polyline {
    
    @scala.inline
    def apply(pm: Line): Polyline = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyline]
    }
    
    @scala.inline
    implicit class PolylineMutableBuilder[Self <: Polyline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPm(value: Line): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
}
