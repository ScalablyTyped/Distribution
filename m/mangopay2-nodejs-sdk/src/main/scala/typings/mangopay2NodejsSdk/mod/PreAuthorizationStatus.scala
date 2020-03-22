package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
*/
trait PreAuthorizationStatus extends js.Object

object PreAuthorizationStatus {
  @scala.inline
  def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def FAILED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCEEDED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

