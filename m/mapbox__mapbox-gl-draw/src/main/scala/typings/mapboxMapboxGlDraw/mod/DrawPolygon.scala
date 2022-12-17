package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.Position
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawPolygon
  extends StObject
     with DrawFeatureBase[js.Array[js.Array[Position]]]
     with _DrawFeature {
  
  def addCoordinate(path: String, lng: Double, lat: Double): Unit
  
  def removeCoordinate(path: String): Unit
  
  @JSName("type")
  val type_DrawPolygon: Polygon
}
object DrawPolygon {
  
  inline def apply(
    addCoordinate: (String, Double, Double) => Unit,
    changed: () => Unit,
    coordinates: js.Array[js.Array[Position]],
    getCoordinate: String => Position,
    getCoordinates: () => js.Array[js.Array[Position]],
    incomingCoords: /* import warning: importer.ImportType#apply Failed type conversion: this['setCoordinates'] */ js.Any,
    isValid: () => Boolean,
    removeCoordinate: String => Unit,
    setCoordinates: js.Array[js.Array[Position]] => Unit,
    setProperty: (String, Any) => Unit,
    toGeoJSON: () => GeoJSON,
    updateCoordinate: (String, Double, Double) => Unit
  ): DrawPolygon = {
    val __obj = js.Dynamic.literal(addCoordinate = js.Any.fromFunction3(addCoordinate), changed = js.Any.fromFunction0(changed), coordinates = coordinates.asInstanceOf[js.Any], getCoordinate = js.Any.fromFunction1(getCoordinate), getCoordinates = js.Any.fromFunction0(getCoordinates), incomingCoords = incomingCoords.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), removeCoordinate = js.Any.fromFunction1(removeCoordinate), setCoordinates = js.Any.fromFunction1(setCoordinates), setProperty = js.Any.fromFunction2(setProperty), toGeoJSON = js.Any.fromFunction0(toGeoJSON), updateCoordinate = js.Any.fromFunction3(updateCoordinate), properties = null)
    __obj.updateDynamic("type")("Polygon")
    __obj.asInstanceOf[DrawPolygon]
  }
  
  extension [Self <: DrawPolygon](x: Self) {
    
    inline def setAddCoordinate(value: (String, Double, Double) => Unit): Self = StObject.set(x, "addCoordinate", js.Any.fromFunction3(value))
    
    inline def setRemoveCoordinate(value: String => Unit): Self = StObject.set(x, "removeCoordinate", js.Any.fromFunction1(value))
    
    inline def setType(value: Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
