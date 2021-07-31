package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTemplatePatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTemplate] = js.undefined
  
  /**
    * Table to which the updated template belongs
    */
  var tableId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the template that is being updated
    */
  var templateId: js.UndefOr[Double] = js.undefined
}
object ParamsResourceTemplatePatch {
  
  @scala.inline
  def apply(): ParamsResourceTemplatePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTemplatePatch]
  }
  
  @scala.inline
  implicit class ParamsResourceTemplatePatchMutableBuilder[Self <: ParamsResourceTemplatePatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaTemplate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
