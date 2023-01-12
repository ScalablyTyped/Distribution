package typings.leafletPm

import typings.leaflet.mod.Layer
import typings.leaflet.mod.PathOptions
import typings.leafletPm.leafletMod.PM.Edit.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  trait LayerGroup extends StObject {
    
    var pm: typings.leafletPm.leafletMod.PM.Edit.LayerGroup
  }
  object LayerGroup {
    
    inline def apply(pm: typings.leafletPm.leafletMod.PM.Edit.LayerGroup): LayerGroup = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerGroup] (val x: Self) extends AnyVal {
      
      inline def setPm(value: typings.leafletPm.leafletMod.PM.Edit.LayerGroup): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var pm: typings.leafletPm.leafletMod.PM.Map
  }
  object Map {
    
    inline def apply(pm: typings.leafletPm.leafletMod.PM.Map): Map = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setPm(value: typings.leafletPm.leafletMod.PM.Map): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  trait Marker extends StObject {
    
    var pm: typings.leafletPm.leafletMod.PM.Edit.Marker
  }
  object Marker {
    
    inline def apply(pm: typings.leafletPm.leafletMod.PM.Edit.Marker): Marker = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setPm(value: typings.leafletPm.leafletMod.PM.Edit.Marker): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  object PM {
    
    trait Draw extends StObject {
      
      def getShapes(): js.Array[String]
    }
    object Draw {
      
      inline def apply(getShapes: () => js.Array[String]): Draw = {
        val __obj = js.Dynamic.literal(getShapes = js.Any.fromFunction0(getShapes))
        __obj.asInstanceOf[Draw]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Draw] (val x: Self) extends AnyVal {
        
        inline def setGetShapes(value: () => js.Array[String]): Self = StObject.set(x, "getShapes", js.Any.fromFunction0(value))
      }
    }
    
    trait DrawOptions extends StObject {
      
      var hintlineStyle: js.UndefOr[PathOptions] = js.undefined
      
      var pathOptions: js.UndefOr[PathOptions] = js.undefined
      
      var templineStyle: js.UndefOr[PathOptions] = js.undefined
    }
    object DrawOptions {
      
      inline def apply(): DrawOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DrawOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
        
        inline def setHintlineStyle(value: PathOptions): Self = StObject.set(x, "hintlineStyle", value.asInstanceOf[js.Any])
        
        inline def setHintlineStyleUndefined: Self = StObject.set(x, "hintlineStyle", js.undefined)
        
        inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        inline def setTemplineStyle(value: PathOptions): Self = StObject.set(x, "templineStyle", value.asInstanceOf[js.Any])
        
        inline def setTemplineStyleUndefined: Self = StObject.set(x, "templineStyle", js.undefined)
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
    
    trait EditOptions extends StObject {
      
      var draggable: js.UndefOr[Boolean] = js.undefined
      
      var snapDistance: js.UndefOr[Double] = js.undefined
      
      var snappable: js.UndefOr[Boolean] = js.undefined
    }
    object EditOptions {
      
      inline def apply(): EditOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EditOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EditOptions] (val x: Self) extends AnyVal {
        
        inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
        
        inline def setSnapDistanceUndefined: Self = StObject.set(x, "snapDistance", js.undefined)
        
        inline def setSnappable(value: Boolean): Self = StObject.set(x, "snappable", value.asInstanceOf[js.Any])
        
        inline def setSnappableUndefined: Self = StObject.set(x, "snappable", js.undefined)
      }
    }
    
    @js.native
    trait Map extends StObject {
      
      var Draw: typings.leafletPm.leafletMod.PM.Draw = js.native
      
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
    
    trait ToolbarOptions extends StObject {
      
      var deleteLayer: js.UndefOr[Boolean] = js.undefined
      
      // topleft | topright | bottomleft | bottomright
      var drawMarker: js.UndefOr[Boolean] = js.undefined
      
      var drawPolygon: js.UndefOr[Boolean] = js.undefined
      
      var drawPolyline: js.UndefOr[Boolean] = js.undefined
      
      var editPolygon: js.UndefOr[Boolean] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
    }
    object ToolbarOptions {
      
      inline def apply(): ToolbarOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ToolbarOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
        
        inline def setDeleteLayer(value: Boolean): Self = StObject.set(x, "deleteLayer", value.asInstanceOf[js.Any])
        
        inline def setDeleteLayerUndefined: Self = StObject.set(x, "deleteLayer", js.undefined)
        
        inline def setDrawMarker(value: Boolean): Self = StObject.set(x, "drawMarker", value.asInstanceOf[js.Any])
        
        inline def setDrawMarkerUndefined: Self = StObject.set(x, "drawMarker", js.undefined)
        
        inline def setDrawPolygon(value: Boolean): Self = StObject.set(x, "drawPolygon", value.asInstanceOf[js.Any])
        
        inline def setDrawPolygonUndefined: Self = StObject.set(x, "drawPolygon", js.undefined)
        
        inline def setDrawPolyline(value: Boolean): Self = StObject.set(x, "drawPolyline", value.asInstanceOf[js.Any])
        
        inline def setDrawPolylineUndefined: Self = StObject.set(x, "drawPolyline", js.undefined)
        
        inline def setEditPolygon(value: Boolean): Self = StObject.set(x, "editPolygon", value.asInstanceOf[js.Any])
        
        inline def setEditPolygonUndefined: Self = StObject.set(x, "editPolygon", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
  }
  
  trait Polygon extends StObject {
    
    var pm: Line
  }
  object Polygon {
    
    inline def apply(pm: Line): Polygon = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      inline def setPm(value: Line): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polyline extends StObject {
    
    var pm: Line
  }
  object Polyline {
    
    inline def apply(pm: Line): Polyline = {
      val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Polyline] (val x: Self) extends AnyVal {
      
      inline def setPm(value: Line): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    }
  }
}
