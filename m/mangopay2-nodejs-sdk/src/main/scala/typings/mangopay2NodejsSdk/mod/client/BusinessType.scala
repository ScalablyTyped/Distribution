package typings.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BusinessType extends js.Object

object BusinessType {
  @scala.inline
  def CROWDFUNDING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING = this.cast("CROWDFUNDING")
  @scala.inline
  def FRANCHISE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRANCHISE = this.cast("FRANCHISE")
  @scala.inline
  def MARKETPLACE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = this.cast("MARKETPLACE")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

