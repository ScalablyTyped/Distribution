package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED
*/
trait DisputeStatus extends js.Object

object DisputeStatus {
  @scala.inline
  def CLOSED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED = this.cast("CLOSED")
  @scala.inline
  def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def PENDING_BANK_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION = this.cast("PENDING_BANK_ACTION")
  @scala.inline
  def PENDING_CLIENT_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION = this.cast("PENDING_CLIENT_ACTION")
  @scala.inline
  def REOPENED_PENDING_CLIENT_ACTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION = this.cast("REOPENED_PENDING_CLIENT_ACTION")
  @scala.inline
  def SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = this.cast("SUBMITTED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

