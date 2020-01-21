package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.kiiCloudSdk.AnonAccesstoken
  - typings.kiiCloudSdk.AnonOauthtoken
*/
trait KiiSocialConnectOptions extends js.Object

object KiiSocialConnectOptions {
  @scala.inline
  def AnonAccesstoken(access_token: String, openID: String = null): KiiSocialConnectOptions = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    if (openID != null) __obj.updateDynamic("openID")(openID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiSocialConnectOptions]
  }
  @scala.inline
  def AnonOauthtoken(oauth_token: String, oauth_token_secret: String): KiiSocialConnectOptions = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KiiSocialConnectOptions]
  }
}

