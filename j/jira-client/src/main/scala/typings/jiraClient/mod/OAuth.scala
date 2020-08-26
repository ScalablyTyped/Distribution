package typings.jiraClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth extends js.Object {
  var access_token: String = js.native
  var access_token_secret: String = js.native
  var consumer_key: String = js.native
  var consumer_secret: String = js.native
  var signature_method: js.UndefOr[String] = js.native
}

object OAuth {
  @scala.inline
  def apply(access_token: String, access_token_secret: String, consumer_key: String, consumer_secret: String): OAuth = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth]
  }
  @scala.inline
  implicit class OAuthOps[Self <: OAuth] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccess_token_secret(value: String): Self = this.set("access_token_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumer_key(value: String): Self = this.set("consumer_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumer_secret(value: String): Self = this.set("consumer_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature_method(value: String): Self = this.set("signature_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature_method: Self = this.set("signature_method", js.undefined)
  }
  
}

