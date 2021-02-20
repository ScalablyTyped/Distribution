package typings.leafletEditable

import org.scalablytyped.runtime.Instantiable2
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def startMarker(latLng: js.UndefOr[scala.Nothing], options: MarkerOptions): Marker = js.native
    def startMarker(latLng: LatLng_): Marker = js.native
    def startMarker(latLng: LatLng_, options: MarkerOptions): Marker = js.native
    
    /**
      * Start drawing a polygon. If latlng is given, a first point will be added. In any case, continuing on user
      * click. If options is given, it will be passed to the polygon class constructor.
      */
    def startPolygon(): Polygon = js.native
    def startPolygon(latLng: js.UndefOr[scala.Nothing], options: PolylineOptions): Polygon = js.native
    def startPolygon(latLng: LatLng_): Polygon = js.native
    def startPolygon(latLng: LatLng_, options: PolylineOptions): Polygon = js.native
    
    /**
      * Start drawing a polyline. If latlng is given, a first point will be added. In any case, continuing on user
      * click. If options is given, it will be passed to the polyline class constructor.
      */
    def startPolyline(): Polyline = js.native
    def startPolyline(latLng: js.UndefOr[scala.Nothing], options: PolylineOptions): Polyline = js.native
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
  @scala.inline
  def Editable_=(x: EditableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editable")(x.asInstanceOf[js.Any])
  
  /**
    * When editing a feature (marker, polyline…), an editor is attached to it. This editor basically knows
    * how to handle the edition.
    */
  @js.native
  trait BaseEditor extends StObject {
    
    /**
      * Remove editing tools.
      */
    def disable(): MarkerEditor | PolylineEditor | PolygonEditor = js.native
    
    /**
      * Set up the drawing tools for the feature to be editable.
      */
    def enable(): MarkerEditor | PolylineEditor | PolygonEditor = js.native
  }
  object BaseEditor {
    
    @scala.inline
    def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor
    ): BaseEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[BaseEditor]
    }
    
    @scala.inline
    implicit class BaseEditorMutableBuilder[Self <: BaseEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  @js.native
  trait EditOptions extends StObject {
    
    /**
      * CSS class to be added to the map container while drawing.
      */
    var drawingCSSClass: js.UndefOr[String] = js.native
    
    /**
      * Layer used to store edit tools (vertex, line guide…).
      */
    var editLayer: js.UndefOr[
        LayerGroup_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
        ]
      ] = js.native
    
    /**
      * Default layer used to store drawn features (marker, polyline…).
      */
    var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.native
    
    /**
      * Options to be passed to the line guides.
      */
    var lineGuideOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used when creating a new Marker.
      */
    var markerClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used as Marker editor.
      */
    var markerEditorClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used as middle vertex, pulled by the user to create a new point in the middle of a path.
      */
    var middleMarkerClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used when creating a new Polygon.
      */
    var polygonClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used as Polygon editor.
      */
    var polygonEditorClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used when creating a new Polyline.
      */
    var polylineClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Class to be used as Polyline editor.
      */
    var polylineEditorClass: js.UndefOr[js.Object] = js.native
    
    /**
      * Set this to true if you don't want middle markers.
      */
    var skipMiddleMarkers: js.UndefOr[Boolean] = js.native
    
    /**
      * Class to be used as vertex, for path editing.
      */
    var vertexMarkerClass: js.UndefOr[js.Object] = js.native
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
      def setDrawingCSSClass(value: String): Self = StObject.set(x, "drawingCSSClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingCSSClassUndefined: Self = StObject.set(x, "drawingCSSClass", js.undefined)
      
      @scala.inline
      def setEditLayer(
        value: LayerGroup_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
            ]
      ): Self = StObject.set(x, "editLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditLayerUndefined: Self = StObject.set(x, "editLayer", js.undefined)
      
      @scala.inline
      def setFeaturesLayer(value: LayerGroup_[Polyline | Polygon | Marker]): Self = StObject.set(x, "featuresLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesLayerUndefined: Self = StObject.set(x, "featuresLayer", js.undefined)
      
      @scala.inline
      def setLineGuideOptions(value: js.Object): Self = StObject.set(x, "lineGuideOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineGuideOptionsUndefined: Self = StObject.set(x, "lineGuideOptions", js.undefined)
      
      @scala.inline
      def setMarkerClass(value: js.Object): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
      
      @scala.inline
      def setMarkerEditorClass(value: js.Object): Self = StObject.set(x, "markerEditorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEditorClassUndefined: Self = StObject.set(x, "markerEditorClass", js.undefined)
      
      @scala.inline
      def setMiddleMarkerClass(value: js.Object): Self = StObject.set(x, "middleMarkerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleMarkerClassUndefined: Self = StObject.set(x, "middleMarkerClass", js.undefined)
      
      @scala.inline
      def setPolygonClass(value: js.Object): Self = StObject.set(x, "polygonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonClassUndefined: Self = StObject.set(x, "polygonClass", js.undefined)
      
      @scala.inline
      def setPolygonEditorClass(value: js.Object): Self = StObject.set(x, "polygonEditorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonEditorClassUndefined: Self = StObject.set(x, "polygonEditorClass", js.undefined)
      
      @scala.inline
      def setPolylineClass(value: js.Object): Self = StObject.set(x, "polylineClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolylineClassUndefined: Self = StObject.set(x, "polylineClass", js.undefined)
      
      @scala.inline
      def setPolylineEditorClass(value: js.Object): Self = StObject.set(x, "polylineEditorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolylineEditorClassUndefined: Self = StObject.set(x, "polylineEditorClass", js.undefined)
      
      @scala.inline
      def setSkipMiddleMarkers(value: Boolean): Self = StObject.set(x, "skipMiddleMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipMiddleMarkersUndefined: Self = StObject.set(x, "skipMiddleMarkers", js.undefined)
      
      @scala.inline
      def setVertexMarkerClass(value: js.Object): Self = StObject.set(x, "vertexMarkerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexMarkerClassUndefined: Self = StObject.set(x, "vertexMarkerClass", js.undefined)
    }
  }
  
  /**
    * EditableMixin is included to L.Polyline, L.Polygon and L.Marker. It adds the following methods to them.
    *
    * When editing is enabled, the editor is accessible on the instance with the editor property.
    */
  @js.native
  trait EditableMixin extends StObject {
    
    /**
      * Disable editing, also remove the editor property reference.
      */
    def disableEdit(): Unit = js.native
    
    /**
      * Return true if current instance has an editor attached, and this editor is enabled.
      */
    def editEnabled(): Boolean = js.native
    
    /**
      * Enable editing, by creating an editor if not existing, and then calling enable on it.
      */
    def enableEdit(): js.Any = js.native
    
    /**
      * Enable or disable editing, according to current status.
      */
    def toggleEdit(): Unit = js.native
  }
  object EditableMixin {
    
    @scala.inline
    def apply(
      disableEdit: () => Unit,
      editEnabled: () => Boolean,
      enableEdit: () => js.Any,
      toggleEdit: () => Unit
    ): EditableMixin = {
      val __obj = js.Dynamic.literal(disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enableEdit = js.Any.fromFunction0(enableEdit), toggleEdit = js.Any.fromFunction0(toggleEdit))
      __obj.asInstanceOf[EditableMixin]
    }
    
    @scala.inline
    implicit class EditableMixinMutableBuilder[Self <: EditableMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableEdit(value: () => Unit): Self = StObject.set(x, "disableEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEditEnabled(value: () => Boolean): Self = StObject.set(x, "editEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableEdit(value: () => js.Any): Self = StObject.set(x, "enableEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleEdit(value: () => Unit): Self = StObject.set(x, "toggleEdit", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Make geometries editable in Leaflet.
    *
    * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
    * control editing of geometries. So you can easily build your own UI with your own needs and choices.
    */
  @js.native
  trait EditableStatic extends Instantiable2[/* map */ Map, /* options */ EditOptions, Editable]
  
  @js.native
  trait Map extends StObject {
    
    /**
      * Options to pass to L.Editable when instanciating.
      */
    var editOptions: EditOptions = js.native
    
    /**
      * L.Editable plugin instance.
      */
    var editTools: Editable = js.native
    
    /**
      * Whether to create a L.Editable instance at map init or not.
      */
    var editable: Boolean = js.native
  }
  object Map {
    
    @scala.inline
    def apply(editOptions: EditOptions, editTools: Editable, editable: Boolean): Map = {
      val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditOptions(value: EditOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTools(value: Editable): Self = StObject.set(x, "editTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait MapOptions extends StObject {
      
      /**
        * Options to pass to L.Editable when instanciating.
        */
      var editOptions: js.UndefOr[EditOptions] = js.native
      
      /**
        * Whether to create a L.Editable instance at map init or not.
        */
      var editable: js.UndefOr[Boolean] = js.native
    }
    object MapOptions {
      
      @scala.inline
      def apply(): MapOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MapOptions]
      }
      
      @scala.inline
      implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditOptions(value: EditOptions): Self = StObject.set(x, "editOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditOptionsUndefined: Self = StObject.set(x, "editOptions", js.undefined)
        
        @scala.inline
        def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      }
    }
  }
  
  @js.native
  trait Marker
    extends EditableMixin
       with BaseEditor
  object Marker {
    
    @scala.inline
    def apply(
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
  @js.native
  trait PathEditor extends BaseEditor {
    
    /**
      * Rebuild edit elements (vertex, middlemarker, etc.).
      */
    def reset(): Unit = js.native
  }
  object PathEditor {
    
    @scala.inline
    def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      reset: () => Unit
    ): PathEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PathEditor]
    }
    
    @scala.inline
    implicit class PathEditorMutableBuilder[Self <: PathEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Polygon
    extends PolygonEditor
       with EditableMixin
  object Polygon {
    
    @scala.inline
    def apply(
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
  @js.native
  trait PolygonEditor extends PathEditor {
    
    /**
      * Set up drawing tools for creating a new hole on the polygon. If the latlng param is given, a first
      * point is created.
      */
    def newHole(latlng: LatLng_): Unit = js.native
  }
  object PolygonEditor {
    
    @scala.inline
    def apply(
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      newHole: LatLng_ => Unit,
      reset: () => Unit
    ): PolygonEditor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PolygonEditor]
    }
    
    @scala.inline
    implicit class PolygonEditorMutableBuilder[Self <: PolygonEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewHole(value: LatLng_ => Unit): Self = StObject.set(x, "newHole", js.Any.fromFunction1(value))
    }
  }
  
  // tslint:disable-next-line:no-empty-interface
  @js.native
  trait Polyline
    extends PolylineEditor
       with EditableMixin
  object Polyline {
    
    @scala.inline
    def apply(
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
  @js.native
  trait PolylineEditor extends PathEditor {
    
    /**
      * Set up drawing tools to continue the line backward.
      */
    def continueBackward(): Unit = js.native
    
    /**
      * Set up drawing tools to continue the line forward.
      */
    def continueForward(): Unit = js.native
  }
  object PolylineEditor {
    
    @scala.inline
    def apply(
      continueBackward: () => Unit,
      continueForward: () => Unit,
      disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
      reset: () => Unit
    ): PolylineEditor = {
      val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[PolylineEditor]
    }
    
    @scala.inline
    implicit class PolylineEditorMutableBuilder[Self <: PolylineEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinueBackward(value: () => Unit): Self = StObject.set(x, "continueBackward", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContinueForward(value: () => Unit): Self = StObject.set(x, "continueForward", js.Any.fromFunction0(value))
    }
  }
}
