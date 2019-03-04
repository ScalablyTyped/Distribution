package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAuth extends js.Object {
  /** an artifact object received from the authentication strategy and used in authentication-related actions. */
  var artifacts: js.Object
  /** the credential object received during the authentication process. The presence of an object does not mean successful authentication. */
  var credentials: AuthCredentials
  /** the authentication error is failed and mode set to 'try'. */
  var error: nodeLib.Error
  /** true if the request has been successfully authenticated, otherwise false. */
  var isAuthenticated: scala.Boolean
  /**
    * true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed authorization,
    * set to false.
    */
  var isAuthorized: scala.Boolean
  /** the route authentication mode. */
  var mode: java.lang.String
  /** the name of the strategy used. */
  var strategy: java.lang.String
}

object RequestAuth {
  @scala.inline
  def apply(
    artifacts: js.Object,
    credentials: AuthCredentials,
    error: nodeLib.Error,
    isAuthenticated: scala.Boolean,
    isAuthorized: scala.Boolean,
    mode: java.lang.String,
    strategy: java.lang.String
  ): RequestAuth = {
    val __obj = js.Dynamic.literal(artifacts = artifacts, credentials = credentials, error = error, isAuthenticated = isAuthenticated, isAuthorized = isAuthorized, mode = mode, strategy = strategy)
  
    __obj.asInstanceOf[RequestAuth]
  }
}

