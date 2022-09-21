package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAuth extends StObject {
  
  /** an artifact object received from the authentication strategy and used in authentication-related actions. */
  var artifacts: AuthArtifacts
  
  /** the credential object received during the authentication process. The presence of an object does not mean successful authentication. */
  var credentials: AuthCredentials
  
  /** the authentication error is failed and mode set to 'try'. */
  var error: js.Error
  
  /** true if the request has been successfully authenticated, otherwise false. */
  var isAuthenticated: Boolean
  
  /**
    * true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed authorization,
    * set to false.
    */
  var isAuthorized: Boolean
  
  /** the route authentication mode. */
  var mode: AuthMode
  
  /** the name of the strategy used. */
  var strategy: String
}
object RequestAuth {
  
  inline def apply(
    artifacts: AuthArtifacts,
    credentials: AuthCredentials,
    error: js.Error,
    isAuthenticated: Boolean,
    isAuthorized: Boolean,
    mode: AuthMode,
    strategy: String
  ): RequestAuth = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthorized = isAuthorized.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuth]
  }
  
  extension [Self <: RequestAuth](x: Self) {
    
    inline def setArtifacts(value: AuthArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setIsAuthorized(value: Boolean): Self = StObject.set(x, "isAuthorized", value.asInstanceOf[js.Any])
    
    inline def setMode(value: AuthMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
