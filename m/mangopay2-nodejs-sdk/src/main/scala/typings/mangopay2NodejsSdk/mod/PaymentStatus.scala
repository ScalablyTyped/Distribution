package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED = this.cast("EXPIRED")
  @scala.inline
  def VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = this.cast("VALIDATED")
  @scala.inline
  def WAITING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING = this.cast("WAITING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

