package typings.mangopay2NodejsSdk.mod.wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
*/
trait FundsType extends js.Object

object FundsType {
  @scala.inline
  def CREDIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = this.cast("CREDIT")
  @scala.inline
  def DEFAULT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = this.cast("DEFAULT")
  @scala.inline
  def FEES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = this.cast("FEES")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

