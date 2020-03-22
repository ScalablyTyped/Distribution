package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayInPaymentType extends js.Object {
  var BankWire: BANK_WIRE
  var Card: CARD
  var DirectDebit: DIRECT_DEBIT
  var PayPal: PAYPAL
  var Preauthorized: PREAUTHORIZED
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
}

