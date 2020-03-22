package typings.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BankAccountType extends js.Object

object BankAccountType {
  @scala.inline
  def CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = this.cast("GB")
  @scala.inline
  def IBAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = this.cast("IBAN")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

