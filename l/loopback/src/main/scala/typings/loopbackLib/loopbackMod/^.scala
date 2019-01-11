package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): loopbackLib.loopbackMod.lNs.LoopBackApplication = js.native
  // END OF PERSISTED MODEL
  /**
    * Serve the LoopBack favicon.
    * @header loopback.favicon(
    */
  def favicon(): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Expose models over REST
    * For example:
    * ```js
    * app.use(loopback.rest());
    * ```
    * For more information, see [Exposing models over a REST API](docs.strongloop.com/display/DOC/Exposing+models+over+a+REST+API).
    * @header loopback.rest(
    */
  def rest(): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Rewrite the url to replace current user literal with the logged in user id
    */
  def rewriteUserLiteral(): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Serve static assets of a LoopBack application
    * @param {string} root The root directory from which the static assets are to
    * be served.
    * @param {any} options Refer to
    *   [express documentation](expressjs.com/4x/api.html#express.static)
    *   for the full list of available options.
    * @header loopback.static(root, [options])
    */
  def static(root: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def static(root: java.lang.String, options: js.Any): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Return HTTP response with basic application status information:
    * date the application was started and uptime, in JSON format. For example:
    * ```
    * {
    *    "started": "2014-06-05T00:26:49.750Z",
    *    "uptime": 9.394
    * }
    * ```
    */
  def status(): expressLib.expressMod.eNs.RequestHandler = js.native
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
  def token(): expressLib.expressMod.eNs.RequestHandler = js.native
  def token(options: loopbackLib.Anon_Cookies): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * Convert any request not handled so far to a 404 error
    * to be handled by error-handling middleware.
    * @header loopback.urlNotFound(
    */
  def urlNotFound(): expressLib.expressMod.eNs.RequestHandler = js.native
}

