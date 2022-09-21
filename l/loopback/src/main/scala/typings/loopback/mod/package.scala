package typings.loopback.mod

import typings.express.mod.RequestHandler
import typings.loopback.anon.Cookies
import typings.loopback.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): LoopBackApplication = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LoopBackApplication]

// END OF PERSISTED MODEL
/**
  * Serve the LoopBack favicon.
  * @header loopback.favicon(
  */
inline def favicon(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("favicon")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

/**
  * Expose models over REST
  * For example:
  * ```js
  * app.use(loopback.rest());
  * ```
  * For more information, see [Exposing models over a REST API](docs.strongloop.com/display/DOC/Exposing+models+over+a+REST+API).
  * @header loopback.rest(
  */
inline def rest(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rest")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

/**
  * Rewrite the url to replace current user literal with the logged in user id
  */
inline def rewriteUserLiteral(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriteUserLiteral")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

/**
  * Serve static assets of a LoopBack application
  * @param {string} root The root directory from which the static assets are to
  * be served.
  * @param {any} options Refer to
  *   [express documentation](expressjs.com/4x/api.html#express.static)
  *   for the full list of available options.
  * @header loopback.static(root, [options])
  */
inline def static(root: String): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]
inline def static(root: String, options: Any): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("static")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

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
inline def status(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

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
inline def token(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("token")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]
inline def token(options: Cookies): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

/**
  * Convert any request not handled so far to a 404 error
  * to be handled by error-handling middleware.
  * @header loopback.urlNotFound(
  */
inline def urlNotFound(): RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlNotFound")().asInstanceOf[RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]]

type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ js.Error | Null, /* arg0 */ T, /* arg1 */ G, Any]

type CallbackWithResult[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Any]

/**
  * General type for a callback to an async function.
  */
type CallbackWithoutResult = js.Function1[/* err */ js.Error | Null, Any]
