package typings.leafletFreedraw

import org.scalablytyped.runtime.Instantiable1
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.Polygon_
import typings.leafletFreedraw.anon.TypeofFreeDraw
import typings.leafletFreedraw.leafletFreedrawStrings.markers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leaflet-freedraw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * FreeDraw class
    */
  @JSImport("leaflet-freedraw", JSImport.Default)
  @js.native
  /**
    * Instantiate a new FreeDraw instance, don't forget to add it to leaflet with addLayer
    * @param options Instance options
    */
  open class default () extends FreeDraw_ {
    def this(options: FreeDrawOptions) = this()
  }
  object default {
    
    /**
      * Create edit delete and append polygons
      */
    @JSImport("leaflet-freedraw", "default.ALL")
    @js.native
    val ALL: localAll = js.native
    
    /**
      * Append points to an existing polygon
      */
    @JSImport("leaflet-freedraw", "default.APPEND")
    @js.native
    val APPEND: localAppend = js.native
    
    /**
      * Create polygons
      */
    @JSImport("leaflet-freedraw", "default.CREATE")
    @js.native
    val CREATE: localCreate = js.native
    
    /**
      * Delete polygons
      */
    @JSImport("leaflet-freedraw", "default.DELETE")
    @js.native
    val DELETE: localDelete = js.native
    
    /**
      * Edit existing polygons
      */
    @JSImport("leaflet-freedraw", "default.EDIT")
    @js.native
    val EDIT: localEdit = js.native
    
    /**
      * Edit polygons and can append new points to an existing polygon
      */
    @JSImport("leaflet-freedraw", "default.EDIT_APPEND")
    @js.native
    val EDIT_APPEND: localEditAppend = js.native
    
    /**
      * Deactivate FreeDraw
      */
    @JSImport("leaflet-freedraw", "default.NONE")
    @js.native
    val NONE: localNone = js.native
  }
  
  @JSImport("leaflet-freedraw", "ALL")
  @js.native
  val ALL: Double = js.native
  
  @JSImport("leaflet-freedraw", "APPEND")
  @js.native
  val APPEND: Double = js.native
  
  @JSImport("leaflet-freedraw", "CREATE")
  @js.native
  val CREATE: Double = js.native
  
  @JSImport("leaflet-freedraw", "DELETE")
  @js.native
  val DELETE: Double = js.native
  
  @JSImport("leaflet-freedraw", "EDIT")
  @js.native
  val EDIT: Double = js.native
  
  @JSImport("leaflet-freedraw", "EDIT_APPEND")
  @js.native
  val EDIT_APPEND: Double = js.native
  
  @JSImport("leaflet-freedraw", "NONE")
  @js.native
  val NONE: Double = js.native
  
  inline def freeDraw(): FreeDraw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("freeDraw")().asInstanceOf[FreeDraw_]
  inline def freeDraw(options: FreeDrawOptions): FreeDraw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("freeDraw")(options.asInstanceOf[js.Any]).asInstanceOf[FreeDraw_]
  
  trait FreeDrawOptions extends StObject {
    
    /**
      * Whether to apply the concaving algorithm to the polygons.
      * @default true
      */
    var concavePolygon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Factor to determine when to delete or when to append an edge.
      * @default 10
      */
    var elbowDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to exit CREATE mode after each polygon creation.
      * @default false
      */
    var leaveModeAfterCreate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of polygons to be added to the map layer.
      * @default Infinity
      */
    var maximumPolygons: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to attempt merging of polygons that intersect.
      * @default true
      */
    var mergePolygons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Modifies the default mode.
      * @default ALL
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to defer markers event until after exiting EDIT mode.
      * @default false
      */
    var notifyAfterEditExit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By how much to simplify the polygon.
      * @default 1.1
      */
    var simplifyFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * By how much to smooth the polygons.
      * @default 0.3
      */
    var smoothFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the stroke when drawing.
      * @default 2
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object FreeDrawOptions {
    
    inline def apply(): FreeDrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreeDrawOptions]
    }
    
    extension [Self <: FreeDrawOptions](x: Self) {
      
      inline def setConcavePolygon(value: Boolean): Self = StObject.set(x, "concavePolygon", value.asInstanceOf[js.Any])
      
      inline def setConcavePolygonUndefined: Self = StObject.set(x, "concavePolygon", js.undefined)
      
      inline def setElbowDistance(value: Double): Self = StObject.set(x, "elbowDistance", value.asInstanceOf[js.Any])
      
      inline def setElbowDistanceUndefined: Self = StObject.set(x, "elbowDistance", js.undefined)
      
      inline def setLeaveModeAfterCreate(value: Boolean): Self = StObject.set(x, "leaveModeAfterCreate", value.asInstanceOf[js.Any])
      
      inline def setLeaveModeAfterCreateUndefined: Self = StObject.set(x, "leaveModeAfterCreate", js.undefined)
      
      inline def setMaximumPolygons(value: Double): Self = StObject.set(x, "maximumPolygons", value.asInstanceOf[js.Any])
      
      inline def setMaximumPolygonsUndefined: Self = StObject.set(x, "maximumPolygons", js.undefined)
      
      inline def setMergePolygons(value: Boolean): Self = StObject.set(x, "mergePolygons", value.asInstanceOf[js.Any])
      
      inline def setMergePolygonsUndefined: Self = StObject.set(x, "mergePolygons", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNotifyAfterEditExit(value: Boolean): Self = StObject.set(x, "notifyAfterEditExit", value.asInstanceOf[js.Any])
      
      inline def setNotifyAfterEditExitUndefined: Self = StObject.set(x, "notifyAfterEditExit", js.undefined)
      
      inline def setSimplifyFactor(value: Double): Self = StObject.set(x, "simplifyFactor", value.asInstanceOf[js.Any])
      
      inline def setSimplifyFactorUndefined: Self = StObject.set(x, "simplifyFactor", js.undefined)
      
      inline def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
      
      inline def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  /**
    * FreeDraw class
    */
  @js.native
  trait FreeDraw_ extends FeatureGroup_[Any] {
    
    /**
      * Array of all polygons stored in the instance
      */
    def all(): js.Array[Polygon_[Any]] = js.native
    
    /**
      * Cancel the current action creation in progress
      */
    def cancel(): Unit = js.native
    
    /**
      * Clear all polygons from FreeDraw
      */
    def clear(): Unit = js.native
    
    /**
      *
      * @param latlngs Pre-made polygon to add to the map
      * @param [options={concavePolgygons: false}] FreeDraw options, by default concavePolygons : false
      * @returns Polygon added to the FreeDraw instance
      */
    def create(latlngs: js.Array[LatLng_]): Polygon_[Any] = js.native
    def create(latlngs: js.Array[LatLng_], options: FreeDrawOptions): Polygon_[Any] = js.native
    
    /**
      * Set or retrieve the mode used by FreeDraw
      * @param mode new Mode to use, if not passed, will return the current mode
      */
    def mode(): Double = js.native
    def mode(mode: Double): Double = js.native
    
    /**
      * Remove polygon from the FreeDraw instance
      * @param polygon Polygon to remove from the map
      */
    def remove(polygon: Polygon_[Any]): Unit = js.native
    
    /**
      * Returns the current amount of polygons stored in FreeDraw
      */
    def size(): Double = js.native
  }
  
  trait MarkerEvent
    extends StObject
       with LeafletEvent {
    
    /**
      * Polygons currently stored in the FreeDraw Instance being listened to
      */
    var latLngs: js.Array[js.Array[LatLng_]]
    
    @JSName("type")
    var type_MarkerEvent: markers
  }
  object MarkerEvent {
    
    inline def apply(
      latLngs: js.Array[js.Array[LatLng_]],
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any
    ): MarkerEvent = {
      val __obj = js.Dynamic.literal(latLngs = latLngs.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("markers")
      __obj.asInstanceOf[MarkerEvent]
    }
    
    extension [Self <: MarkerEvent](x: Self) {
      
      inline def setLatLngs(value: js.Array[js.Array[LatLng_]]): Self = StObject.set(x, "latLngs", value.asInstanceOf[js.Any])
      
      inline def setLatLngsVarargs(value: js.Array[LatLng_]*): Self = StObject.set(x, "latLngs", js.Array(value*))
      
      inline def setType(value: markers): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerEventHandler = js.Function1[/* event */ MarkerEvent, Unit]
  
  object global {
    
    trait Window extends StObject {
      
      /**
        * FreeDraw class
        */
      var FreeDraw: TypeofFreeDraw & (Instantiable1[/* options */ js.UndefOr[FreeDrawOptions], FreeDraw_])
    }
    object Window {
      
      inline def apply(FreeDraw: TypeofFreeDraw & (Instantiable1[/* options */ js.UndefOr[FreeDrawOptions], FreeDraw_])): Window = {
        val __obj = js.Dynamic.literal(FreeDraw = FreeDraw.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setFreeDraw(value: TypeofFreeDraw & (Instantiable1[/* options */ js.UndefOr[FreeDrawOptions], FreeDraw_])): Self = StObject.set(x, "FreeDraw", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object leafletAugmentingMod {
    
    @js.native
    trait Evented extends StObject {
      
      @JSName("off")
      def off_markers(`type`: markers): this.type = js.native
      @JSName("off")
      def off_markers(`type`: markers, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_markers(`type`: markers, fn: MarkerEventHandler): this.type = js.native
      @JSName("off")
      def off_markers(`type`: markers, fn: MarkerEventHandler, context: Any): this.type = js.native
      
      @JSName("on")
      def on_markers(`type`: markers, fn: MarkerEventHandler): this.type = js.native
      @JSName("on")
      def on_markers(`type`: markers, fn: MarkerEventHandler, context: Any): this.type = js.native
    }
  }
  
  type localAll = Double
  
  type localAppend = Double
  
  type localCreate = Double
  
  type localDelete = Double
  
  type localEdit = Double
  
  type localEditAppend = Double
  
  type localNone = Double
}
