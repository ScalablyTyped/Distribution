package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceStyleDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifier (within a table) for the style being deleted
    */
  var styleId: js.UndefOr[Double] = js.native
  
  /**
    * Table from which the style is being deleted
    */
  var tableId: js.UndefOr[String] = js.native
}
object ParamsResourceStyleDelete {
  
  @scala.inline
  def apply(): ParamsResourceStyleDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStyleDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceStyleDeleteMutableBuilder[Self <: ParamsResourceStyleDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setStyleId(value: Double): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
