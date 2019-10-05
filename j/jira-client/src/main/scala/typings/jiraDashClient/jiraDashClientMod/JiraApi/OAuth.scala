package typings.jiraDashClient.jiraDashClientMod.JiraApi

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
    val __obj = js.Dynamic.literal(access_token = access_token, access_token_secret = access_token_secret, consumer_key = consumer_key, consumer_secret = consumer_secret)
    if (signature_method != null) __obj.updateDynamic("signature_method")(signature_method)
    __obj.asInstanceOf[OAuth]
  }
}

