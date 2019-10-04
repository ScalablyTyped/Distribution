package typings.hibp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyBaseUrl extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Anon_ApiKeyBaseUrl {
  @scala.inline
  def apply(apiKey: String = null, baseUrl: String = null, userAgent: String = null): Anon_ApiKeyBaseUrl = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Anon_ApiKeyBaseUrl]
  }
}

