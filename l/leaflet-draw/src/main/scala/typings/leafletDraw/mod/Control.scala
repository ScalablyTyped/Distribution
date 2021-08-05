package typings.leafletDraw.mod

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_
import typings.leaflet.mod.FeatureGroup_
import typings.leafletDraw.leafletDrawBooleans.`false`
import typings.leafletDraw.mod.DrawOptions.CircleMarkerOptions
import typings.leafletDraw.mod.DrawOptions.CircleOptions
import typings.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import typings.leafletDraw.mod.DrawOptions.PolygonOptions
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Control {
  
  @JSImport("leaflet", "Control.Draw")
  @js.native
  class Draw () extends Control_ {
    def this(options: DrawConstructorOptions) = this()
    
    def initialize(): Unit = js.native
    def initialize(options: typings.leafletDraw.mod.Control.DrawOptions): Unit = js.native
    
    def setDrawingOptions(): Unit = js.native
    def setDrawingOptions(options: typings.leafletDraw.mod.Control.DrawOptions): Unit = js.native
  }
  
  trait DrawConstructorOptions extends StObject {
    
    /**
      * The options used to configure the draw toolbar.
      *
      * @default {}
      */
    var draw: js.UndefOr[typings.leafletDraw.mod.Control.DrawOptions] = js.undefined
    
    /**
      * The options used to configure the edit toolbar.
      *
      * @default false
      */
    var edit: js.UndefOr[typings.leafletDraw.mod.Control.EditOptions] = js.undefined
    
    /**
      * The initial position of the control (one of the map corners).
      *
      * @default 'topleft'
      */
    var position: js.UndefOr[ControlPosition] = js.undefined
  }
  object DrawConstructorOptions {
    
    inline def apply(): DrawConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawConstructorOptions]
    }
    
    extension [Self <: DrawConstructorOptions](x: Self) {
      
      inline def setDraw(value: typings.leafletDraw.mod.Control.DrawOptions): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      inline def setEdit(value: typings.leafletDraw.mod.Control.EditOptions): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait DrawOptions extends StObject {
    
    /**
      * Circle draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var circle: js.UndefOr[CircleOptions | `false`] = js.undefined
    
    /**
      * Circle marker draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var circlemarker: js.UndefOr[CircleMarkerOptions | `false`] = js.undefined
    
    /**
      * Marker draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var marker: js.UndefOr[MarkerOptions | `false`] = js.undefined
    
    /**
      * Polygon draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var polygon: js.UndefOr[PolygonOptions | `false`] = js.undefined
    
    /**
      * Polyline draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var polyline: js.UndefOr[PolylineOptions | `false`] = js.undefined
    
    /**
      * Rectangle draw handler options. Set to false to disable handler.
      *
      * @default {}
      */
    var rectangle: js.UndefOr[RectangleOptions | `false`] = js.undefined
  }
  object DrawOptions {
    
    inline def apply(): typings.leafletDraw.mod.Control.DrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.leafletDraw.mod.Control.DrawOptions]
    }
    
    extension [Self <: typings.leafletDraw.mod.Control.DrawOptions](x: Self) {
      
      inline def setCircle(value: CircleOptions | `false`): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setCirclemarker(value: CircleMarkerOptions | `false`): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
      
      inline def setCirclemarkerUndefined: Self = StObject.set(x, "circlemarker", js.undefined)
      
      inline def setMarker(value: MarkerOptions | `false`): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setPolygon(value: PolygonOptions | `false`): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setPolyline(value: PolylineOptions | `false`): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      inline def setRectangle(value: RectangleOptions | `false`): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    }
  }
  
  trait EditOptions extends StObject {
    
    /**
      * Edit handler options. Set to false to disable handler.
      *
      * @default null
      */
    var edit: js.UndefOr[EditHandlerOptions | `false`] = js.undefined
    
    /**
      * This is the FeatureGroup that stores all editable shapes.
      * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
      *
      * @default null
      */
    var featureGroup: FeatureGroup_[js.Any]
    
    /**
      * Delete handler options. Set to false to disable handler.
      *
      * Default value: null
      */
    var remove: js.UndefOr[Null | `false`] = js.undefined
  }
  object EditOptions {
    
    inline def apply(featureGroup: FeatureGroup_[js.Any]): typings.leafletDraw.mod.Control.EditOptions = {
      val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leafletDraw.mod.Control.EditOptions]
    }
    
    extension [Self <: typings.leafletDraw.mod.Control.EditOptions](x: Self) {
      
      inline def setEdit(value: EditHandlerOptions | `false`): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setFeatureGroup(value: FeatureGroup_[js.Any]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: `false`): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
