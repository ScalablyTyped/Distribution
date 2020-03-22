package typings.mangopay2NodejsSdk.mod.refund

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait RefundReasonType extends js.Object

object RefundReasonType {
  @scala.inline
  def BANKACCOUNT_HAS_BEEN_CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED = this.cast("BANKACCOUNT_HAS_BEEN_CLOSED")
  @scala.inline
  def BANKACCOUNT_INCORRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT = this.cast("BANKACCOUNT_INCORRECT")
  @scala.inline
  def INITIALIZED_BY_CLIENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT = this.cast("INITIALIZED_BY_CLIENT")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def OWNER_DO_NOT_MATCH_BANKACCOUNT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT = this.cast("OWNER_DO_NOT_MATCH_BANKACCOUNT")
  @scala.inline
  def WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS = this.cast("WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

