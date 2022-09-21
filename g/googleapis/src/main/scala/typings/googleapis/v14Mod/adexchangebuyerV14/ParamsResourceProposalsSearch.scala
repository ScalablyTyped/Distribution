package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProposalsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Query string to retrieve specific proposals.
    */
  var pqlQuery: js.UndefOr[String] = js.undefined
}
object ParamsResourceProposalsSearch {
  
  inline def apply(): ParamsResourceProposalsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProposalsSearch]
  }
  
  extension [Self <: ParamsResourceProposalsSearch](x: Self) {
    
    inline def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    inline def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
  }
}
