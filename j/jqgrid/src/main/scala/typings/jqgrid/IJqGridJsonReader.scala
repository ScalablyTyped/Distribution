package typings.jqgrid

import typings.jqgrid.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJqGridJsonReader extends js.Object {
  /**
    * current page of the query
    * @param obj 
    * @returns {} 
    */
  var page: String | (js.Function1[/* obj */ js.Any, Double])
  /**
    * total number of records for the query
    * @param obj 
    * @returns {} 
    */
  var records: String | (js.Function1[/* obj */ Data, Double])
  /**
    * tells jqGrid that the information for the data in the row is repeatable - i.e. the elements have the same tag cell described in cell element. Setting this option to false instructs jqGrid to search elements in the json data by name.
    * This is the name from colModel or the name described with the jsonmap option in colModel
    */
  var repeatitems: Boolean
  /**
    * Name of the root property
    * @param obj 
    * @returns {} 
    */
  var root: String | (js.Function1[/* obj */ js.Any, _])
  /**
    * total pages for the query
    * @param obj 
    * @returns {} 
    */
  var total: String | (js.Function1[/* obj */ js.Any, Double])
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
}

