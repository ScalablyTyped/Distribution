package typings
package jqgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJqGridJsonReader extends js.Object {
  /**
    * current page of the query
    * @param obj 
    * @returns {} 
    */
  var page: java.lang.String | (js.Function1[/* obj */ js.Any, scala.Double])
  /**
    * total number of records for the query
    * @param obj 
    * @returns {} 
    */
  var records: java.lang.String | (js.Function1[/* obj */ Anon_Data, scala.Double])
  /**
    * tells jqGrid that the information for the data in the row is repeatable - i.e. the elements have the same tag cell described in cell element. Setting this option to false instructs jqGrid to search elements in the json data by name.
    * This is the name from colModel or the name described with the jsonmap option in colModel
    */
  var repeatitems: scala.Boolean
  /**
    * Name of the root property
    * @param obj 
    * @returns {} 
    */
  var root: java.lang.String | (js.Function1[/* obj */ js.Any, _])
  /**
    * total pages for the query
    * @param obj 
    * @returns {} 
    */
  var total: java.lang.String | (js.Function1[/* obj */ js.Any, scala.Double])
}

object IJqGridJsonReader {
  @scala.inline
  def apply(
    page: java.lang.String | (js.Function1[/* obj */ js.Any, scala.Double]),
    records: java.lang.String | (js.Function1[/* obj */ Anon_Data, scala.Double]),
    repeatitems: scala.Boolean,
    root: java.lang.String | (js.Function1[/* obj */ js.Any, _]),
    total: java.lang.String | (js.Function1[/* obj */ js.Any, scala.Double])
  ): IJqGridJsonReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    __obj.updateDynamic("repeatitems")(repeatitems)
    __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJqGridJsonReader]
  }
}

