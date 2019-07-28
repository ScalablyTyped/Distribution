package typings.hibp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrlDomainTruncate extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Anon_BaseUrlDomainTruncate {
  @scala.inline
  def apply(
    baseUrl: String = null,
    domain: String = null,
    truncate: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): Anon_BaseUrlDomainTruncate = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Anon_BaseUrlDomainTruncate]
  }
}

