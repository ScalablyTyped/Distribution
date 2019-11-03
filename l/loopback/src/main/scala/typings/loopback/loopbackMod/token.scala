package typings.loopback.loopbackMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.loopback.Anon_Cookies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "token")
@js.native
object token extends js.Object {
  /**
    * Check for an access token in cookies, headers, and query string parameters.
    * This function always checks for the following
    * - `access_token` (params only)
    * - `X-Access-Token` (headers only)
    * - `authorization` (headers and cookies
    *
    * It checks for these values in cookies, headers, and query string parameters _in addition_ to the items
    * specified in the options parameter
    * **NOTE:** This function only checks for [signed cookies](expressjs.com/api.html#req.signedCookies)
    * The following example illustrates how to check for an `accessToken` in a custom cookie, query string parameter
    * and header called `foo-auth`
    * ```js
    * app.use(loopback.token({
    *   cookies: ['foo-auth'],
    *   headers: ['foo-auth', 'X-Foo-Auth'],
    *   params: ['foo-auth', 'foo_auth']
    * }));
    * ```
    *
    * @options {any} [options] Each option Array is used to add additional keys to find an `accessToken` for a `request`.
    * @property {Array} [cookies] Array of cookie names.
    * @property {Array} [headers] Array of header names.
    * @property {Array} [params] Array of param names.
    * @property {boolean} [searchDefaultTokenKeys] Use the default search locations for Token in request
    * @property {boolean} [enableDoublecheck] Execute middleware although an instance mounted earlier in the chain didn't find a token
    * @property {boolean} [overwriteExistingToken] only has effect in combination with `enableDoublecheck`. If truthy, will allow to overwrite an existing accessToken.
    * @property {() => void|string} [model] AccessToken model name or class to use.
    * @property {string} [currentUserLiteral] string literal for the current user.
    * @header loopback.token([options])
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Anon_Cookies): RequestHandler[ParamsDictionary] = js.native
}

