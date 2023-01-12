package typings.hapiHapi.anon

import typings.hapiHapi.mod.AppCredentials
import typings.hapiHapi.mod.AuthArtifacts
import typings.hapiHapi.mod.AuthCredentials
import typings.hapiHapi.mod.UserCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  /**
    * The artifacts are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[AuthArtifacts] = js.undefined
  
  /**
    * The credentials are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme.
    */
  var credentials: AuthCredentials[UserCredentials, AppCredentials]
  
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: String
}
object Artifacts {
  
  inline def apply(credentials: AuthCredentials[UserCredentials, AppCredentials], strategy: String): Artifacts = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
    
    inline def setArtifacts(value: AuthArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setCredentials(value: AuthCredentials[UserCredentials, AppCredentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
