package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRuleBase extends js.Object {
  
  var message: String | KnockoutValidationMessageFunction = js.native
}
object KnockoutValidationRuleBase {
  
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
  
  @scala.inline
  implicit class KnockoutValidationRuleBaseOps[Self <: KnockoutValidationRuleBase] (val x: Self) extends AnyVal {
    
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
    def setMessageFunction2(value: (/* params */ js.Any, /* observable */ js.Any) => String): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessage(value: String | KnockoutValidationMessageFunction): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
