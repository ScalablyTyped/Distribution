package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRule extends js.Object {
  
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
  implicit class KnockoutValidationRuleOps[Self <: KnockoutValidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: () => Boolean): Self = this.set("condition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setMessageFunction2(value: (/* params */ js.Any, /* observable */ js.Any) => String): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessage(value: String | KnockoutValidationMessageFunction): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
