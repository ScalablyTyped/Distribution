package typings.leafletGeosearch.anon

import typings.leafletGeosearch.leafletGeosearchStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationMethod extends StObject {
  
  var calculationMethod: String
  
  var coordinates: js.Tuple2[Double, Double]
  
  var `type`: Point
  
  var usageTypes: js.Array[String]
}
object CalculationMethod {
  
  inline def apply(calculationMethod: String, coordinates: js.Tuple2[Double, Double], usageTypes: js.Array[String]): CalculationMethod = {
    val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Point")
    __obj.asInstanceOf[CalculationMethod]
  }
  
  extension [Self <: CalculationMethod](x: Self) {
    
    inline def setCalculationMethod(value: String): Self = StObject.set(x, "calculationMethod", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsageTypes(value: js.Array[String]): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
    
    inline def setUsageTypesVarargs(value: String*): Self = StObject.set(x, "usageTypes", js.Array(value*))
  }
}
