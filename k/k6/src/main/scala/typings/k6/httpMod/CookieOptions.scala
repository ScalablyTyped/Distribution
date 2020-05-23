package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  /** Domain allowed to receive. */
  var domain: js.UndefOr[String] = js.undefined
  /** Expiry time in RFC1123 format. */
  var expires: js.UndefOr[String] = js.undefined
  /** HTTP only. */
  var http_only: js.UndefOr[Boolean] = js.undefined
  /** Seconds until expiration. */
  var max_age: js.UndefOr[Double] = js.undefined
  /** Scope path. */
  var path: js.UndefOr[String] = js.undefined
  /** Secure. */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    expires: String = null,
    http_only: js.UndefOr[Boolean] = js.undefined,
    max_age: js.UndefOr[Double] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(http_only)) __obj.updateDynamic("http_only")(http_only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_age)) __obj.updateDynamic("max_age")(max_age.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOptions]
  }
}

