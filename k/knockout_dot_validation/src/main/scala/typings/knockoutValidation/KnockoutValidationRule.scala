package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRule extends StObject {
  
  var condition: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var message: js.UndefOr[String | KnockoutValidationMessageFunction] = js.native
  
  var params: js.Any = js.native
  
  var rule: String = js.native
}
object KnockoutValidationRule {
  
  @scala.inline
  def apply(params: js.Any, rule: String): KnockoutValidationRule = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRule]
  }
  
  @scala.inline
  implicit class KnockoutValidationRuleMutableBuilder[Self <: KnockoutValidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: () => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMessage(value: String | KnockoutValidationMessageFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction2(value: (/* params */ js.Any, /* observable */ js.Any) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
