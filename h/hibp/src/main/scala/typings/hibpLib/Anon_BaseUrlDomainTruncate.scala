package typings
package hibpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrlDomainTruncate extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var truncate: js.UndefOr[scala.Boolean] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BaseUrlDomainTruncate {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    domain: java.lang.String = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined,
    userAgent: java.lang.String = null
  ): Anon_BaseUrlDomainTruncate = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Anon_BaseUrlDomainTruncate]
  }
}

