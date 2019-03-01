package typings
package jqueryDotCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCookieOptions extends js.Object {
  /**
    * Define the domain where the cookie is valid. Default: domain of page where the cookie was created.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define lifetime of the cookie. Value can be a Number which will be interpreted as days from time of creation or a Date object. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[js.Any] = js.undefined
  /**
    * Define the path where the cookie is valid. By default the path of the cookie is the path of the page where the cookie was created (standard browser behavior). If you want to make it available for instance across the entire domain use path: '/'. Default: path of page where the cookie was created.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the cookie transmission requires a secure protocol (https). Default: false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object JQueryCookieOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: js.Any = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): JQueryCookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[JQueryCookieOptions]
  }
}

