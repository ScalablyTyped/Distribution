package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRuleBase extends StObject {
  
  var message: String | KnockoutValidationMessageFunction = js.native
}
object KnockoutValidationRuleBase {
  
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
  
  @scala.inline
  implicit class KnockoutValidationRuleBaseMutableBuilder[Self <: KnockoutValidationRuleBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String | KnockoutValidationMessageFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction2(value: (/* params */ js.Any, /* observable */ js.Any) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
  }
}
