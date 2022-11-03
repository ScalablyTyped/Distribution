package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeoJsonTypes
import typings.geojson.mod.Position
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawFeatureBase[Coordinates] extends StObject {
  
  def changed(): Unit
  
  val coordinates: Coordinates
  
  def getCoordinate(path: String): Position
  
  def getCoordinates(): Coordinates
  
  val id: NonNullable[js.UndefOr[String | Double]]
  
  var incomingCoords: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any
  
  def isValid(): Boolean
  
  val properties: GeoJsonProperties
  
  def setCoordinates(coords: Coordinates): Unit
  
  def setProperty(property: String, value: Any): Unit
  
  def toGeoJSON(): GeoJSON
  
  val `type`: GeoJsonTypes
  
  def updateCoordinate(path: String, lng: Double, lat: Double): Unit
}
object DrawFeatureBase {
  
  inline def apply[Coordinates](
    changed: () => Unit,
    coordinates: Coordinates,
    getCoordinate: String => Position,
    getCoordinates: () => Coordinates,
    id: NonNullable[js.UndefOr[String | Double]],
    incomingCoords: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any,
    isValid: () => Boolean,
    setCoordinates: Coordinates => Unit,
    setProperty: (String, Any) => Unit,
    toGeoJSON: () => GeoJSON,
    `type`: GeoJsonTypes,
    updateCoordinate: (String, Double, Double) => Unit
  ): DrawFeatureBase[Coordinates] = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), coordinates = coordinates.asInstanceOf[js.Any], getCoordinate = js.Any.fromFunction1(getCoordinate), getCoordinates = js.Any.fromFunction0(getCoordinates), id = id.asInstanceOf[js.Any], incomingCoords = incomingCoords.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), setCoordinates = js.Any.fromFunction1(setCoordinates), setProperty = js.Any.fromFunction2(setProperty), toGeoJSON = js.Any.fromFunction0(toGeoJSON), updateCoordinate = js.Any.fromFunction3(updateCoordinate), properties = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawFeatureBase[Coordinates]]
  }
  
  extension [Self <: DrawFeatureBase[?], Coordinates](x: Self & DrawFeatureBase[Coordinates]) {
    
    inline def setChanged(value: () => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction0(value))
    
    inline def setCoordinates(value: Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setGetCoordinate(value: String => Position): Self = StObject.set(x, "getCoordinate", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: () => Coordinates): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    inline def setId(value: NonNullable[js.UndefOr[String | Double]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIncomingCoords(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any
    ): Self = StObject.set(x, "incomingCoords", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setProperties(value: GeoJsonProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setSetCoordinates(value: Coordinates => Unit): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
    
    inline def setToGeoJSON(value: () => GeoJSON): Self = StObject.set(x, "toGeoJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateCoordinate(value: (String, Double, Double) => Unit): Self = StObject.set(x, "updateCoordinate", js.Any.fromFunction3(value))
  }
}
