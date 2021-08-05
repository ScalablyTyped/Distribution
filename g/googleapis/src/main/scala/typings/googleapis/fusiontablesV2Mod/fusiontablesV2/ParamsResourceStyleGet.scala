package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStyleGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Identifier (integer) for a specific style in a table
    */
  var styleId: js.UndefOr[Double] = js.undefined
  
  /**
    * Table to which the requested style belongs
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceStyleGet {
  
  inline def apply(): ParamsResourceStyleGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStyleGet]
  }
  
  extension [Self <: ParamsResourceStyleGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setStyleId(value: Double): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
