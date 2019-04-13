package typings
package koaDashSessionDashMinimalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  /**
    * cookie options
    */
  var cookie: js.UndefOr[cookiesLib.cookiesMod.IOptions | Anon_Ctx] = js.undefined
  /**
    * session cookie name and store key prefix. Default is 'koa:sess'
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * session store
    */
  var store: js.UndefOr[js.Any] = js.undefined
}

object Anon_Cookie {
  @scala.inline
  def apply(
    cookie: cookiesLib.cookiesMod.IOptions | Anon_Ctx = null,
    key: java.lang.String = null,
    store: js.Any = null
  ): Anon_Cookie = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[Anon_Cookie]
  }
}

