package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationAsyncRuleDefinition
  extends StObject
     with KnockoutValidationRuleBase {
  
  var async: Boolean
  
  def validator(value: Any, params: Any, callback: KnockoutValidationAsyncCallback): Unit
}
object KnockoutValidationAsyncRuleDefinition {
  
  inline def apply(
    async: Boolean,
    message: String | KnockoutValidationMessageFunction,
    validator: (Any, Any, KnockoutValidationAsyncCallback) => Unit
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction3(validator))
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutValidationAsyncRuleDefinition] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: (Any, Any, KnockoutValidationAsyncCallback) => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
  }
}
