package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationData[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] extends StObject {
  
  var artifacts: js.UndefOr[ArtifactsExtra] = js.undefined
  
  var credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]
}
object AuthenticationData {
  
  inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]): AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]]
  }
  
  extension [Self <: AuthenticationData[?, ?, ?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](x: Self & (AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra])) {
    
    inline def setArtifacts(value: ArtifactsExtra): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setCredentials(value: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
