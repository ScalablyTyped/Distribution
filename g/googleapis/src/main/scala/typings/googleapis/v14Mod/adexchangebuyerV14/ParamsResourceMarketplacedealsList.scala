package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMarketplacedealsList
  extends StObject
     with StandardParameters {
  
  /**
    * Query string to retrieve specific deals.
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The proposalId to get deals for. To search across all proposals specify order_id = '-' as part of the URL.
    */
  var proposalId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMarketplacedealsList {
  
  inline def apply(): ParamsResourceMarketplacedealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacedealsList]
  }
  
  extension [Self <: ParamsResourceMarketplacedealsList](x: Self) {
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
