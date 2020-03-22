package typings.mangopay2NodejsSdk.mod.disputeDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait RefusedReasonType extends js.Object

object RefusedReasonType {
  @scala.inline
  def DOCUMENT_FALSIFIED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED = this.cast("DOCUMENT_FALSIFIED")
  @scala.inline
  def DOCUMENT_HAS_EXPIRED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED = this.cast("DOCUMENT_HAS_EXPIRED")
  @scala.inline
  def DOCUMENT_INCOMPLETE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE = this.cast("DOCUMENT_INCOMPLETE")
  @scala.inline
  def DOCUMENT_MISSING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING = this.cast("DOCUMENT_MISSING")
  @scala.inline
  def DOCUMENT_NOT_ACCEPTED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED = this.cast("DOCUMENT_NOT_ACCEPTED")
  @scala.inline
  def DOCUMENT_UNREADABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE = this.cast("DOCUMENT_UNREADABLE")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def SPECIFIC_CASE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE = this.cast("SPECIFIC_CASE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

