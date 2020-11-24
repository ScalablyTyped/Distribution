package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for clearing more than one range selected by a DataFilter in a
  * spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesByDataFilterRequest extends js.Object {
  
  /**
    * The DataFilters used to determine which ranges to clear.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
}
object SchemaBatchClearValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): SchemaBatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchClearValuesByDataFilterRequestOps[Self <: SchemaBatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
  }
}
