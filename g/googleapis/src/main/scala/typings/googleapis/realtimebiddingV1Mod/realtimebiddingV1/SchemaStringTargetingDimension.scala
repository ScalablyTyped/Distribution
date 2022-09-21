package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringTargetingDimension extends StObject {
  
  /**
    * How the items in this list should be targeted.
    */
  var targetingMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values specified.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStringTargetingDimension {
  
  inline def apply(): SchemaStringTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringTargetingDimension]
  }
  
  extension [Self <: SchemaStringTargetingDimension](x: Self) {
    
    inline def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    inline def setTargetingModeNull: Self = StObject.set(x, "targetingMode", null)
    
    inline def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
