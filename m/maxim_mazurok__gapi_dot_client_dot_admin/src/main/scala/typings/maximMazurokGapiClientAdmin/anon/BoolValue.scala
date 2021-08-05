package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoolValue extends StObject {
  
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.undefined
  
  /**
    * Nested parameter value pairs associated with this parameter. Complex value type for a parameter are returned as a list of parameter values. For example, the address
    * parameter may have a value as [{parameter: [{name: city, value: abc}]}]
    */
  var messageValue: js.UndefOr[Parameter] = js.undefined
  
  /** Integer values of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of messageValue objects. */
  var multiMessageValue: js.UndefOr[js.Array[Parameter]] = js.undefined
  
  /** String values of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.undefined
  
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}
object BoolValue {
  
  inline def apply(): BoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoolValue]
  }
  
  extension [Self <: BoolValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setMessageValue(value: Parameter): Self = StObject.set(x, "messageValue", value.asInstanceOf[js.Any])
    
    inline def setMessageValueUndefined: Self = StObject.set(x, "messageValue", js.undefined)
    
    inline def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
    
    inline def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
    
    inline def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value :_*))
    
    inline def setMultiMessageValue(value: js.Array[Parameter]): Self = StObject.set(x, "multiMessageValue", value.asInstanceOf[js.Any])
    
    inline def setMultiMessageValueUndefined: Self = StObject.set(x, "multiMessageValue", js.undefined)
    
    inline def setMultiMessageValueVarargs(value: Parameter*): Self = StObject.set(x, "multiMessageValue", js.Array(value :_*))
    
    inline def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
