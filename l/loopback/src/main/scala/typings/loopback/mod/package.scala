package typings.loopback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typings.loopback.mod.LoopBackApplication = typings.loopback.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.loopback.mod.LoopBackApplication]
  
  type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ typings.std.Error | scala.Null, /* arg0 */ T, /* arg1 */ G, js.Any]
  
  type CallbackWithResult[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ T, js.Any]
  
  /**
    * General type for a callback to an async function.
    */
  type CallbackWithoutResult = js.Function1[/* err */ typings.std.Error | scala.Null, js.Any]
  
  // END OF PERSISTED MODEL
  /**
    * Serve the LoopBack favicon.
    * @header loopback.favicon(
    */
  @scala.inline
  def favicon(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("favicon")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
  /**
    * Expose models over REST
    * For example:
    * ```js
    * app.use(loopback.rest());
    * ```
    * For more information, see [Exposing models over a REST API](docs.strongloop.com/display/DOC/Exposing+models+over+a+REST+API).
    * @header loopback.rest(
    */
  @scala.inline
  def rest(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rest")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
  /**
    * Rewrite the url to replace current user literal with the logged in user id
    */
  @scala.inline
  def rewriteUserLiteral(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteUserLiteral")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
  /**
    * Serve static assets of a LoopBack application
    * @param {string} root The root directory from which the static assets are to
    * be served.
    * @param {any} options Refer to
    *   [express documentation](expressjs.com/4x/api.html#express.static)
    *   for the full list of available options.
    * @header loopback.static(root, [options])
    */
  @scala.inline
  def static(root: java.lang.String): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  @scala.inline
  def static(root: java.lang.String, options: js.Any): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = (typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
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
  @scala.inline
  def status(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
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
  @scala.inline
  def token(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("token")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  @scala.inline
  def token(options: typings.loopback.anon.Cookies): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("token")(options.asInstanceOf[js.Any]).asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
  
  /**
    * Convert any request not handled so far to a 404 error
    * to be handled by error-handling middleware.
    * @header loopback.urlNotFound(
    */
  @scala.inline
  def urlNotFound(): typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ] = typings.loopback.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlNotFound")().asInstanceOf[typings.express.mod.RequestHandler[
    typings.expressServeStaticCore.mod.ParamsDictionary, 
    _, 
    _, 
    typings.expressServeStaticCore.mod.Query
  ]]
}
