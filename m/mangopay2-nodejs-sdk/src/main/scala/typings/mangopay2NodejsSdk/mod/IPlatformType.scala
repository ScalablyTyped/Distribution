package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlatformType extends js.Object {
  var CROWDFUNDING_DONATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
  var CROWDFUNDING_EQUITY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
  var CROWDFUNDING_LOAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
  var CROWDFUNDING_REWARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
  var MARKETPLACE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  var OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  var P2P_PAYMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
}

object IPlatformType {
  @scala.inline
  def apply(
    CROWDFUNDING_DONATION: CROWDFUNDING_DONATION,
    CROWDFUNDING_EQUITY: CROWDFUNDING_EQUITY,
    CROWDFUNDING_LOAN: CROWDFUNDING_LOAN,
    CROWDFUNDING_REWARD: CROWDFUNDING_REWARD,
    MARKETPLACE: MARKETPLACE,
    NotSpecified: NotSpecified,
    OTHER: OTHER,
    P2P_PAYMENT: P2P_PAYMENT
  ): IPlatformType = {
    val __obj = js.Dynamic.literal(CROWDFUNDING_DONATION = CROWDFUNDING_DONATION.asInstanceOf[js.Any], CROWDFUNDING_EQUITY = CROWDFUNDING_EQUITY.asInstanceOf[js.Any], CROWDFUNDING_LOAN = CROWDFUNDING_LOAN.asInstanceOf[js.Any], CROWDFUNDING_REWARD = CROWDFUNDING_REWARD.asInstanceOf[js.Any], MARKETPLACE = MARKETPLACE.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], P2P_PAYMENT = P2P_PAYMENT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlatformType]
  }
}

