package typings.mangopay2NodejsSdk.mod.payIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPayInPaymentType> */
/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
*/
trait PayInPaymentType extends js.Object

object PayInPaymentType {
  @scala.inline
  def BANK_WIRE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE = this.cast("BANK_WIRE")
  @scala.inline
  def CARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD = this.cast("CARD")
  @scala.inline
  def DIRECT_DEBIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT = this.cast("DIRECT_DEBIT")
  @scala.inline
  def PAYPAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL = this.cast("PAYPAL")
  @scala.inline
  def PREAUTHORIZED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED = this.cast("PREAUTHORIZED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

