package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Get the formatted message text.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Get all messages. May be more than one if [executeAllRules](ui.igvalidator#options:executeAllRules) is enabled.
    */
  var messages: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Deprecated. Populated with the name of the rule that failed validation.
    */
  var rule: js.UndefOr[String] = js.undefined
  
  /**
    * Populated with the names of rule that failed validation.
    */
  var rules: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object ErrorEventUIParam {
  
  @scala.inline
  def apply(): ErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorEventUIParam]
  }
  
  @scala.inline
  implicit class ErrorEventUIParamMutableBuilder[Self <: ErrorEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOptions(value: js.Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[js.Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
