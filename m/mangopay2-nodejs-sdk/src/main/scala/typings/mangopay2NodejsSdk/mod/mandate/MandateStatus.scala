package typings.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * - "CREATED" - the mandate has been created
  * - "SUBMITTED" - the mandate has been submitted to the banks and you can now do payments with this mandate
  * - "ACTIVE" - the mandate is active and has been accepted by the banks and/or successfully used in a payment
  * - "FAILED" - the mandate has failed for a variety of reasons and is no longer available for payments
  */
/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IMandateStatus> */
/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
*/
trait MandateStatus extends js.Object

object MandateStatus {
  @scala.inline
  def ACTIVE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUBMITTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = this.cast("SUBMITTED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

