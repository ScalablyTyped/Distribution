package typings.googleapis.slidesV1Mod.slidesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePresentationsPagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The object ID of the page to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePresentationsPagesGet {
  
  @scala.inline
  def apply(): ParamsResourcePresentationsPagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePresentationsPagesGetMutableBuilder[Self <: ParamsResourcePresentationsPagesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    @scala.inline
    def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
  }
}
