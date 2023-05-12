package typings.leafletVectorgrid

import typings.geojson.mod.GeoJSON
import typings.geojsonVt.mod.Feature
import typings.geojsonVt.mod.Options
import typings.geojsonVt.mod.TileCoord
import typings.leaflet.mod.Class
import typings.leaflet.mod.Coords
import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PathOptions
import typings.leaflet.mod.Point_
import typings.leaflet.mod.RendererOptions
import typings.leaflet.mod.TileLayer_
import typings.leaflet.mod.TileLayer_.WMS
import typings.leafletVectorgrid.mod.leafletAugmentingMod.Canvas_.Tile
import typings.leafletVectorgrid.mod.leafletAugmentingMod.VectorGrid_.Protobuf
import typings.leafletVectorgrid.mod.leafletAugmentingMod.VectorGrid_.ProtobufOptions
import typings.leafletVectorgrid.mod.leafletAugmentingMod.VectorGrid_.Slicer
import typings.leafletVectorgrid.mod.leafletAugmentingMod.VectorGrid_.SlicerOptions
import typings.std.HTMLCanvasElement
import typings.std.Record
import typings.std.SVGViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object leafletAugmentingMod {
    
    object Canvas_ {
      
      @JSImport("leaflet", "Canvas.Tile")
      @js.native
      open class Tile protected ()
        extends typings.leaflet.mod.Canvas_
           with GetVectorGridRendererHelper[Any] {
        def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TileParameters is not an array type */ args: TileParameters) = this()
        
        var _container: HTMLCanvasElement = js.native
        
        var _drawing: Boolean = js.native
        
        var _drawnLayers: Record[String, Layer] = js.native
        
        var _layers: Record[String, Layer] = js.native
        
        def _onClick(event: LeafletMouseEvent): Unit = js.native
        
        def _onMouseMove(event: LeafletMouseEvent): Unit = js.native
        
        var _size: Point_ = js.native
        
        var _tileCoord: Point_ = js.native
        
        def _updateIcon(layer: Layer): Unit = js.native
        
        def getContainer(): HTMLCanvasElement = js.native
        
        def getCoord(): Point_ = js.native
        
        def getOffset(): Point_ = js.native
      }
    }
    
    object SVG_ {
      
      @JSImport("leaflet", "SVG.Tile")
      @js.native
      open class Tile protected ()
        extends typings.leaflet.mod.SVG_
           with GetVectorGridRendererHelper[Any] {
        def this(props: TileProps) = this()
        
        def _addPath(layer: Layer): Unit = js.native
        
        var _container: SVGViewElement = js.native
        
        var _layers: Record[String, Layer] = js.native
        
        var _size: Point_ = js.native
        
        var _tileCoord: TileCoord = js.native
        
        def _updateIcon(layer: Layer): Unit = js.native
        
        def getContainer(): SVGViewElement = js.native
        
        def getCoord(): Point_ = js.native
      }
    }
    
    @JSImport("leaflet", "VectorGrid")
    @js.native
    open class VectorGrid_[T /* <: HTMLCanvasElement | SVGViewElement */] protected () extends GridLayer_ {
      def this(props: VectorGridOptions[GetVectorGridRendererHelper[T]]) = this()
      
      def _createLayer(feat: Feature, pxPerExtent: Double, layerStyle: PathOptions): Layer = js.native
      
      def _updateStyles(feat: Feature, renderer: GetVectorGridRendererHelper[T], styleOptions: Record[String, PathOptions]): Unit = js.native
      
      /**
        * Returns an array of strings, with all the known names of data layers in
        * the vector tiles displayed. Useful for introspection.
        */
      def getDataLayerNames(): js.Array[String] = js.native
      
      @JSName("options")
      var options_VectorGrid_ : VectorGridOptions[Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile] = js.native
      
      /**
        * Reverts the effects of a previous `setFeatureStyle` cal
        */
      def resetFeatureStyle(id: Double): this.type = js.native
      
      /**
        * Given the unique ID for a vector features (as per the `getFeatureId` option),
        * re-symbolizes that feature across all tiles it appears in.
        */
      def setFeatureStyle(id: Double, layerStyle: PathOptions): this.type = js.native
      
      /**
        * Sets filter function to filter displayed features.
        */
      def setFilter(): this.type = js.native
      def setFilter(filterFn: js.Function2[/* properties */ Feature, /* zoom */ Double, Boolean]): this.type = js.native
    }
    object VectorGrid_ {
      
      @JSImport("leaflet", "VectorGrid.Protobuf")
      @js.native
      open class Protobuf protected () extends VectorGrid_[HTMLCanvasElement | SVGViewElement] {
        def this(url: String) = this()
        def this(url: String, options: ProtobufOptions) = this()
        
        var _getSubdomain: Any = js.native
        
        def _getVectorTilePromise(coords: Any, tileBounds: Any): js.Promise[TileLayer_] = js.native
        
        def _isCurrentTile(coords: Coords, tileBounds: WMS): Boolean = js.native
        
        @JSName("options")
        var options_Protobuf: ProtobufOptions = js.native
        
        /**
          * Updates the layer's URL template and redraws it (unless `noRedraw` is set to `true`).
          */
        def setUrl(url: String): this.type = js.native
        def setUrl(url: String, noRedraw: Boolean): this.type = js.native
      }
      
      @JSImport("leaflet", "VectorGrid.Slicer")
      @js.native
      open class Slicer protected () extends VectorGrid_[HTMLCanvasElement | SVGViewElement] {
        def this(data: GeoJSON) = this()
        def this(data: GeoJSON, options: SlicerOptions) = this()
      }
      
      // Have a fetchOptions interface just in case user wants to do their own typesafety here
      // tslint:disable-next-line no-empty-interface
      trait ProtobufFetchOptions extends StObject
      
      trait ProtobufOptions
        extends StObject
           with VectorGridOptions[Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile] {
        
        /** options passed to `fetch`, e.g. {credentials: 'same-origin'} to send cookie for the current domain */
        var fetchOptions: js.UndefOr[(Record[String, Any]) & ProtobufFetchOptions] = js.undefined
        
        /**
          * As with `TileLayer`, the URL template might contain a reference to
          * any option (see the example above and note the `{key}` or `token` in the URL
          * template, and the corresponding option).
          */
        var section: js.UndefOr[Any] = js.undefined
        
        /**
          * Akin to the `subdomains` option for `TileLayer`.
          */
        var subdomains: js.UndefOr[String] = js.undefined
      }
      object ProtobufOptions {
        
        inline def apply(): ProtobufOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProtobufOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ProtobufOptions] (val x: Self) extends AnyVal {
          
          inline def setFetchOptions(value: (Record[String, Any]) & ProtobufFetchOptions): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
          
          inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
          
          inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
          
          inline def setSubdomains(value: String): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
          
          inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
        }
      }
      
      trait SlicerOptions
        extends StObject
           with VectorGridOptions[Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile] {
        
        var vectorTileLayerName: js.UndefOr[String] = js.undefined
      }
      object SlicerOptions {
        
        inline def apply(): SlicerOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SlicerOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SlicerOptions] (val x: Self) extends AnyVal {
          
          inline def setVectorTileLayerName(value: String): Self = StObject.set(x, "vectorTileLayerName", value.asInstanceOf[js.Any])
          
          inline def setVectorTileLayerNameUndefined: Self = StObject.set(x, "vectorTileLayerName", js.undefined)
        }
      }
    }
    
    object canvas {
      
      @JSImport("leaflet", "canvas.tile")
      @js.native
      val tile: TileFactoryFunction[Tile] = js.native
    }
    
    object svg {
      
      @JSImport("leaflet", "svg.tile")
      @js.native
      val tile: TileFactoryFunction[typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile] = js.native
    }
    
    object vectorGrid {
      
      @JSImport("leaflet", "vectorGrid")
      @js.native
      val ^ : js.Any = js.native
      
      inline def protobuf(url: String): Protobuf = ^.asInstanceOf[js.Dynamic].applyDynamic("protobuf")(url.asInstanceOf[js.Any]).asInstanceOf[Protobuf]
      inline def protobuf(url: String, options: ProtobufOptions): Protobuf = (^.asInstanceOf[js.Dynamic].applyDynamic("protobuf")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Protobuf]
      
      inline def slicer(data: GeoJSON): Slicer = ^.asInstanceOf[js.Dynamic].applyDynamic("slicer")(data.asInstanceOf[js.Any]).asInstanceOf[Slicer]
      inline def slicer(data: GeoJSON, options: SlicerOptions): Slicer = (^.asInstanceOf[js.Dynamic].applyDynamic("slicer")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Slicer]
    }
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends std.HTMLCanvasElement | std.SVGViewElement ? leaflet.vectorgrid.leaflet.vectorgrid.leaflet.Canvas.Tile | leaflet.vectorgrid.leaflet.vectorgrid.leaflet.SVG.Tile : T extends std.HTMLCanvasElement ? leaflet.vectorgrid.leaflet.vectorgrid.leaflet.Canvas.Tile : leaflet.vectorgrid.leaflet.vectorgrid.leaflet.SVG.Tile
      }}}
      */
    /* Rewritten from type alias, can be one of: 
      - typings.leafletVectorgrid.mod.leafletAugmentingMod.Canvas_.Tile
      - typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile
    */
    trait GetVectorGridRendererHelper[T /* <: HTMLCanvasElement | SVGViewElement */] extends StObject
    
    type TileFactoryFunction[T /* <: Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile */] = js.Function1[/* args */ TileParameters, T]
    
    type TileParameters = js.Tuple3[/* tileCoord */ TileCoord, /* tileSize */ Point_, /* options */ Point_]
    
    trait TileProps extends StObject {
      
      var options: js.UndefOr[RendererOptions] = js.undefined
      
      var tileCoord: TileCoord
      
      var tileSize: Point_
    }
    object TileProps {
      
      inline def apply(tileCoord: TileCoord, tileSize: Point_): TileProps = {
        val __obj = js.Dynamic.literal(tileCoord = tileCoord.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[TileProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
        
        inline def setOptions(value: RendererOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setTileCoord(value: TileCoord): Self = StObject.set(x, "tileCoord", value.asInstanceOf[js.Any])
        
        inline def setTileSize(value: Point_): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.leaflet.mod.GridLayerOptions because var conflicts: maxZoom. Inlined minNativeZoom, tileSize, updateWhenIdle, maxNativeZoom, bounds, minZoom, noWrap, updateWhenZooming, className, zIndex, opacity, keepBuffer, updateInterval */ trait VectorGridOptions[T /* <: Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile */]
      extends StObject
         with Options
         with LayerOptions {
      
      var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * A Function that will be used to decide whether to include a feature or not
        * depending on feature properties and zoom, e.g.
        * `function(properties, zoom) { return true; }`.
        * The default is to include all features. Similar to GeoJSON filter option.
        */
      var filter: js.UndefOr[js.Function2[/* properties */ Feature, /* zoom */ Double, Boolean]] = js.undefined
      
      /**
        * A function that, given a vector feature, returns an unique identifier for it, e.g.
        * `function(feat) { return feat.properties.uniqueIdField; }`.
        * Must be defined for `setFeatureStyle` to work.
        */
      var getFeatureId: js.UndefOr[js.Function1[/* feature */ Feature, String]] = js.undefined
      
      /** Whether this VectorGrid fires Interactive Layer events. */
      var interactive: js.UndefOr[Boolean] = js.undefined
      
      var keepBuffer: js.UndefOr[Double] = js.undefined
      
      /**
        * Maximum zoom number the tile source has available. If it is specified, the tiles on all zoom levels higher than
        * `maxNativeZoom` will be loaded from `maxNativeZoom` level and auto-scaled.
        */
      var maxNativeZoom: js.UndefOr[Double] = js.undefined
      
      /**
        * Minimum zoom number the tile source has available. If it is specified, the tiles on all zoom levels lower than
        * `minNativeZoom` will be loaded from `minNativeZoom` level and auto-scaled.
        */
      var minNativeZoom: js.UndefOr[Double] = js.undefined
      
      var minZoom: js.UndefOr[Double] = js.undefined
      
      var noWrap: js.UndefOr[Boolean] = js.undefined
      
      var opacity: js.UndefOr[Double] = js.undefined
      
      /** A factory method which will be used to instantiate the per-tile renderers. */
      var rendererFactory: js.UndefOr[TileFactoryFunction[T]] = js.undefined
      
      var tileSize: js.UndefOr[Double | Point_] = js.undefined
      
      var updateInterval: js.UndefOr[Double] = js.undefined
      
      var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
      
      var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
      
      /** A data structure holding initial symbolizer definitions for the vector features. */
      var vectorTileLayerStyles: js.UndefOr[Record[String, PathOptions]] = js.undefined
      
      var zIndex: js.UndefOr[Double] = js.undefined
    }
    object VectorGridOptions {
      
      inline def apply[T /* <: Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile */](): VectorGridOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VectorGridOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VectorGridOptions[?], T /* <: Tile | typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile */] (val x: Self & VectorGridOptions[T]) extends AnyVal {
        
        inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setFilter(value: (/* properties */ Feature, /* zoom */ Double) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setGetFeatureId(value: /* feature */ Feature => String): Self = StObject.set(x, "getFeatureId", js.Any.fromFunction1(value))
        
        inline def setGetFeatureIdUndefined: Self = StObject.set(x, "getFeatureId", js.undefined)
        
        inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
        
        inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
        
        inline def setKeepBuffer(value: Double): Self = StObject.set(x, "keepBuffer", value.asInstanceOf[js.Any])
        
        inline def setKeepBufferUndefined: Self = StObject.set(x, "keepBuffer", js.undefined)
        
        inline def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
        
        inline def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
        
        inline def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
        
        inline def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
        
        inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
        
        inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
        
        inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
        
        inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
        
        inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        inline def setRendererFactory(value: /* args */ TileParameters => T): Self = StObject.set(x, "rendererFactory", js.Any.fromFunction1(value))
        
        inline def setRendererFactoryUndefined: Self = StObject.set(x, "rendererFactory", js.undefined)
        
        inline def setTileSize(value: Double | Point_): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
        
        inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
        
        inline def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
        
        inline def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
        
        inline def setUpdateWhenZooming(value: Boolean): Self = StObject.set(x, "updateWhenZooming", value.asInstanceOf[js.Any])
        
        inline def setUpdateWhenZoomingUndefined: Self = StObject.set(x, "updateWhenZooming", js.undefined)
        
        inline def setVectorTileLayerStyles(value: Record[String, PathOptions]): Self = StObject.set(x, "vectorTileLayerStyles", value.asInstanceOf[js.Any])
        
        inline def setVectorTileLayerStylesUndefined: Self = StObject.set(x, "vectorTileLayerStyles", js.undefined)
        
        inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
        
        inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      }
    }
  }
  
  /**
    * This class has docs on the API page but no export?
    */
  @js.native
  trait Symbolizer extends Class {
    
    def initialize(feature: GeoJSON): this.type = js.native
    def initialize(feature: GeoJSON, pxPerExtent: Double): this.type = js.native
    
    def render(renderer: Tile, style: PathOptions): Unit = js.native
    def render(renderer: typings.leafletVectorgrid.mod.leafletAugmentingMod.SVG_.Tile, style: PathOptions): Unit = js.native
  }
}
