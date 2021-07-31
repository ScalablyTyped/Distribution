package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTableCopy
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether to also copy tabs, styles, and templates. Default is false.
    */
  var copyPresentation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of the table that is being copied.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTableCopy {
  
  @scala.inline
  def apply(): ParamsResourceTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableCopy]
  }
  
  @scala.inline
  implicit class ParamsResourceTableCopyMutableBuilder[Self <: ParamsResourceTableCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCopyPresentation(value: Boolean): Self = StObject.set(x, "copyPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPresentationUndefined: Self = StObject.set(x, "copyPresentation", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
