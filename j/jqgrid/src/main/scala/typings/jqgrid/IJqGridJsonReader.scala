package typings.jqgrid

import typings.jqgrid.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJqGridJsonReader extends StObject {
  
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
  implicit class IJqGridJsonReaderMutableBuilder[Self <: IJqGridJsonReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageFunction1(value: /* obj */ js.Any => Double): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecords(value: String | (js.Function1[/* obj */ Data, Double])): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsFunction1(value: /* obj */ Data => Double): Self = StObject.set(x, "records", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRepeatitems(value: Boolean): Self = StObject.set(x, "repeatitems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String | (js.Function1[/* obj */ js.Any, _])): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFunction1(value: /* obj */ js.Any => _): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotal(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFunction1(value: /* obj */ js.Any => Double): Self = StObject.set(x, "total", js.Any.fromFunction1(value))
  }
}
