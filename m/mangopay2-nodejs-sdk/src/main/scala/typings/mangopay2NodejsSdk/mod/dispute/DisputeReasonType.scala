package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED
*/
trait DisputeReasonType extends js.Object

object DisputeReasonType {
  @scala.inline
  def AUTHORISATION_DISPUTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED = this.cast("AUTHORISATION_DISPUTED")
  @scala.inline
  def CANCELED_REOCCURING_TRANSACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION = this.cast("CANCELED_REOCCURING_TRANSACTION")
  @scala.inline
  def DUPLICATE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE = this.cast("DUPLICATE")
  @scala.inline
  def FRAUD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD = this.cast("FRAUD")
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED = this.cast("LATE_FAILURE_BANKACCOUNT_CLOSED")
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE = this.cast("LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE")
  @scala.inline
  def LATE_FAILURE_BANKACCOUNT_INCORRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT = this.cast("LATE_FAILURE_BANKACCOUNT_INCORRECT")
  @scala.inline
  def LATE_FAILURE_CONTACT_USER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER = this.cast("LATE_FAILURE_CONTACT_USER")
  @scala.inline
  def LATE_FAILURE_INSUFFICIENT_FUNDS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS = this.cast("LATE_FAILURE_INSUFFICIENT_FUNDS")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def PRODUCT_NOT_PROVIDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED = this.cast("PRODUCT_NOT_PROVIDED")
  @scala.inline
  def PRODUCT_UNACCEPTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE = this.cast("PRODUCT_UNACCEPTABLE")
  @scala.inline
  def REFUND_CONVERSION_RATE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE = this.cast("REFUND_CONVERSION_RATE")
  @scala.inline
  def REFUND_NOT_PROCESSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED = this.cast("REFUND_NOT_PROCESSED")
  @scala.inline
  def TRANSACTION_NOT_RECOGNIZED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED = this.cast("TRANSACTION_NOT_RECOGNIZED")
  @scala.inline
  def UNKNOWN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

