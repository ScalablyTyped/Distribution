package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccount extends StObject {
  
  var bankAccount: String
  
  var bic: js.UndefOr[String] = js.undefined
  
  var holder: String
  
  var verified: Boolean
}
object BankAccount {
  
  inline def apply(bankAccount: String, holder: String, verified: Boolean): BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  
  extension [Self <: BankAccount](x: Self) {
    
    inline def setBankAccount(value: String): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    inline def setBicUndefined: Self = StObject.set(x, "bic", js.undefined)
    
    inline def setHolder(value: String): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
