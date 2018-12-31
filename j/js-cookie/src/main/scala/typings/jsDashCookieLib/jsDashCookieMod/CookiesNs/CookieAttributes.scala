package typings
package jsDashCookieLib.jsDashCookieMod.CookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieAttributes extends js.Object {
  /**
    * Define the domain where the cookie is available. Defaults to
    * the domain of the page where the cookie was created.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define when the cookie will be removed. Value can be a Number
    * which will be interpreted as days from time of creation or a
    * Date instance. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
    * Define the path where the cookie is available. Defaults to '/'
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean indicating if the cookie transmission requires a
    * secure protocol (https). Defaults to false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

