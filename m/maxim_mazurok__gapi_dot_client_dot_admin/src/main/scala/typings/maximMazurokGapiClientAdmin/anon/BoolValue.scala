package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoolValue extends StObject {
  
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Integer value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * Nested parameter value pairs associated with this parameter. Complex value type for a parameter are returned as a list of parameter values. For example, the address
    * parameter may have a value as [{parameter: [{name: city, value: abc}]}]
    */
  var messageValue: js.UndefOr[Parameter] = js.native
  
  /** Integer values of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.native
  
  /** List of messageValue objects. */
  var multiMessageValue: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** String values of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.native
}
object BoolValue {
  
  @scala.inline
  def apply(): BoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoolValue]
  }
  
  @scala.inline
  implicit class BoolValueMutableBuilder[Self <: BoolValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setMessageValue(value: Parameter): Self = StObject.set(x, "messageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageValueUndefined: Self = StObject.set(x, "messageValue", js.undefined)
    
    @scala.inline
    def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
    
    @scala.inline
    def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiMessageValue(value: js.Array[Parameter]): Self = StObject.set(x, "multiMessageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiMessageValueUndefined: Self = StObject.set(x, "multiMessageValue", js.undefined)
    
    @scala.inline
    def setMultiMessageValueVarargs(value: Parameter*): Self = StObject.set(x, "multiMessageValue", js.Array(value :_*))
    
    @scala.inline
    def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    @scala.inline
    def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
