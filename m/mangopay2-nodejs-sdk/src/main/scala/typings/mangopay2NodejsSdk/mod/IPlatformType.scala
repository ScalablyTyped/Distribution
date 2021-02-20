package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlatformType extends StObject {
  
  var CROWDFUNDING_DONATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION = js.native
  
  var CROWDFUNDING_EQUITY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY = js.native
  
  var CROWDFUNDING_LOAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN = js.native
  
  var CROWDFUNDING_REWARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD = js.native
  
  var MARKETPLACE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE = js.native
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  
  var OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = js.native
  
  var P2P_PAYMENT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT = js.native
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
  
  @scala.inline
  implicit class IPlatformTypeMutableBuilder[Self <: IPlatformType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCROWDFUNDING_DONATION(value: CROWDFUNDING_DONATION): Self = StObject.set(x, "CROWDFUNDING_DONATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCROWDFUNDING_EQUITY(value: CROWDFUNDING_EQUITY): Self = StObject.set(x, "CROWDFUNDING_EQUITY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCROWDFUNDING_LOAN(value: CROWDFUNDING_LOAN): Self = StObject.set(x, "CROWDFUNDING_LOAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCROWDFUNDING_REWARD(value: CROWDFUNDING_REWARD): Self = StObject.set(x, "CROWDFUNDING_REWARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMARKETPLACE(value: MARKETPLACE): Self = StObject.set(x, "MARKETPLACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: OTHER): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2P_PAYMENT(value: P2P_PAYMENT): Self = StObject.set(x, "P2P_PAYMENT", value.asInstanceOf[js.Any])
  }
}
