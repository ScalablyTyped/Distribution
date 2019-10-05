package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSortItem extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object DataSourceSortItem {
  @scala.inline
  def apply(dir: String = null, field: String = null): DataSourceSortItem = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceSortItem]
  }
}

