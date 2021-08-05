package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oauthtoken
  extends StObject
     with KiiSocialConnectOptions {
  
  var oauth_token: String
  
  var oauth_token_secret: String
}
object Oauthtoken {
  
  inline def apply(oauth_token: String, oauth_token_secret: String): Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauthtoken]
  }
  
  extension [Self <: Oauthtoken](x: Self) {
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_token_secret(value: String): Self = StObject.set(x, "oauth_token_secret", value.asInstanceOf[js.Any])
  }
}
