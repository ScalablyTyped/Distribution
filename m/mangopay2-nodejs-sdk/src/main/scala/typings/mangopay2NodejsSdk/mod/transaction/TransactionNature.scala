package typings.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
*/
trait TransactionNature extends js.Object

object TransactionNature {
  @scala.inline
  def REFUND: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND = this.cast("REFUND")
  @scala.inline
  def REGULAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR = this.cast("REGULAR")
  @scala.inline
  def REPUDIATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION = this.cast("REPUDIATION")
  @scala.inline
  def SETTLEMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT = this.cast("SETTLEMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

