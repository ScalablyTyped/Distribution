package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oauthtoken extends KiiSocialConnectOptions {
  var oauth_token: String
  var oauth_token_secret: String
}

object Anon_Oauthtoken {
  @scala.inline
  def apply(oauth_token: String, oauth_token_secret: String): Anon_Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Oauthtoken]
  }
}

