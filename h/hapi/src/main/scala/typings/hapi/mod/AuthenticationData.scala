package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationData extends StObject {
  
  var artifacts: js.UndefOr[js.Object] = js.undefined
  
  var credentials: AuthCredentials
}
object AuthenticationData {
  
  @scala.inline
  def apply(credentials: AuthCredentials): AuthenticationData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  
  @scala.inline
  implicit class AuthenticationDataMutableBuilder[Self <: AuthenticationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Object): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
