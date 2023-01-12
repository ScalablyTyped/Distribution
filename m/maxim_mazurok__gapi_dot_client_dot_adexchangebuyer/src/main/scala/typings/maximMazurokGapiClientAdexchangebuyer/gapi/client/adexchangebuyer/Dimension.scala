package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  var dimensionType: js.UndefOr[String] = js.undefined
  
  var dimensionValues: js.UndefOr[js.Array[DimensionDimensionValue]] = js.undefined
}
object Dimension {
  
  inline def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    inline def setDimensionType(value: String): Self = StObject.set(x, "dimensionType", value.asInstanceOf[js.Any])
    
    inline def setDimensionTypeUndefined: Self = StObject.set(x, "dimensionType", js.undefined)
    
    inline def setDimensionValues(value: js.Array[DimensionDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: DimensionDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
  }
}
