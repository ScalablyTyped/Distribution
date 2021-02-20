package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPayInPaymentType extends StObject {
  
  var BankWire: BANK_WIRE = js.native
  
  var Card: CARD = js.native
  
  var DirectDebit: DIRECT_DEBIT = js.native
  
  var PayPal: PAYPAL = js.native
  
  var Preauthorized: PREAUTHORIZED = js.native
}
object IPayInPaymentType {
  
  @scala.inline
  def apply(
    BankWire: BANK_WIRE,
    Card: CARD,
    DirectDebit: DIRECT_DEBIT,
    PayPal: PAYPAL,
    Preauthorized: PREAUTHORIZED
  ): IPayInPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], DirectDebit = DirectDebit.asInstanceOf[js.Any], PayPal = PayPal.asInstanceOf[js.Any], Preauthorized = Preauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayInPaymentType]
  }
  
  @scala.inline
  implicit class IPayInPaymentTypeMutableBuilder[Self <: IPayInPaymentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankWire(value: BANK_WIRE): Self = StObject.set(x, "BankWire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: CARD): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDebit(value: DIRECT_DEBIT): Self = StObject.set(x, "DirectDebit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayPal(value: PAYPAL): Self = StObject.set(x, "PayPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreauthorized(value: PREAUTHORIZED): Self = StObject.set(x, "Preauthorized", value.asInstanceOf[js.Any])
  }
}
