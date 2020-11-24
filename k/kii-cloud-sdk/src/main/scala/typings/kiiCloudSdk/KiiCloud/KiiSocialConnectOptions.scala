package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.kiiCloudSdk.anon.Accesstoken
  - typings.kiiCloudSdk.anon.Oauthtoken
*/
trait KiiSocialConnectOptions extends js.Object
object KiiSocialConnectOptions {
  
  @scala.inline
  def Accesstoken(access_token: String): KiiSocialConnectOptions = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiSocialConnectOptions]
  }
  
  @scala.inline
  def Oauthtoken(oauth_token: String, oauth_token_secret: String): KiiSocialConnectOptions = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiSocialConnectOptions]
  }
}
