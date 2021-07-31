package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTypeprovidersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type provider for this request.
    */
  var typeProvider: js.UndefOr[String] = js.undefined
}
object ParamsResourceTypeprovidersDelete {
  
  @scala.inline
  def apply(): ParamsResourceTypeprovidersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTypeprovidersDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceTypeprovidersDeleteMutableBuilder[Self <: ParamsResourceTypeprovidersDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setTypeProvider(value: String): Self = StObject.set(x, "typeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeProviderUndefined: Self = StObject.set(x, "typeProvider", js.undefined)
  }
}
