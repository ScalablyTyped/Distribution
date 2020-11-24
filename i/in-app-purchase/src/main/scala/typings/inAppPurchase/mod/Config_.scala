package typings.inAppPurchase.mod

import typings.inAppPurchase.anon.ClientEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends js.Object {
  
  /* Configurations for Amazon Store */
  var amazonAPIVersion: js.UndefOr[Double] = js.native
  
  /* Configurations for Apple */
  // if you want to exclude old transaction, set this to true. Default is false
  var appleExcludeOldTransactions: js.UndefOr[Boolean] = js.native
  
  // this comes from iTunes Connect (You need this to valiate subscriptions)
  var applePassword: js.UndefOr[String] = js.native
  
  /* Configurations for Facebook (Payments Lite) */
  var facebookAppId: js.UndefOr[String] = js.native
  
  var facebookAppSecret: js.UndefOr[String] = js.native
  
  // optional, for Google Play subscriptions
  var googleAccToken: js.UndefOr[String] = js.native
  
  // optional, for Google Play subscriptions
  var googleClientID: js.UndefOr[String] = js.native
  
  // optional, for Google Play subscriptions
  var googleClientSecret: js.UndefOr[String] = js.native
  
  /* Configurations for Google Play */
  // this is the path to the directory containing iap-sanbox/iap-live files
  var googlePublicKeyPath: js.UndefOr[String] = js.native
  
  // this is the google iap-live public key string
  var googlePublicKeyStrLive: js.UndefOr[String] = js.native
  
  // this is the google iap-sandbox public key string
  var googlePublicKeyStrSandBox: js.UndefOr[String] = js.native
  
  // optional, for Google Play subscritions
  var googleRefToken: js.UndefOr[String] = js.native
  
  // optional, for Google Play subscriptions
  var googleRefreshToken: js.UndefOr[String] = js.native
  
  // Configurations for Google Service Account validation: You can validate with just packageName, productId, and purchaseToken
  var googleServiceAccount: js.UndefOr[ClientEmail] = js.native
  
  /* Configurations for Roku */
  // this comes from Roku Developer Dashboard
  var rokuApiKey: js.UndefOr[String] = js.native
  
  var secret: js.UndefOr[String] = js.native
  
  /* Configurations all platforms */
  // For Apple and Googl Play to force Sandbox validation only
  var test: js.UndefOr[Boolean] = js.native
  
  // Output debug logs to stdout stream
  var verbose: js.UndefOr[Boolean] = js.native
}
object Config_ {
  
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmazonAPIVersion(value: Double): Self = this.set("amazonAPIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonAPIVersion: Self = this.set("amazonAPIVersion", js.undefined)
    
    @scala.inline
    def setAppleExcludeOldTransactions(value: Boolean): Self = this.set("appleExcludeOldTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppleExcludeOldTransactions: Self = this.set("appleExcludeOldTransactions", js.undefined)
    
    @scala.inline
    def setApplePassword(value: String): Self = this.set("applePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplePassword: Self = this.set("applePassword", js.undefined)
    
    @scala.inline
    def setFacebookAppId(value: String): Self = this.set("facebookAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebookAppId: Self = this.set("facebookAppId", js.undefined)
    
    @scala.inline
    def setFacebookAppSecret(value: String): Self = this.set("facebookAppSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebookAppSecret: Self = this.set("facebookAppSecret", js.undefined)
    
    @scala.inline
    def setGoogleAccToken(value: String): Self = this.set("googleAccToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAccToken: Self = this.set("googleAccToken", js.undefined)
    
    @scala.inline
    def setGoogleClientID(value: String): Self = this.set("googleClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleClientID: Self = this.set("googleClientID", js.undefined)
    
    @scala.inline
    def setGoogleClientSecret(value: String): Self = this.set("googleClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleClientSecret: Self = this.set("googleClientSecret", js.undefined)
    
    @scala.inline
    def setGooglePublicKeyPath(value: String): Self = this.set("googlePublicKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePublicKeyPath: Self = this.set("googlePublicKeyPath", js.undefined)
    
    @scala.inline
    def setGooglePublicKeyStrLive(value: String): Self = this.set("googlePublicKeyStrLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePublicKeyStrLive: Self = this.set("googlePublicKeyStrLive", js.undefined)
    
    @scala.inline
    def setGooglePublicKeyStrSandBox(value: String): Self = this.set("googlePublicKeyStrSandBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePublicKeyStrSandBox: Self = this.set("googlePublicKeyStrSandBox", js.undefined)
    
    @scala.inline
    def setGoogleRefToken(value: String): Self = this.set("googleRefToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleRefToken: Self = this.set("googleRefToken", js.undefined)
    
    @scala.inline
    def setGoogleRefreshToken(value: String): Self = this.set("googleRefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleRefreshToken: Self = this.set("googleRefreshToken", js.undefined)
    
    @scala.inline
    def setGoogleServiceAccount(value: ClientEmail): Self = this.set("googleServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleServiceAccount: Self = this.set("googleServiceAccount", js.undefined)
    
    @scala.inline
    def setRokuApiKey(value: String): Self = this.set("rokuApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRokuApiKey: Self = this.set("rokuApiKey", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
