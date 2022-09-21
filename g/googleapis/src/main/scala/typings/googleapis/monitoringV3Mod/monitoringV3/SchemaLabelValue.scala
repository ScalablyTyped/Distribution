package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabelValue extends StObject {
  
  /**
    * A bool label value.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An int64 label value.
    */
  var int64Value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string label value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaLabelValue {
  
  inline def apply(): SchemaLabelValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelValue]
  }
  
  extension [Self <: SchemaLabelValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueNull: Self = StObject.set(x, "int64Value", null)
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
