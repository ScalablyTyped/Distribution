package typings.mangopay2NodejsSdk.enumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYCONIQ
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPayInPaymentType extends StObject {
  
  var BankWire: BANK_WIRE
  
  var Card: CARD
  
  var DirectDebit: DIRECT_DEBIT
  
  var PayPal: PAYPAL
  
  var Payconiq: PAYCONIQ
  
  var Preauthorized: PREAUTHORIZED
}
object IPayInPaymentType {
  
  inline def apply(): IPayInPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = "BANK_WIRE", Card = "CARD", DirectDebit = "DIRECT_DEBIT", PayPal = "PAYPAL", Payconiq = "PAYCONIQ", Preauthorized = "PREAUTHORIZED")
    __obj.asInstanceOf[IPayInPaymentType]
  }
  
  extension [Self <: IPayInPaymentType](x: Self) {
    
    inline def setBankWire(value: BANK_WIRE): Self = StObject.set(x, "BankWire", value.asInstanceOf[js.Any])
    
    inline def setCard(value: CARD): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setDirectDebit(value: DIRECT_DEBIT): Self = StObject.set(x, "DirectDebit", value.asInstanceOf[js.Any])
    
    inline def setPayPal(value: PAYPAL): Self = StObject.set(x, "PayPal", value.asInstanceOf[js.Any])
    
    inline def setPayconiq(value: PAYCONIQ): Self = StObject.set(x, "Payconiq", value.asInstanceOf[js.Any])
    
    inline def setPreauthorized(value: PREAUTHORIZED): Self = StObject.set(x, "Preauthorized", value.asInstanceOf[js.Any])
  }
}
