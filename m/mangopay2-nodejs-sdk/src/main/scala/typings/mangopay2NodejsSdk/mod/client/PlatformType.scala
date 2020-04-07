package typings.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPlatformType> */
/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
*/
trait PlatformType extends js.Object

object PlatformType {
  @scala.inline
  def CROWDFUNDING_DONATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION = this.cast("CROWDFUNDING_DONATION")
  @scala.inline
  def CROWDFUNDING_EQUITY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY = this.cast("CROWDFUNDING_EQUITY")
  @scala.inline
  def CROWDFUNDING_LOAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN = this.cast("CROWDFUNDING_LOAN")
  @scala.inline
  def CROWDFUNDING_REWARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD = this.cast("CROWDFUNDING_REWARD")
  @scala.inline
  def MARKETPLACE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = this.cast("MARKETPLACE")
  @scala.inline
  def NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = this.cast("NotSpecified")
  @scala.inline
  def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def P2P_PAYMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT = this.cast("P2P_PAYMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

