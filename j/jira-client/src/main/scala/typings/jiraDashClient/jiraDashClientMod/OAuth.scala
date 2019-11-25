package typings.jiraDashClient.jiraDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth extends js.Object {
  var access_token: String
  var access_token_secret: String
  var consumer_key: String
  var consumer_secret: String
  var signature_method: js.UndefOr[String] = js.undefined
}

object OAuth {
  @scala.inline
  def apply(
    access_token: String,
    access_token_secret: String,
    consumer_key: String,
    consumer_secret: String,
    signature_method: String = null
  ): OAuth = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    if (signature_method != null) __obj.updateDynamic("signature_method")(signature_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth]
  }
}

