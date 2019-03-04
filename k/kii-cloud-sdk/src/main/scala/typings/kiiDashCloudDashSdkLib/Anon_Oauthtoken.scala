package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oauthtoken
  extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialConnectOptions {
  var oauth_token: java.lang.String
  var oauth_token_secret: java.lang.String
}

object Anon_Oauthtoken {
  @scala.inline
  def apply(oauth_token: java.lang.String, oauth_token_secret: java.lang.String): Anon_Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token, oauth_token_secret = oauth_token_secret)
  
    __obj.asInstanceOf[Anon_Oauthtoken]
  }
}

