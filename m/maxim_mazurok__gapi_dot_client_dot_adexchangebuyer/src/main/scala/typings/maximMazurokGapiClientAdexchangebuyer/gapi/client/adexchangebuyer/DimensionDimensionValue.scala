package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionDimensionValue extends StObject {
  
  /** Id of the dimension. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** Name of the dimension mainly for debugging purposes, except for the case of CREATIVE_SIZE. For CREATIVE_SIZE, strings are used instead of ids. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Percent of total impressions for a dimension type. e.g. {dimension_type: 'GENDER', [{dimension_value: {id: 1, name: 'MALE', percentage: 60}}]} Gender MALE is 60% of all impressions
    * which have gender.
    */
  var percentage: js.UndefOr[Double] = js.undefined
}
object DimensionDimensionValue {
  
  inline def apply(): DimensionDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionDimensionValue]
  }
  
  extension [Self <: DimensionDimensionValue](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
