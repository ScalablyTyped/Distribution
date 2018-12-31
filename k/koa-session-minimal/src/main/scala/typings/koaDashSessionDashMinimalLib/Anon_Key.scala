package typings
package koaDashSessionDashMinimalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /**
    * cookie options
    */
  var cookie: js.UndefOr[cookiesLib.cookiesMod.CookiesNs.IOptions | Anon_Ctx] = js.undefined
  /**
    * session cookie name and store key prefix. Default is 'koa:sess'
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * session store
    */
  var store: js.UndefOr[js.Any] = js.undefined
}

