package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationRuleBase extends StObject {
  
  var message: String | KnockoutValidationMessageFunction
}
object KnockoutValidationRuleBase {
  
  inline def apply(message: String | KnockoutValidationMessageFunction): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
  
  extension [Self <: KnockoutValidationRuleBase](x: Self) {
    
    inline def setMessage(value: String | KnockoutValidationMessageFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* params */ Any, /* observable */ Any) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
  }
}
