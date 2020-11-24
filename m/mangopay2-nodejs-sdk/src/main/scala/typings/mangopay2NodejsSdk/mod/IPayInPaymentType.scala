package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPayInPaymentType extends js.Object {
  
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
  implicit class IPayInPaymentTypeOps[Self <: IPayInPaymentType] (val x: Self) extends AnyVal {
    
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
    def setBankWire(value: BANK_WIRE): Self = this.set("BankWire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: CARD): Self = this.set("Card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDebit(value: DIRECT_DEBIT): Self = this.set("DirectDebit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayPal(value: PAYPAL): Self = this.set("PayPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreauthorized(value: PREAUTHORIZED): Self = this.set("Preauthorized", value.asInstanceOf[js.Any])
  }
}
