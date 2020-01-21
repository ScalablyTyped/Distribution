package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroupCompareItem extends js.Object {
  var field: String
  var items: js.Array[_]
  var value: js.Any
}

object DataSourceGroupCompareItem {
  @scala.inline
  def apply(field: String, items: js.Array[_], value: js.Any): DataSourceGroupCompareItem = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceGroupCompareItem]
  }
}

