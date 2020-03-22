package typings.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def PAYIN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN = this.cast("PAYIN")
  @scala.inline
  def PAYOUT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT = this.cast("PAYOUT")
  @scala.inline
  def TRANSFER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

