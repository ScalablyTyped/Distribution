package typings.jqueryCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCookieOptions extends js.Object {
  /**
    * Define the domain where the cookie is valid. Default: domain of page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Define lifetime of the cookie. Value can be a Number which will be interpreted as days from time of creation or a Date object. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[js.Any] = js.undefined
  /**
    * Define the path where the cookie is valid. By default the path of the cookie is the path of the page where the cookie was created (standard browser behavior). If you want to make it available for instance across the entire domain use path: '/'. Default: path of page where the cookie was created.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * If true, the cookie transmission requires a secure protocol (https). Default: false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object JQueryCookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    expires: js.Any = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): JQueryCookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCookieOptions]
  }
}

