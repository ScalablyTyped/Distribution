package typings.jqgrid

import typings.jqgrid.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJqGridJsonReader extends js.Object {
  
  /**
    * current page of the query
    * @param obj 
    * @returns {} 
    */
  var page: String | (js.Function1[/* obj */ js.Any, Double]) = js.native
  
  /**
    * total number of records for the query
    * @param obj 
    * @returns {} 
    */
  var records: String | (js.Function1[/* obj */ Data, Double]) = js.native
  
  /**
    * tells jqGrid that the information for the data in the row is repeatable - i.e. the elements have the same tag cell described in cell element. Setting this option to false instructs jqGrid to search elements in the json data by name.
    * This is the name from colModel or the name described with the jsonmap option in colModel
    */
  var repeatitems: Boolean = js.native
  
  /**
    * Name of the root property
    * @param obj 
    * @returns {} 
    */
  var root: String | (js.Function1[/* obj */ js.Any, _]) = js.native
  
  /**
    * total pages for the query
    * @param obj 
    * @returns {} 
    */
  var total: String | (js.Function1[/* obj */ js.Any, Double]) = js.native
}
object IJqGridJsonReader {
  
  @scala.inline
  def apply(
    page: String | (js.Function1[/* obj */ js.Any, Double]),
    records: String | (js.Function1[/* obj */ Data, Double]),
    repeatitems: Boolean,
    root: String | (js.Function1[/* obj */ js.Any, _]),
    total: String | (js.Function1[/* obj */ js.Any, Double])
  ): IJqGridJsonReader = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], repeatitems = repeatitems.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJqGridJsonReader]
  }
  
  @scala.inline
  implicit class IJqGridJsonReaderOps[Self <: IJqGridJsonReader] (val x: Self) extends AnyVal {
    
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
    def setPageFunction1(value: /* obj */ js.Any => Double): Self = this.set("page", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPage(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsFunction1(value: /* obj */ Data => Double): Self = this.set("records", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecords(value: String | (js.Function1[/* obj */ Data, Double])): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatitems(value: Boolean): Self = this.set("repeatitems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFunction1(value: /* obj */ js.Any => _): Self = this.set("root", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoot(value: String | (js.Function1[/* obj */ js.Any, _])): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFunction1(value: /* obj */ js.Any => Double): Self = this.set("total", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotal(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
