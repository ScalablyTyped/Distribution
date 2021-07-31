package typings.leafletPolylinedecorator

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.PathOptions
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import typings.leafletPolylinedecorator.mod.Symbol.ArrowHead_
import typings.leafletPolylinedecorator.mod.Symbol.Dash_
import typings.leafletPolylinedecorator.mod.Symbol.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "PolylineDecorator")
  @js.native
  class PolylineDecorator_ protected ()
    extends FeatureGroup_[js.Any] {
    def this(paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any])
          ]) = this()
    def this(paths: Polygon_[js.Any]) = this()
    def this(paths: Polyline_[LineString | MultiLineString, js.Any]) = this()
    def this(
      paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any])
          ],
      options: PolylineDecoratorOptions
    ) = this()
    def this(paths: Polygon_[js.Any], options: PolylineDecoratorOptions) = this()
    def this(paths: Polyline_[LineString | MultiLineString, js.Any], options: PolylineDecoratorOptions) = this()
    
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any])
        ]
    ): Unit = js.native
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any])
        ],
      options: PolylineDecoratorOptions
    ): Unit = js.native
    def initialize(paths: Polygon_[js.Any]): Unit = js.native
    def initialize(paths: Polygon_[js.Any], options: PolylineDecoratorOptions): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, js.Any]): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, js.Any], options: PolylineDecoratorOptions): Unit = js.native
    
    def redraw(): Unit = js.native
    
    def setPaths(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any])
        ]
    ): Unit = js.native
    def setPaths(paths: Polygon_[js.Any]): Unit = js.native
    def setPaths(paths: Polyline_[LineString | MultiLineString, js.Any]): Unit = js.native
    
    def setPatterns(patterns: js.Array[Pattern]): Unit = js.native
  }
  
  object Symbol {
    
    @JSImport("leaflet", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "Symbol.ArrowHead")
    @js.native
    class ArrowHead_ () extends StObject {
      def this(options: ArrowHeadOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[js.Any] | (Polyline_[LineString | MultiLineString, js.Any]) = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: ArrowHeadOptions): Unit = js.native
    }
    
    @JSImport("leaflet", "Symbol.Dash")
    @js.native
    class Dash_ () extends StObject {
      def this(options: DashOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polyline_[LineString | MultiLineString, js.Any] = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: DashOptions): Unit = js.native
    }
    
    @JSImport("leaflet", "Symbol.Marker")
    @js.native
    class Marker_ () extends StObject {
      def this(options: MarkerOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Marker_ = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: MarkerOptions): Unit = js.native
    }
    
    @scala.inline
    def arrowHead(): ArrowHead_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrowHead")().asInstanceOf[ArrowHead_]
    @scala.inline
    def arrowHead(options: ArrowHeadOptions): ArrowHead_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrowHead")(options.asInstanceOf[js.Any]).asInstanceOf[ArrowHead_]
    
    @scala.inline
    def dash(): Dash_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dash")().asInstanceOf[Dash_]
    @scala.inline
    def dash(options: DashOptions): Dash_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dash")(options.asInstanceOf[js.Any]).asInstanceOf[Dash_]
    
    @scala.inline
    def marker(): Marker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")().asInstanceOf[Marker_]
    @scala.inline
    def marker(options: MarkerOptions): Marker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")(options.asInstanceOf[js.Any]).asInstanceOf[Marker_]
    
    trait ArrowHeadOptions extends StObject {
      
      var headAngle: js.UndefOr[Double] = js.undefined
      
      var pathOptions: js.UndefOr[PathOptions] = js.undefined
      
      var pixelSize: js.UndefOr[Double] = js.undefined
      
      var polygon: js.UndefOr[Boolean] = js.undefined
    }
    object ArrowHeadOptions {
      
      @scala.inline
      def apply(): ArrowHeadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ArrowHeadOptions]
      }
      
      @scala.inline
      implicit class ArrowHeadOptionsMutableBuilder[Self <: ArrowHeadOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeadAngle(value: Double): Self = StObject.set(x, "headAngle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadAngleUndefined: Self = StObject.set(x, "headAngle", js.undefined)
        
        @scala.inline
        def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        @scala.inline
        def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
        
        @scala.inline
        def setPolygon(value: Boolean): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      }
    }
    
    trait DashOptions extends StObject {
      
      var pathOptions: js.UndefOr[PathOptions] = js.undefined
      
      var pixelSize: js.UndefOr[Double] = js.undefined
    }
    object DashOptions {
      
      @scala.inline
      def apply(): DashOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DashOptions]
      }
      
      @scala.inline
      implicit class DashOptionsMutableBuilder[Self <: DashOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        @scala.inline
        def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      }
    }
    
    trait MarkerOptions extends StObject {
      
      var markerOptions: js.UndefOr[typings.leaflet.mod.MarkerOptions] = js.undefined
      
      var rotate: js.UndefOr[Boolean] = js.undefined
    }
    object MarkerOptions {
      
      @scala.inline
      def apply(): MarkerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MarkerOptions]
      }
      
      @scala.inline
      implicit class MarkerOptionsMutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMarkerOptions(value: typings.leaflet.mod.MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
        
        @scala.inline
        def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      }
    }
  }
  
  @scala.inline
  def isCoord(c: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoord")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isCoordArray(c: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoordArray")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def polylineDecorator(
    paths: (Polyline_[LineString | MultiLineString, js.Any]) | (js.Array[Polyline_[LineString | MultiLineString, js.Any]]),
    options: js.UndefOr[PolylineDecoratorOptions]
  ): PolylineDecorator_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polylineDecorator")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolylineDecorator_]
  
  trait Pattern extends StObject {
    
    var endOffset: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var repeat: Double | String
    
    var symbol: Dash_ | ArrowHead_ | Marker_
  }
  object Pattern {
    
    @scala.inline
    def apply(repeat: Double | String, symbol: Dash_ | ArrowHead_ | Marker_): Pattern = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndOffset(value: Double | String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: Dash_ | ArrowHead_ | Marker_): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolylineDecoratorOptions extends StObject {
    
    var patterns: js.Array[Pattern]
  }
  object PolylineDecoratorOptions {
    
    @scala.inline
    def apply(patterns: js.Array[Pattern]): PolylineDecoratorOptions = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineDecoratorOptions]
    }
    
    @scala.inline
    implicit class PolylineDecoratorOptionsMutableBuilder[Self <: PolylineDecoratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
}
