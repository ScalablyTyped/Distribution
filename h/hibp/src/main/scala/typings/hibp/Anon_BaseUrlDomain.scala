package typings.hibp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrlDomain extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var includeUnverified: js.UndefOr[Boolean] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Anon_BaseUrlDomain {
  @scala.inline
  def apply(
    baseUrl: String = null,
    domain: String = null,
    includeUnverified: js.UndefOr[Boolean] = js.undefined,
    truncate: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): Anon_BaseUrlDomain = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(includeUnverified)) __obj.updateDynamic("includeUnverified")(includeUnverified)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Anon_BaseUrlDomain]
  }
}

