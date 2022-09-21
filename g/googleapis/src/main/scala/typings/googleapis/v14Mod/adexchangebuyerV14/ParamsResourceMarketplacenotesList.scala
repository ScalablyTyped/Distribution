package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplacenotesList
  extends StObject
     with StandardParameters {
  
  /**
    * Query string to retrieve specific notes. To search the text contents of notes, please use syntax like "WHERE note.note = "foo" or "WHERE note.note LIKE "%bar%"
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The proposalId to get notes for. To search across all proposals specify order_id = '-' as part of the URL.
    */
  var proposalId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMarketplacenotesList {
  
  inline def apply(): ParamsResourceMarketplacenotesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesList]
  }
  
  extension [Self <: ParamsResourceMarketplacenotesList](x: Self) {
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
