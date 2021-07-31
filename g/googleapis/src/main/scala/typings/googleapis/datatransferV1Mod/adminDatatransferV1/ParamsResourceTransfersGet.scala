package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransfersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the resource to be retrieved. This is returned in the response from
    * the insert method.
    */
  var dataTransferId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTransfersGet {
  
  @scala.inline
  def apply(): ParamsResourceTransfersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTransfersGetMutableBuilder[Self <: ParamsResourceTransfersGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDataTransferId(value: String): Self = StObject.set(x, "dataTransferId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferIdUndefined: Self = StObject.set(x, "dataTransferId", js.undefined)
  }
}
