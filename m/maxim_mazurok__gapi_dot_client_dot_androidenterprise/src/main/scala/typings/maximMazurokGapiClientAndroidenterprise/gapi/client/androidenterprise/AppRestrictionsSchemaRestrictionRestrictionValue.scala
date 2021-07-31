package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRestrictionsSchemaRestrictionRestrictionValue extends StObject {
  
  /** The type of the value being provided. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The boolean value - this will only be present if type is bool. */
  var valueBool: js.UndefOr[Boolean] = js.undefined
  
  /** The integer value - this will only be present if type is integer. */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /** The list of string values - this will only be present if type is multiselect. */
  var valueMultiselect: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The string value - this will be present for types string, choice and hidden. */
  var valueString: js.UndefOr[String] = js.undefined
}
object AppRestrictionsSchemaRestrictionRestrictionValue {
  
  @scala.inline
  def apply(): AppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaRestrictionRestrictionValue]
  }
  
  @scala.inline
  implicit class AppRestrictionsSchemaRestrictionRestrictionValueMutableBuilder[Self <: AppRestrictionsSchemaRestrictionRestrictionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueBool(value: Boolean): Self = StObject.set(x, "valueBool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBoolUndefined: Self = StObject.set(x, "valueBool", js.undefined)
    
    @scala.inline
    def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueMultiselect(value: js.Array[String]): Self = StObject.set(x, "valueMultiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMultiselectUndefined: Self = StObject.set(x, "valueMultiselect", js.undefined)
    
    @scala.inline
    def setValueMultiselectVarargs(value: String*): Self = StObject.set(x, "valueMultiselect", js.Array(value :_*))
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
  }
}
