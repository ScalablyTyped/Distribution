package typings.hapi.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAuth extends StObject {
  
  /** an artifact object received from the authentication strategy and used in authentication-related actions. */
  var artifacts: js.Object
  
  /** the credential object received during the authentication process. The presence of an object does not mean successful authentication. */
  var credentials: AuthCredentials
  
  /** the authentication error is failed and mode set to 'try'. */
  var error: Error
  
  /** true if the request has been successfully authenticated, otherwise false. */
  var isAuthenticated: Boolean
  
  /**
    * true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed authorization,
    * set to false.
    */
  var isAuthorized: Boolean
  
  /** the route authentication mode. */
  var mode: String
  
  /** the name of the strategy used. */
  var strategy: String
}
object RequestAuth {
  
  @scala.inline
  def apply(
    artifacts: js.Object,
    credentials: AuthCredentials,
    error: Error,
    isAuthenticated: Boolean,
    isAuthorized: Boolean,
    mode: String,
    strategy: String
  ): RequestAuth = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthorized = isAuthorized.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuth]
  }
  
  @scala.inline
  implicit class RequestAuthMutableBuilder[Self <: RequestAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Object): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthorized(value: Boolean): Self = StObject.set(x, "isAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
