package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTableUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether the view definition is also updated. The specified view
    * definition replaces the existing one. Only a view can be updated with a
    * new definition.
    */
  var replaceViewDefinition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTable] = js.undefined
  
  /**
    * ID of the table that is being updated.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTableUpdate {
  
  inline def apply(): ParamsResourceTableUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableUpdate]
  }
  
  extension [Self <: ParamsResourceTableUpdate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setReplaceViewDefinition(value: Boolean): Self = StObject.set(x, "replaceViewDefinition", value.asInstanceOf[js.Any])
    
    inline def setReplaceViewDefinitionUndefined: Self = StObject.set(x, "replaceViewDefinition", js.undefined)
    
    inline def setRequestBody(value: SchemaTable): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
