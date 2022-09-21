package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPopulationClause extends StObject {
  
  /** Terms of this list population clause. Each clause is made up of list population terms representing constraints and are joined by ORs. */
  var terms: js.UndefOr[js.Array[ListPopulationTerm]] = js.undefined
}
object ListPopulationClause {
  
  inline def apply(): ListPopulationClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationClause]
  }
  
  extension [Self <: ListPopulationClause](x: Self) {
    
    inline def setTerms(value: js.Array[ListPopulationTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTermsVarargs(value: ListPopulationTerm*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
