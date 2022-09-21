package typings.googleapis.reportsV1Mod.adminReportsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNestedParameter extends StObject {
  
  /**
    * Boolean value of the parameter.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Integer value of the parameter.
    */
  var intValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Multiple boolean values of the parameter.
    */
  var multiBoolValue: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
  
  /**
    * Multiple integer values of the parameter.
    */
  var multiIntValue: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Multiple string values of the parameter.
    */
  var multiValue: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String value of the parameter.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaNestedParameter {
  
  inline def apply(): SchemaNestedParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestedParameter]
  }
  
  extension [Self <: SchemaNestedParameter](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueNull: Self = StObject.set(x, "intValue", null)
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setMultiBoolValue(value: js.Array[Boolean]): Self = StObject.set(x, "multiBoolValue", value.asInstanceOf[js.Any])
    
    inline def setMultiBoolValueNull: Self = StObject.set(x, "multiBoolValue", null)
    
    inline def setMultiBoolValueUndefined: Self = StObject.set(x, "multiBoolValue", js.undefined)
    
    inline def setMultiBoolValueVarargs(value: Boolean*): Self = StObject.set(x, "multiBoolValue", js.Array(value*))
    
    inline def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
    
    inline def setMultiIntValueNull: Self = StObject.set(x, "multiIntValue", null)
    
    inline def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
    
    inline def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value*))
    
    inline def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    inline def setMultiValueNull: Self = StObject.set(x, "multiValue", null)
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
