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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "PolylineDecorator")
  @js.native
  class PolylineDecorator_ protected ()
    extends FeatureGroup_[js.Any] {
    def this(paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
          ]) = this()
    def this(paths: Polygon_[_]) = this()
    def this(paths: Polyline_[LineString | MultiLineString, _]) = this()
    def this(
      paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
          ],
      options: PolylineDecoratorOptions
    ) = this()
    def this(paths: Polygon_[_], options: PolylineDecoratorOptions) = this()
    def this(paths: Polyline_[LineString | MultiLineString, _], options: PolylineDecoratorOptions) = this()
    
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
        ]
    ): Unit = js.native
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
        ],
      options: PolylineDecoratorOptions
    ): Unit = js.native
    def initialize(paths: Polygon_[_]): Unit = js.native
    def initialize(paths: Polygon_[_], options: PolylineDecoratorOptions): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, _]): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, _], options: PolylineDecoratorOptions): Unit = js.native
    
    def redraw(): Unit = js.native
    
    def setPaths(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[_] | (Polyline_[LineString | MultiLineString, _])
        ]
    ): Unit = js.native
    def setPaths(paths: Polygon_[_]): Unit = js.native
    def setPaths(paths: Polyline_[LineString | MultiLineString, _]): Unit = js.native
    
    def setPatterns(patterns: js.Array[Pattern]): Unit = js.native
  }
  
  object Symbol {
    
    @JSImport("leaflet", "Symbol.ArrowHead")
    @js.native
    class ArrowHead_ () extends StObject {
      def this(options: ArrowHeadOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: ArrowHeadOptions): Unit = js.native
    }
    
    @JSImport("leaflet", "Symbol.Dash")
    @js.native
    class Dash_ () extends StObject {
      def this(options: DashOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polyline_[LineString | MultiLineString, _] = js.native
      
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
    
    @JSImport("leaflet", "Symbol.arrowHead")
    @js.native
    def arrowHead(): ArrowHead_ = js.native
    @JSImport("leaflet", "Symbol.arrowHead")
    @js.native
    def arrowHead(options: ArrowHeadOptions): ArrowHead_ = js.native
    
    @JSImport("leaflet", "Symbol.dash")
    @js.native
    def dash(): Dash_ = js.native
    @JSImport("leaflet", "Symbol.dash")
    @js.native
    def dash(options: DashOptions): Dash_ = js.native
    
    @JSImport("leaflet", "Symbol.marker")
    @js.native
    def marker(): Marker_ = js.native
    @JSImport("leaflet", "Symbol.marker")
    @js.native
    def marker(options: MarkerOptions): Marker_ = js.native
    
    @js.native
    trait ArrowHeadOptions extends StObject {
      
      var headAngle: js.UndefOr[Double] = js.native
      
      var pathOptions: js.UndefOr[PathOptions] = js.native
      
      var pixelSize: js.UndefOr[Double] = js.native
      
      var polygon: js.UndefOr[Boolean] = js.native
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
    
    @js.native
    trait DashOptions extends StObject {
      
      var pathOptions: js.UndefOr[PathOptions] = js.native
      
      var pixelSize: js.UndefOr[Double] = js.native
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
    
    @js.native
    trait MarkerOptions extends StObject {
      
      var markerOptions: js.UndefOr[typings.leaflet.mod.MarkerOptions] = js.native
      
      var rotate: js.UndefOr[Boolean] = js.native
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
  
  @JSImport("leaflet", "isCoord")
  @js.native
  def isCoord(c: js.Any): Boolean = js.native
  
  @JSImport("leaflet", "isCoordArray")
  @js.native
  def isCoordArray(c: js.Any): Boolean = js.native
  
  @JSImport("leaflet", "polylineDecorator")
  @js.native
  def polylineDecorator(
    paths: (Polyline_[LineString | MultiLineString, _]) | (js.Array[Polyline_[LineString | MultiLineString, _]]),
    options: js.UndefOr[PolylineDecoratorOptions]
  ): PolylineDecorator_ = js.native
  
  @js.native
  trait Pattern extends StObject {
    
    var endOffset: js.UndefOr[Double | String] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var repeat: Double | String = js.native
    
    var symbol: Dash_ | ArrowHead_ | Marker_ = js.native
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
  
  @js.native
  trait PolylineDecoratorOptions extends StObject {
    
    var patterns: js.Array[Pattern] = js.native
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
