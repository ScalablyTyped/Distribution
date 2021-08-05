package typings.leafletEditable

import org.scalablytyped.runtime.Instantiable2
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Make geometries editable in Leaflet.
    *
    * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
    * control editing of geometries. So you can easily build your own UI with your own needs and choices.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mixin.LeafletMixinEvents * / any */ @js.native
  trait Editable extends StObject {
    
    /**
      * When you need to commit any ongoing drawing, without needing to know which editor is active.
      */
    def commitDrawing(): Unit = js.native
    
    var currentPolygon: Polyline | Polygon | Marker = js.native
    
    /**
      * Options to pass to L.Editable when instanciating.
      */
    var options: EditOptions = js.native
    
    /**
      * Start adding a marker. If latlng is given, the marker will be shown first at this point. In any case, it
      * will follow the user mouse, and will have a final latlng on next click (or touch). If options is given,
      * it will be passed to the marker class constructor.
      */
    def startMarker(): Marker = js.native
    def startMarker(latLng: Unit, options: MarkerOptions): Marker = js.native
    def startMarker(latLng: LatLng_): Marker = js.native
    def startMarker(latLng: LatLng_, options: MarkerOptions): Marker = js.native
    
    /**
      * Start drawing a polygon. If latlng is given, a first point will be added. In any case, continuing on user
      * click. If options is given, it will be passed to the polygon class constructor.
      */
    def startPolygon(): Polygon = js.native
    def startPolygon(latLng: Unit, options: PolylineOptions): Polygon = js.native
    def startPolygon(latLng: LatLng_): Polygon = js.native
    def startPolygon(latLng: LatLng_, options: PolylineOptions): Polygon = js.native
    
    /**
      * Start drawing a polyline. If latlng is given, a first point will be added. In any case, continuing on user
      * click. If options is given, it will be passed to the polyline class constructor.
      */
    def startPolyline(): Polyline = js.native
    def startPolyline(latLng: Unit, options: PolylineOptions): Polyline = js.native
    def startPolyline(latLng: LatLng_): Polyline = js.native
    def startPolyline(latLng: LatLng_, options: PolylineOptions): Polyline = js.native
    
    /**
      * When you need to stop any ongoing drawing, without needing to know which editor is active.
      */
    def stopDrawing(): Unit = js.native
  }
  @JSImport("leaflet", "Editable")
  @js.native
  def Editable: EditableStatic = js.native
  inline def Editable_=(x: EditableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editable")(x.asInstanceOf[js.Any])
  
  /**
    * When editing a feature (marker, polyline…), an editor is attached to it. This editor basically knows
    * how to handle the edition.
    */
  trait BaseEditor extends StObject {
    
    /**
      * Remove editing tools.
      */
    def disable(): MarkerEditor | PolylineEditor | PolygonEditor
    
    /**
      * Set up the drawing tools for the feature to be editable.
      */
    def enable(): MarkerEditor | PolylineEditor | PolygonEditor
  }
  object BaseEditor {
    
    inline def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor
    ): BaseEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[BaseEditor]
    }
    
    extension [Self <: BaseEditor](x: Self) {
      
      inline def setDisable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  trait EditOptions extends StObject {
    
    /**
      * CSS class to be added to the map container while drawing.
      */
    var drawingCSSClass: js.UndefOr[String] = js.undefined
    
    /**
      * Layer used to store edit tools (vertex, line guide…).
      */
    var editLayer: js.UndefOr[
        LayerGroup_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Default layer used to store drawn features (marker, polyline…).
      */
    var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.undefined
    
    /**
      * Options to be passed to the line guides.
      */
    var lineGuideOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used when creating a new Marker.
      */
    var markerClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used as Marker editor.
      */
    var markerEditorClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used as middle vertex, pulled by the user to create a new point in the middle of a path.
      */
    var middleMarkerClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used when creating a new Polygon.
      */
    var polygonClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used as Polygon editor.
      */
    var polygonEditorClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used when creating a new Polyline.
      */
    var polylineClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Class to be used as Polyline editor.
      */
    var polylineEditorClass: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Set this to true if you don't want middle markers.
      */
    var skipMiddleMarkers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class to be used as vertex, for path editing.
      */
    var vertexMarkerClass: js.UndefOr[js.Object] = js.undefined
  }
  object EditOptions {
    
    inline def apply(): EditOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditOptions]
    }
    
    extension [Self <: EditOptions](x: Self) {
      
      inline def setDrawingCSSClass(value: String): Self = StObject.set(x, "drawingCSSClass", value.asInstanceOf[js.Any])
      
      inline def setDrawingCSSClassUndefined: Self = StObject.set(x, "drawingCSSClass", js.undefined)
      
      inline def setEditLayer(
        value: LayerGroup_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ js.Any
            ]
      ): Self = StObject.set(x, "editLayer", value.asInstanceOf[js.Any])
      
      inline def setEditLayerUndefined: Self = StObject.set(x, "editLayer", js.undefined)
      
      inline def setFeaturesLayer(value: LayerGroup_[Polyline | Polygon | Marker]): Self = StObject.set(x, "featuresLayer", value.asInstanceOf[js.Any])
      
      inline def setFeaturesLayerUndefined: Self = StObject.set(x, "featuresLayer", js.undefined)
      
      inline def setLineGuideOptions(value: js.Object): Self = StObject.set(x, "lineGuideOptions", value.asInstanceOf[js.Any])
      
      inline def setLineGuideOptionsUndefined: Self = StObject.set(x, "lineGuideOptions", js.undefined)
      
      inline def setMarkerClass(value: js.Object): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
      
      inline def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
      
      inline def setMarkerEditorClass(value: js.Object): Self = StObject.set(x, "markerEditorClass", value.asInstanceOf[js.Any])
      
      inline def setMarkerEditorClassUndefined: Self = StObject.set(x, "markerEditorClass", js.undefined)
      
      inline def setMiddleMarkerClass(value: js.Object): Self = StObject.set(x, "middleMarkerClass", value.asInstanceOf[js.Any])
      
      inline def setMiddleMarkerClassUndefined: Self = StObject.set(x, "middleMarkerClass", js.undefined)
      
      inline def setPolygonClass(value: js.Object): Self = StObject.set(x, "polygonClass", value.asInstanceOf[js.Any])
      
      inline def setPolygonClassUndefined: Self = StObject.set(x, "polygonClass", js.undefined)
      
      inline def setPolygonEditorClass(value: js.Object): Self = StObject.set(x, "polygonEditorClass", value.asInstanceOf[js.Any])
      
      inline def setPolygonEditorClassUndefined: Self = StObject.set(x, "polygonEditorClass", js.undefined)
      
      inline def setPolylineClass(value: js.Object): Self = StObject.set(x, "polylineClass", value.asInstanceOf[js.Any])
      
      inline def setPolylineClassUndefined: Self = StObject.set(x, "polylineClass", js.undefined)
      
      inline def setPolylineEditorClass(value: js.Object): Self = StObject.set(x, "polylineEditorClass", value.asInstanceOf[js.Any])
      
      inline def setPolylineEditorClassUndefined: Self = StObject.set(x, "polylineEditorClass", js.undefined)
      
      inline def setSkipMiddleMarkers(value: Boolean): Self = StObject.set(x, "skipMiddleMarkers", value.asInstanceOf[js.Any])
      
      inline def setSkipMiddleMarkersUndefined: Self = StObject.set(x, "skipMiddleMarkers", js.undefined)
      
      inline def setVertexMarkerClass(value: js.Object): Self = StObject.set(x, "vertexMarkerClass", value.asInstanceOf[js.Any])
      
      inline def setVertexMarkerClassUndefined: Self = StObject.set(x, "vertexMarkerClass", js.undefined)
    }
  }
  
  /**
    * EditableMixin is included to L.Polyline, L.Polygon and L.Marker. It adds the following methods to them.
    *
    * When editing is enabled, the editor is accessible on the instance with the editor property.
    */
  trait EditableMixin extends StObject {
    
    /**
      * Disable editing, also remove the editor property reference.
      */
    def disableEdit(): Unit
    
    /**
      * Return true if current instance has an editor attached, and this editor is enabled.
      */
    def editEnabled(): Boolean
    
    /**
      * Enable editing, by creating an editor if not existing, and then calling enable on it.
      */
    def enableEdit(): js.Any
    
    /**
      * Enable or disable editing, according to current status.
      */
    def toggleEdit(): Unit
  }
  object EditableMixin {
    
    inline def apply(
      disableEdit: () => Unit,
      editEnabled: () => Boolean,
      enableEdit: () => js.Any,
      toggleEdit: () => Unit
    ): EditableMixin = {
      val __obj = js.Dynamic.literal(disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enableEdit = js.Any.fromFunction0(enableEdit), toggleEdit = js.Any.fromFunction0(toggleEdit))
      __obj.asInstanceOf[EditableMixin]
    }
    
    extension [Self <: EditableMixin](x: Self) {
      
      inline def setDisableEdit(value: () => Unit): Self = StObject.set(x, "disableEdit", js.Any.fromFunction0(value))
      
      inline def setEditEnabled(value: () => Boolean): Self = StObject.set(x, "editEnabled", js.Any.fromFunction0(value))
      
      inline def setEnableEdit(value: () => js.Any): Self = StObject.set(x, "enableEdit", js.Any.fromFunction0(value))
      
      inline def setToggleEdit(value: () => Unit): Self = StObject.set(x, "toggleEdit", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Make geometries editable in Leaflet.
    *
    * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
    * control editing of geometries. So you can easily build your own UI with your own needs and choices.
    */
  @js.native
  trait EditableStatic
    extends StObject
       with Instantiable2[/* map */ Map, /* options */ EditOptions, Editable]
  
  trait Map extends StObject {
    
    /**
      * Options to pass to L.Editable when instanciating.
      */
    var editOptions: EditOptions
    
    /**
      * L.Editable plugin instance.
      */
    var editTools: Editable
    
    /**
      * Whether to create a L.Editable instance at map init or not.
      */
    var editable: Boolean
  }
  object Map {
    
    inline def apply(editOptions: EditOptions, editTools: Editable, editable: Boolean): Map = {
      val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setEditOptions(value: EditOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
      
      inline def setEditTools(value: Editable): Self = StObject.set(x, "editTools", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    }
    
    trait MapOptions extends StObject {
      
      /**
        * Options to pass to L.Editable when instanciating.
        */
      var editOptions: js.UndefOr[EditOptions] = js.undefined
      
      /**
        * Whether to create a L.Editable instance at map init or not.
        */
      var editable: js.UndefOr[Boolean] = js.undefined
    }
    object MapOptions {
      
      inline def apply(): MapOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MapOptions]
      }
      
      extension [Self <: MapOptions](x: Self) {
        
        inline def setEditOptions(value: EditOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
        
        inline def setEditOptionsUndefined: Self = StObject.set(x, "editOptions", js.undefined)
        
        inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
        inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      }
    }
  }
  
  trait Marker
    extends StObject
       with EditableMixin
       with BaseEditor
  object Marker {
    
    inline def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      disableEdit: () => Unit,
      editEnabled: () => Boolean,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enableEdit: () => js.Any,
      toggleEdit: () => Unit
    ): Marker = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), toggleEdit = js.Any.fromFunction0(toggleEdit))
      __obj.asInstanceOf[Marker]
    }
  }
  
  /**
    * Inherit from L.Editable.BaseEditor.
    */
  // tslint:disable-next-line:no-empty-interface
  type MarkerEditor = BaseEditor
  
  /**
    * Inherit from L.Editable.BaseEditor.
    * Inherited by L.Editable.PolylineEditor and L.Editable.PolygonEditor.
    */
  trait PathEditor
    extends StObject
       with BaseEditor {
    
    /**
      * Rebuild edit elements (vertex, middlemarker, etc.).
      */
    def reset(): Unit
  }
  object PathEditor {
    
    inline def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      reset: () => Unit
    ): PathEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PathEditor]
    }
    
    extension [Self <: PathEditor](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait Polygon
    extends StObject
       with EditableMixin
       with PolygonEditor
  object Polygon {
    
    inline def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      disableEdit: () => Unit,
      editEnabled: () => Boolean,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enableEdit: () => js.Any,
      newHole: LatLng_ => Unit,
      reset: () => Unit,
      toggleEdit: () => Unit
    ): Polygon = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
      __obj.asInstanceOf[Polygon]
    }
  }
  
  /**
    * Inherit from L.Editable.PathEditor.
    */
  trait PolygonEditor
    extends StObject
       with PathEditor {
    
    /**
      * Set up drawing tools for creating a new hole on the polygon. If the latlng param is given, a first
      * point is created.
      */
    def newHole(latlng: LatLng_): Unit
  }
  object PolygonEditor {
    
    inline def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      newHole: LatLng_ => Unit,
      reset: () => Unit
    ): PolygonEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PolygonEditor]
    }
    
    extension [Self <: PolygonEditor](x: Self) {
      
      inline def setNewHole(value: LatLng_ => Unit): Self = StObject.set(x, "newHole", js.Any.fromFunction1(value))
    }
  }
  
  // tslint:disable-next-line:no-empty-interface
  trait Polyline
    extends StObject
       with EditableMixin
       with PolylineEditor
  object Polyline {
    
    inline def apply(
      continueBackward: () => Unit,
      continueForward: () => Unit,
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      disableEdit: () => Unit,
      editEnabled: () => Boolean,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enableEdit: () => js.Any,
      reset: () => Unit,
      toggleEdit: () => Unit
    ): Polyline = {
      val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
      __obj.asInstanceOf[Polyline]
    }
  }
  
  /**
    * Inherit from L.Editable.PathEditor.
    */
  trait PolylineEditor
    extends StObject
       with PathEditor {
    
    /**
      * Set up drawing tools to continue the line backward.
      */
    def continueBackward(): Unit
    
    /**
      * Set up drawing tools to continue the line forward.
      */
    def continueForward(): Unit
  }
  object PolylineEditor {
    
    inline def apply(
      continueBackward: () => Unit,
      continueForward: () => Unit,
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      reset: () => Unit
    ): PolylineEditor = {
      val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PolylineEditor]
    }
    
    extension [Self <: PolylineEditor](x: Self) {
      
      inline def setContinueBackward(value: () => Unit): Self = StObject.set(x, "continueBackward", js.Any.fromFunction0(value))
      
      inline def setContinueForward(value: () => Unit): Self = StObject.set(x, "continueForward", js.Any.fromFunction0(value))
    }
  }
}
