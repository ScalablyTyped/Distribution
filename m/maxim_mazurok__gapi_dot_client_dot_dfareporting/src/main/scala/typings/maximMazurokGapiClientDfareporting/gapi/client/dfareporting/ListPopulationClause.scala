package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPopulationClause extends js.Object {
  
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
  implicit class ListPopulationClauseOps[Self <: ListPopulationClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTermsVarargs(value: ListPopulationTerm*): Self = this.set("terms", js.Array(value :_*))
    
    @scala.inline
    def setTerms(value: js.Array[ListPopulationTerm]): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
  }
}
