package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.Data.Feature
import typings.googlemaps.google.maps.Data.FeatureOptions
import typings.googlemaps.google.maps.Data.GeoJsonOptions
import typings.googlemaps.google.maps.Data.StyleOptions
import typings.googlemaps.google.maps.Data.StylingFunction
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data
  extends StObject
     with MVCObject {
  
  def add(feature: Feature): Feature = js.native
  def add(feature: FeatureOptions): Feature = js.native
  
  def addGeoJson(geoJson: js.Object): js.Array[Feature] = js.native
  def addGeoJson(geoJson: js.Object, options: GeoJsonOptions): js.Array[Feature] = js.native
  
  def contains(feature: Feature): Boolean = js.native
  
  def forEach(callback: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  
  def getControlPosition(): ControlPosition = js.native
  
  def getControls(): js.Array[DrawingMode] = js.native
  
  def getDrawingMode(): DrawingMode | Null = js.native
  
  def getFeatureById(id: String): Feature = js.native
  def getFeatureById(id: Double): Feature = js.native
  
  def getMap(): Map[Element] = js.native
  
  def getStyle(): StylingFunction | StyleOptions = js.native
  
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(url: String, options: Unit, callback: js.Function1[/* features */ js.Array[Feature], Unit]): Unit = js.native
  def loadGeoJson(url: String, options: GeoJsonOptions): Unit = js.native
  def loadGeoJson(
    url: String,
    options: GeoJsonOptions,
    callback: js.Function1[/* features */ js.Array[Feature], Unit]
  ): Unit = js.native
  
  def overrideStyle(feature: Feature, style: StyleOptions): Unit = js.native
  
  def remove(feature: Feature): Unit = js.native
  
  def revertStyle(): Unit = js.native
  def revertStyle(feature: Feature): Unit = js.native
  
  def setControlPosition(controlPosition: ControlPosition): Unit = js.native
  
  def setControls(): Unit = js.native
  def setControls(controls: js.Array[DrawingMode]): Unit = js.native
  
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: DrawingMode): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
}
object Data {
  
  trait AddFeatureEvent extends StObject {
    
    var feature: Feature
  }
  object AddFeatureEvent {
    
    inline def apply(feature: Feature): AddFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddFeatureEvent]
    }
    
    extension [Self <: AddFeatureEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataOptions extends StObject {
    
    var controlPosition: js.UndefOr[ControlPosition] = js.undefined
    
    var controls: js.UndefOr[js.Array[DrawingMode] | Null] = js.undefined
    
    var drawingMode: js.UndefOr[DrawingMode | Null] = js.undefined
    
    var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.undefined
    
    var map: js.UndefOr[Map[Element]] = js.undefined
    
    var style: js.UndefOr[StylingFunction | StyleOptions] = js.undefined
  }
  object DataOptions {
    
    inline def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    extension [Self <: DataOptions](x: Self) {
      
      inline def setControlPosition(value: ControlPosition): Self = StObject.set(x, "controlPosition", value.asInstanceOf[js.Any])
      
      inline def setControlPositionUndefined: Self = StObject.set(x, "controlPosition", js.undefined)
      
      inline def setControls(value: js.Array[DrawingMode]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsNull: Self = StObject.set(x, "controls", null)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: DrawingMode*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      inline def setDrawingMode(value: DrawingMode): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      inline def setDrawingModeNull: Self = StObject.set(x, "drawingMode", null)
      
      inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      inline def setFeatureFactory(value: /* geometry */ Geometry => Feature): Self = StObject.set(x, "featureFactory", js.Any.fromFunction1(value))
      
      inline def setFeatureFactoryUndefined: Self = StObject.set(x, "featureFactory", js.undefined)
      
      inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStyle(value: StylingFunction | StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* feature */ Feature => StyleOptions): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Feature extends StObject {
    
    def forEachProperty(callback: js.Function2[/* value */ js.Any, /* name */ String, Unit]): Unit = js.native
    
    def getGeometry(): Geometry = js.native
    
    def getId(): Double | String = js.native
    
    def getProperty(name: String): js.Any = js.native
    
    def removeProperty(name: String): Unit = js.native
    
    def setGeometry(newGeometry: Geometry): Unit = js.native
    def setGeometry(newGeometry: LatLng): Unit = js.native
    def setGeometry(newGeometry: LatLngLiteral): Unit = js.native
    
    def setProperty(name: String, newValue: js.Any): Unit = js.native
    
    def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
  }
  
  trait FeatureOptions extends StObject {
    
    var geometry: js.UndefOr[Geometry | LatLng | LatLngLiteral] = js.undefined
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var properties: js.UndefOr[js.Object] = js.undefined
  }
  object FeatureOptions {
    
    inline def apply(): FeatureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureOptions]
    }
    
    extension [Self <: FeatureOptions](x: Self) {
      
      inline def setGeometry(value: Geometry | LatLng | LatLngLiteral): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  trait GeoJsonOptions extends StObject {
    
    var idPropertyName: js.UndefOr[String] = js.undefined
  }
  object GeoJsonOptions {
    
    inline def apply(): GeoJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoJsonOptions]
    }
    
    extension [Self <: GeoJsonOptions](x: Self) {
      
      inline def setIdPropertyName(value: String): Self = StObject.set(x, "idPropertyName", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyNameUndefined: Self = StObject.set(x, "idPropertyName", js.undefined)
    }
  }
  
  trait Geometry extends StObject {
    
    def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit
    
    def getType(): String
  }
  object Geometry {
    
    inline def apply(forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[Geometry]
    }
    
    extension [Self <: Geometry](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* latLng */ LatLng, Unit] => Unit): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  trait GeometryCollection
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[Geometry]
    
    def getAt(n: Double): Geometry
    
    def getLength(): Double
  }
  object GeometryCollection {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[Geometry],
      getAt: Double => Geometry,
      getLength: () => Double,
      getType: () => String
    ): GeometryCollection = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[GeometryCollection]
    }
    
    extension [Self <: GeometryCollection](x: Self) {
      
      inline def setGetArray(value: () => js.Array[Geometry]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => Geometry): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait LineString
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[LatLng]
    
    def getAt(n: Double): LatLng
    
    def getLength(): Double
  }
  object LineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LineString]
    }
    
    extension [Self <: LineString](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait LinearRing
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[LatLng]
    
    def getAt(n: Double): LatLng
    
    def getLength(): Double
  }
  object LinearRing {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LinearRing = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LinearRing]
    }
    
    extension [Self <: LinearRing](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  // tslint:disable-next-line:no-unnecessary-qualifier
  trait MouseEvent
    extends StObject
       with typings.googlemaps.google.maps.MouseEvent {
    
    var feature: Feature
  }
  object MouseEvent {
    
    inline def apply(feature: Feature, latLng: LatLng, stop: () => Unit): typings.googlemaps.google.maps.Data.MouseEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[typings.googlemaps.google.maps.Data.MouseEvent]
    }
    
    extension [Self <: typings.googlemaps.google.maps.Data.MouseEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[LineString]
    
    def getAt(n: Double): LineString
    
    def getLength(): Double
  }
  object MultiLineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LineString],
      getAt: Double => LineString,
      getLength: () => Double,
      getType: () => String
    ): MultiLineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiLineString]
    }
    
    extension [Self <: MultiLineString](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LineString]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LineString): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait MultiPoint
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[LatLng]
    
    def getAt(n: Double): LatLng
    
    def getLength(): Double
  }
  object MultiPoint {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): MultiPoint = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPoint]
    }
    
    extension [Self <: MultiPoint](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait MultiPolygon
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[typings.googlemaps.google.maps.Data.Polygon]
    
    def getAt(n: Double): typings.googlemaps.google.maps.Data.Polygon
    
    def getLength(): Double
  }
  object MultiPolygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[typings.googlemaps.google.maps.Data.Polygon],
      getAt: Double => typings.googlemaps.google.maps.Data.Polygon,
      getLength: () => Double,
      getType: () => String
    ): MultiPolygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPolygon]
    }
    
    extension [Self <: MultiPolygon](x: Self) {
      
      inline def setGetArray(value: () => js.Array[typings.googlemaps.google.maps.Data.Polygon]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => typings.googlemaps.google.maps.Data.Polygon): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait Point
    extends StObject
       with Geometry {
    
    def get(): LatLng
  }
  object Point {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      get: () => LatLng,
      getType: () => String
    ): typings.googlemaps.google.maps.Data.Point = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), get = js.Any.fromFunction0(get), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typings.googlemaps.google.maps.Data.Point]
    }
    
    extension [Self <: typings.googlemaps.google.maps.Data.Point](x: Self) {
      
      inline def setGet(value: () => LatLng): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  trait Polygon
    extends StObject
       with Geometry {
    
    def getArray(): js.Array[LinearRing]
    
    def getAt(n: Double): LinearRing
    
    def getLength(): Double
  }
  object Polygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LinearRing],
      getAt: Double => LinearRing,
      getLength: () => Double,
      getType: () => String
    ): typings.googlemaps.google.maps.Data.Polygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typings.googlemaps.google.maps.Data.Polygon]
    }
    
    extension [Self <: typings.googlemaps.google.maps.Data.Polygon](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LinearRing]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LinearRing): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  trait RemoveFeatureEvent extends StObject {
    
    var feature: Feature
  }
  object RemoveFeatureEvent {
    
    inline def apply(feature: Feature): RemoveFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveFeatureEvent]
    }
    
    extension [Self <: RemoveFeatureEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemovePropertyEvent extends StObject {
    
    var feature: Feature
    
    var name: String
    
    var oldValue: js.Any
  }
  object RemovePropertyEvent {
    
    inline def apply(feature: Feature, name: String, oldValue: js.Any): RemovePropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePropertyEvent]
    }
    
    extension [Self <: RemovePropertyEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetGeometryEvent extends StObject {
    
    var feature: Feature
    
    var newGeometry: Geometry
    
    var oldGeometry: Geometry
  }
  object SetGeometryEvent {
    
    inline def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], newGeometry = newGeometry.asInstanceOf[js.Any], oldGeometry = oldGeometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetGeometryEvent]
    }
    
    extension [Self <: SetGeometryEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setNewGeometry(value: Geometry): Self = StObject.set(x, "newGeometry", value.asInstanceOf[js.Any])
      
      inline def setOldGeometry(value: Geometry): Self = StObject.set(x, "oldGeometry", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetPropertyEvent extends StObject {
    
    var feature: Feature
    
    var name: String
    
    var newValue: js.Any
    
    var oldValue: js.Any
  }
  object SetPropertyEvent {
    
    inline def apply(feature: Feature, name: String, newValue: js.Any, oldValue: js.Any): SetPropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPropertyEvent]
    }
    
    extension [Self <: SetPropertyEvent](x: Self) {
      
      inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleOptions extends StObject {
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    // tslint:disable-next-line:no-unnecessary-qualifier
    var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
    
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object StyleOptions {
    
    inline def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    extension [Self <: StyleOptions](x: Self) {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]
}
