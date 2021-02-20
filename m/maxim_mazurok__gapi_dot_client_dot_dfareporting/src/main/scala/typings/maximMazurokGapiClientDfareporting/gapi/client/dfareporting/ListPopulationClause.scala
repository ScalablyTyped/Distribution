package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPopulationClause extends StObject {
  
  /** Terms of this list population clause. Each clause is made up of list population terms representing constraints and are joined by ORs. */
  var terms: js.UndefOr[js.Array[ListPopulationTerm]] = js.native
}
object ListPopulationClause {
  
  @scala.inline
  def apply(): ListPopulationClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPopulationClause]
  }
  
  @scala.inline
  implicit class ListPopulationClauseMutableBuilder[Self <: ListPopulationClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerms(value: js.Array[ListPopulationTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    @scala.inline
    def setTermsVarargs(value: ListPopulationTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
  }
}
