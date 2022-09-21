package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPointData extends StObject {
  
  /**
    * The time interval associated with the point.
    */
  var timeInterval: js.UndefOr[SchemaTimeInterval] = js.undefined
  
  /**
    * The values that make up the point.
    */
  var values: js.UndefOr[js.Array[SchemaTypedValue]] = js.undefined
}
object SchemaPointData {
  
  inline def apply(): SchemaPointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointData]
  }
  
  extension [Self <: SchemaPointData](x: Self) {
    
    inline def setTimeInterval(value: SchemaTimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    
    inline def setValues(value: js.Array[SchemaTypedValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaTypedValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
