package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class OauthtokenOps[Self <: Oauthtoken] (val x: Self) extends AnyVal {
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
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setOauth_token_secret(value: String): Self = this.set("oauth_token_secret", value.asInstanceOf[js.Any])
  }
  
}

