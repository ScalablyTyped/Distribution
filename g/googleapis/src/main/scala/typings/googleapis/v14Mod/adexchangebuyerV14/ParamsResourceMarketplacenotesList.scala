package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplacenotesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Query string to retrieve specific notes. To search the text contents of
    * notes, please use syntax like "WHERE note.note = "foo" or "WHERE
    * note.note LIKE "%bar%"
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The proposalId to get notes for. To search across all proposals specify
    * order_id = '-' as part of the URL.
    */
  var proposalId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMarketplacenotesList {
  
  inline def apply(): ParamsResourceMarketplacenotesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesList]
  }
  
  extension [Self <: ParamsResourceMarketplacenotesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
