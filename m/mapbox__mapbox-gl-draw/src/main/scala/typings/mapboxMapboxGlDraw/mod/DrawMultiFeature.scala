package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Position
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiLineString
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPoint
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPolygon
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawFeatureBase<Type extends 'MultiPoint' ? std.Array<@mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPoint['coordinates']> : never | Type extends 'MultiLineString' ? std.Array<@mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawLineString['coordinates']> : never | Type extends 'MultiPolygon' ? std.Array<@mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPolygon['coordinates']> : never>, 'coordinates'> */
trait DrawMultiFeature[Type /* <: MultiPoint | MultiLineString | MultiPolygon */] extends StObject {
  
  def changed(): Unit
  @JSName("changed")
  var changed_Original: js.Function0[Unit]
  
  val features: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPoint : never */ js.Any
  ]
  
  def getCoordinate(path: String): Position
  @JSName("getCoordinate")
  var getCoordinate_Original: js.Function1[/* path */ String, Position]
  
  def getCoordinates(): /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ js.Any
  @JSName("getCoordinates")
  var getCoordinates_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ js.Any
  ]
  
  def getFeatures(): /* import warning: importer.ImportType#apply Failed type conversion: this['features'] */ js.Any
  
  var id: NonNullable[js.UndefOr[String | Double]]
  
  var incomingCoords: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any
  
  def isValid(): Boolean
  @JSName("isValid")
  var isValid_Original: js.Function0[Boolean]
  
  var properties: GeoJsonProperties
  
  @JSName("setCoordinates")
  def setCoordinates_MultiLineString(
    coords: /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiLineString' ? std.Array<std.Array<geojson.geojson.Position>> : never */ js.Any
  ): Unit
  @JSName("setCoordinates")
  def setCoordinates_MultiPoint(
    coords: /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ js.Any
  ): Unit
  @JSName("setCoordinates")
  def setCoordinates_MultiPolygon(
    coords: /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPolygon' ? std.Array<std.Array<std.Array<geojson.geojson.Position>>> : never */ js.Any
  ): Unit
  @JSName("setCoordinates")
  var setCoordinates_Original: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ /* coords */ js.Any, 
    Unit
  ]
  
  def setProperty(property: String, value: Any): Unit
  @JSName("setProperty")
  var setProperty_Original: js.Function2[/* property */ String, /* value */ Any, Unit]
  
  def toGeoJSON(): GeoJSON
  @JSName("toGeoJSON")
  var toGeoJSON_Original: js.Function0[GeoJSON]
  
  val `type`: Type
  
  def updateCoordinate(path: String, lng: Double, lat: Double): Unit
  @JSName("updateCoordinate")
  var updateCoordinate_Original: js.Function3[/* path */ String, /* lng */ Double, /* lat */ Double, Unit]
}
object DrawMultiFeature {
  
  inline def apply[Type /* <: MultiPoint | MultiLineString | MultiPolygon */](
    changed: () => Unit,
    features: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPoint : never */ js.Any
    ],
    getCoordinate: /* path */ String => Position,
    getCoordinates: () => /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ js.Any,
    getFeatures: () => /* import warning: importer.ImportType#apply Failed type conversion: this['features'] */ js.Any,
    incomingCoords: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any,
    isValid: () => Boolean,
    setCoordinates: /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ /* coords */ js.Any => Unit,
    setProperty: (/* property */ String, /* value */ Any) => Unit,
    toGeoJSON: () => GeoJSON,
    `type`: Type,
    updateCoordinate: (/* path */ String, /* lng */ Double, /* lat */ Double) => Unit
  ): DrawMultiFeature[Type] = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), features = features.asInstanceOf[js.Any], getCoordinate = js.Any.fromFunction1(getCoordinate), getCoordinates = js.Any.fromFunction0(getCoordinates), getFeatures = js.Any.fromFunction0(getFeatures), incomingCoords = incomingCoords.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), setCoordinates = js.Any.fromFunction1(setCoordinates), setProperty = js.Any.fromFunction2(setProperty), toGeoJSON = js.Any.fromFunction0(toGeoJSON), updateCoordinate = js.Any.fromFunction3(updateCoordinate), properties = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawMultiFeature[Type]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawMultiFeature[?], Type /* <: MultiPoint | MultiLineString | MultiPolygon */] (val x: Self & DrawMultiFeature[Type]) extends AnyVal {
    
    inline def setChanged(value: () => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction0(value))
    
    inline def setFeatures(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPoint : never */ js.Any
        ]
    ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawPoint : never */ js.Any)*
    ): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setGetCoordinate(value: /* path */ String => Position): Self = StObject.set(x, "getCoordinate", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ js.Any
    ): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    inline def setGetFeatures(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: this['features'] */ js.Any
    ): Self = StObject.set(x, "getFeatures", js.Any.fromFunction0(value))
    
    inline def setId(value: NonNullable[js.UndefOr[String | Double]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncomingCoords(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any
    ): Self = StObject.set(x, "incomingCoords", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setProperties(value: GeoJsonProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setSetCoordinates(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Type extends 'MultiPoint' ? std.Array<geojson.geojson.Position> : never */ /* coords */ js.Any => Unit
    ): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: (/* property */ String, /* value */ Any) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
    
    inline def setToGeoJSON(value: () => GeoJSON): Self = StObject.set(x, "toGeoJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateCoordinate(value: (/* path */ String, /* lng */ Double, /* lat */ Double) => Unit): Self = StObject.set(x, "updateCoordinate", js.Any.fromFunction3(value))
  }
}
