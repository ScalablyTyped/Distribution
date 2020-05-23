package typings.hibp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var includeUnverified: js.UndefOr[Boolean] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object ApiKey {
  @scala.inline
  def apply(
    apiKey: String = null,
    baseUrl: String = null,
    domain: String = null,
    includeUnverified: js.UndefOr[Boolean] = js.undefined,
    truncate: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnverified)) __obj.updateDynamic("includeUnverified")(includeUnverified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

