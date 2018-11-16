package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GotOptions[E /* <: java.lang.String | scala.Null */]
  extends gotLib.gotMod.InternalRequestOptions {
  @JSName("agent")
  var agent_GotOptions: js.UndefOr[nodeLib.httpMod.Agent | scala.Boolean | AgentOptions] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var cache: js.UndefOr[Cache] = js.undefined
  var cookieJar: js.UndefOr[toughDashCookieLib.toughDashCookieMod.CookieJar] = js.undefined
  var decompress: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[E] = js.undefined
  var followRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var query: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var retry: js.UndefOr[scala.Double | RetryOptions] = js.undefined
  var throwHttpErrors: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("timeout")
  var timeout_GotOptions: js.UndefOr[scala.Double | TimeoutOptions] = js.undefined
  var useElectronNet: js.UndefOr[scala.Boolean] = js.undefined
}

