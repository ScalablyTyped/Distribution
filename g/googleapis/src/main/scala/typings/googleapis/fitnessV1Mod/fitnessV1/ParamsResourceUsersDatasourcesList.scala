package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersDatasourcesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The names of data types to include in the list. If not specified, all
    * data sources will be returned.
    */
  var dataTypeName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List data sources for the person identified. Use me to indicate the
    * authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersDatasourcesList {
  
  inline def apply(): ParamsResourceUsersDatasourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDatasourcesList]
  }
  
  extension [Self <: ParamsResourceUsersDatasourcesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDataTypeName(value: js.Array[String]): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
    
    inline def setDataTypeNameVarargs(value: String*): Self = StObject.set(x, "dataTypeName", js.Array(value :_*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
