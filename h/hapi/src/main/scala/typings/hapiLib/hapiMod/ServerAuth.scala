package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  /**
       * An object where each key is an authentication strategy name and the value is the exposed strategy API.
       * Available only when the authentication scheme exposes an API by returning an api key in the object
       * returned from its implementation function.
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthapi)
       */
  var api: hapiLib.hapiMod.UtilNs.Dictionary[ServerAuthSchemeObjectApi] = js.native
  /**
       * Contains the default authentication configuration is a default strategy was set via
       * [server.auth.default()](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.default()).
       */
  val settings: hapiLib.Anon_Default = js.native
  /**
       * Sets a default strategy which is applied to every route where:
       * @param options - one of:
       * * a string with the default strategy name
       * * an authentication configuration object using the same format as the route auth handler options.
       * @return void.
       * The default does not apply when a route config specifies auth as false, or has an authentication strategy
       * configured (contains the strategy or strategies authentication settings). Otherwise, the route authentication
       * config is applied to the defaults.
       * Note that if the route has authentication configured, the default only applies at the time of adding the route,
       * not at runtime. This means that calling server.auth.default() after adding a route with some authentication
       * config will have no impact on the routes added prior. However, the default will apply to routes added
       * before server.auth.default() is called if those routes lack any authentication config.
       * The default auth strategy configuration can be accessed via server.auth.settings.default. To obtain the active
       * authentication configuration of a route, use server.auth.lookup(request.route).
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthdefaultoptions)
       */
  def default(options: ServerAuthConfig): scala.Unit = js.native
  /**
       * Sets a default strategy which is applied to every route where:
       * @param options - one of:
       * * a string with the default strategy name
       * * an authentication configuration object using the same format as the route auth handler options.
       * @return void.
       * The default does not apply when a route config specifies auth as false, or has an authentication strategy
       * configured (contains the strategy or strategies authentication settings). Otherwise, the route authentication
       * config is applied to the defaults.
       * Note that if the route has authentication configured, the default only applies at the time of adding the route,
       * not at runtime. This means that calling server.auth.default() after adding a route with some authentication
       * config will have no impact on the routes added prior. However, the default will apply to routes added
       * before server.auth.default() is called if those routes lack any authentication config.
       * The default auth strategy configuration can be accessed via server.auth.settings.default. To obtain the active
       * authentication configuration of a route, use server.auth.lookup(request.route).
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthdefaultoptions)
       */
  def default(options: java.lang.String): scala.Unit = js.native
  /**
       * Registers an authentication scheme where:
       * @param name the scheme name.
       * @param scheme - the method implementing the scheme with signature function(server, options) where:
       * * server - a reference to the server object the scheme is added to.
       * * options - (optional) the scheme options argument passed to server.auth.strategy() when instantiation a strategy.
       * @return void.
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthschemename-scheme)
       */
  def scheme(name: java.lang.String, scheme: ServerAuthScheme): scala.Unit = js.native
  /**
       * Registers an authentication strategy where:
       * @param name - the strategy name.
       * @param scheme - the scheme name (must be previously registered using server.auth.scheme()).
       * @param options - scheme options based on the scheme requirements.
       * @return Return value: none.
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthstrategyname-scheme-options)
       */
  def strategy(name: java.lang.String, scheme: java.lang.String): scala.Unit = js.native
  /**
       * Registers an authentication strategy where:
       * @param name - the strategy name.
       * @param scheme - the scheme name (must be previously registered using server.auth.scheme()).
       * @param options - scheme options based on the scheme requirements.
       * @return Return value: none.
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthstrategyname-scheme-options)
       */
  def strategy(name: java.lang.String, scheme: java.lang.String, options: js.Object): scala.Unit = js.native
  /**
       * Tests a request against an authentication strategy where:
       * @param strategy - the strategy name registered with server.auth.strategy().
       * @param request - the request object.
       * @return Return value: the authentication credentials object if authentication was successful, otherwise throws an error.
       * Note that the test() method does not take into account the route authentication configuration. It also does not
       * perform payload authentication. It is limited to the basic strategy authentication execution. It does not
       * include verifying scope, entity, or other route properties.
       * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-await-serverauthteststrategy-request)
       */
  def test(strategy: java.lang.String, request: Request): js.Promise[AuthCredentials] = js.native
  /**
       * Verify a request's authentication credentials against an authentication strategy.
       * Returns nothing if verification was successful, otherwise throws an error.
       *
       * Note that the `verify()` method does not take into account the route authentication configuration
       * or any other information from the request other than the `request.auth` object. It also does not
       * perform payload authentication. It is limited to verifying that the previously valid credentials
       * are still valid (e.g. have not been revoked or expired). It does not include verifying scope,
       * entity, or other route properties.
       */
  def verify(request: Request): js.Promise[scala.Unit] = js.native
}

