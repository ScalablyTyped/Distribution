package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersFiltersetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Full name of the resource being requested. For example:  - For a
    * bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  -
    * For an account-level filter set for the buyer account representing bidder
    * 123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level
    * filter set for the child seat buyer account 456   whose bidder is 123:
    * `bidders/123/accounts/456/filterSets/abc`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersFiltersetsGet {
  
  @scala.inline
  def apply(): ParamsResourceBiddersFiltersetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersFiltersetsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceBiddersFiltersetsGetMutableBuilder[Self <: ParamsResourceBiddersFiltersetsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
