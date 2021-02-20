package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRelyingpartyGetprojectconfig extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Delegated GCP project number of the request.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * GCP project number of the request.
    */
  var projectNumber: js.UndefOr[String] = js.native
}
object ParamsResourceRelyingpartyGetprojectconfig {
  
  @scala.inline
  def apply(): ParamsResourceRelyingpartyGetprojectconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyGetprojectconfig]
  }
  
  @scala.inline
  implicit class ParamsResourceRelyingpartyGetprojectconfigMutableBuilder[Self <: ParamsResourceRelyingpartyGetprojectconfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
  }
}
