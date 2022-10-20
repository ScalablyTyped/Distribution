package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] extends StObject {
  
  val data: js.UndefOr[AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]] = js.undefined
  
  val error: js.UndefOr[js.Error | Null] = js.undefined
  
  val isAuth: `true`
}
object Auth {
  
  inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](): Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = {
    val __obj = js.Dynamic.literal(isAuth = true)
    __obj.asInstanceOf[Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]]
  }
  
  extension [Self <: Auth[?, ?, ?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](x: Self & (Auth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra])) {
    
    inline def setData(value: AuthenticationData[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsAuth(value: `true`): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
  }
}
