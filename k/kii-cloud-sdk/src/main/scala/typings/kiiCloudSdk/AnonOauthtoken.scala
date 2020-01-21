package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOauthtoken extends KiiSocialConnectOptions {
  var oauth_token: String
  var oauth_token_secret: String
}

object AnonOauthtoken {
  @scala.inline
  def apply(oauth_token: String, oauth_token_secret: String): AnonOauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOauthtoken]
  }
}

