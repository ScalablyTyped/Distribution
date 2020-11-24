package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListFilters method.
  */
@js.native
trait SchemaListFiltersResponse extends js.Object {
  
  /**
    * List of a user&#39;s filters.
    */
  var filter: js.UndefOr[js.Array[SchemaFilter]] = js.native
}
object SchemaListFiltersResponse {
  
  @scala.inline
  def apply(): SchemaListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFiltersResponse]
  }
  
  @scala.inline
  implicit class SchemaListFiltersResponseOps[Self <: SchemaListFiltersResponse] (val x: Self) extends AnyVal {
    
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
    def setFilterVarargs(value: SchemaFilter*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: js.Array[SchemaFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
