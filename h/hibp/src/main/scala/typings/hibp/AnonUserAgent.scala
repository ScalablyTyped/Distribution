package typings.hibp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserAgent extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object AnonUserAgent {
  @scala.inline
  def apply(apiKey: String = null, baseUrl: String = null, userAgent: String = null): AnonUserAgent = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserAgent]
  }
}

