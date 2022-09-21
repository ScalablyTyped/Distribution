package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatedEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the formatted message text, if any.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Get all messages, if any. May be more than one if [executeAllRules](ui.igvalidator#options:executeAllRules) is enabled.
    */
  var messages: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Deprecated. Populated with the name of the rule that failed validation, if any.
    */
  var rule: js.UndefOr[String] = js.undefined
  
  /**
    * Populated with the names of rule that failed validation, if any.
    */
  var rules: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object ValidatedEventUIParam {
  
  inline def apply(): ValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatedEventUIParam]
  }
  
  extension [Self <: ValidatedEventUIParam](x: Self) {
    
    inline def setFieldOptions(value: Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessages(value: js.Array[Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Any*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
