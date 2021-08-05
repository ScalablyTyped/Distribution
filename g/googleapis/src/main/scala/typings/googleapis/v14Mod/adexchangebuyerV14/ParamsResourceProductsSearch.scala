package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The pql query used to query for products.
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsSearch {
  
  inline def apply(): ParamsResourceProductsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsSearch]
  }
  
  extension [Self <: ParamsResourceProductsSearch](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
  }
}
