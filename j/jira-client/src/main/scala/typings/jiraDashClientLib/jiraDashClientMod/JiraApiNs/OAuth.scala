package typings
package jiraDashClientLib.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth extends js.Object {
  var access_token: java.lang.String
  var access_token_secret: java.lang.String
  var consumer_key: java.lang.String
  var consumer_secret: java.lang.String
  var signature_method: js.UndefOr[java.lang.String] = js.undefined
}

object OAuth {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    access_token_secret: java.lang.String,
    consumer_key: java.lang.String,
    consumer_secret: java.lang.String,
    signature_method: java.lang.String = null
  ): OAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("access_token_secret")(access_token_secret)
    __obj.updateDynamic("consumer_key")(consumer_key)
    __obj.updateDynamic("consumer_secret")(consumer_secret)
    if (signature_method != null) __obj.updateDynamic("signature_method")(signature_method)
    __obj.asInstanceOf[OAuth]
  }
}

