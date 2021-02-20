package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Oauthtoken extends KiiSocialConnectOptions {
  
  var oauth_token: String = js.native
  
  var oauth_token_secret: String = js.native
}
object Oauthtoken {
  
  @scala.inline
  def apply(oauth_token: String, oauth_token_secret: String): Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauthtoken]
  }
  
  @scala.inline
  implicit class OauthtokenMutableBuilder[Self <: Oauthtoken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_token_secret(value: String): Self = StObject.set(x, "oauth_token_secret", value.asInstanceOf[js.Any])
  }
}
