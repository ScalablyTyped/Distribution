package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationData extends StObject {
  
  var artifacts: js.UndefOr[AuthArtifacts] = js.undefined
  
  var credentials: AuthCredentials
}
object AuthenticationData {
  
  inline def apply(credentials: AuthCredentials): AuthenticationData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  
  extension [Self <: AuthenticationData](x: Self) {
    
    inline def setArtifacts(value: AuthArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
