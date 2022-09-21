package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawFeature extends StObject {
  
  def changed(): Unit
  
  var coordinates: Position
  
  def getCoordinates(): Position
  
  def incomingCoords(coords: Position): Unit
  
  var properties: GeoJsonProperties
  
  def setCoordinates(coords: Position): Unit
  
  def setProperty(property: String, value: Any): Unit
  
  def toGeoJSON(): GeoJSON
}
object DrawFeature {
  
  inline def apply(
    changed: () => Unit,
    coordinates: Position,
    getCoordinates: () => Position,
    incomingCoords: Position => Unit,
    setCoordinates: Position => Unit,
    setProperty: (String, Any) => Unit,
    toGeoJSON: () => GeoJSON
  ): DrawFeature = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), coordinates = coordinates.asInstanceOf[js.Any], getCoordinates = js.Any.fromFunction0(getCoordinates), incomingCoords = js.Any.fromFunction1(incomingCoords), setCoordinates = js.Any.fromFunction1(setCoordinates), setProperty = js.Any.fromFunction2(setProperty), toGeoJSON = js.Any.fromFunction0(toGeoJSON), properties = null)
    __obj.asInstanceOf[DrawFeature]
  }
  
  extension [Self <: DrawFeature](x: Self) {
    
    inline def setChanged(value: () => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction0(value))
    
    inline def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setGetCoordinates(value: () => Position): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    inline def setIncomingCoords(value: Position => Unit): Self = StObject.set(x, "incomingCoords", js.Any.fromFunction1(value))
    
    inline def setProperties(value: GeoJsonProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setSetCoordinates(value: Position => Unit): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSetProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction2(value))
    
    inline def setToGeoJSON(value: () => GeoJSON): Self = StObject.set(x, "toGeoJSON", js.Any.fromFunction0(value))
  }
}
