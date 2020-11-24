package typings.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends js.Object {
  
  var breaches: js.Array[Breach_] | Null = js.native
  
  var pastes: js.Array[Paste] | Null = js.native
}
object SearchResults {
  
  @scala.inline
  def apply(): SearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResults]
  }
  
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    
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
    def setBreachesVarargs(value: Breach_ *): Self = this.set("breaches", js.Array(value :_*))
    
    @scala.inline
    def setBreaches(value: js.Array[Breach_]): Self = this.set("breaches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachesNull: Self = this.set("breaches", null)
    
    @scala.inline
    def setPastesVarargs(value: Paste*): Self = this.set("pastes", js.Array(value :_*))
    
    @scala.inline
    def setPastes(value: js.Array[Paste]): Self = this.set("pastes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastesNull: Self = this.set("pastes", null)
  }
}
