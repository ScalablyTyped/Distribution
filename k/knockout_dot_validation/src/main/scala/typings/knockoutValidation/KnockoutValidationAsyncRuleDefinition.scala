package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  
  var async: Boolean = js.native
  
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): Unit = js.native
}
object KnockoutValidationAsyncRuleDefinition {
  
  @scala.inline
  def apply(
    async: Boolean,
    message: String | KnockoutValidationMessageFunction,
    validator: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Unit
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction3(validator))
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
  
  @scala.inline
  implicit class KnockoutValidationAsyncRuleDefinitionMutableBuilder[Self <: KnockoutValidationAsyncRuleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
  }
}
