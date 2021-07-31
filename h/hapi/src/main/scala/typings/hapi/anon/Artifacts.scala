package typings.hapi.anon

import typings.hapi.mod.AuthCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  /**
    * The artifacts are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The credentials are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme.
    */
  var credentials: AuthCredentials
  
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: String
}
object Artifacts {
  
  @scala.inline
  def apply(credentials: AuthCredentials, strategy: String): Artifacts = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  
  @scala.inline
  implicit class ArtifactsMutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Object): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
