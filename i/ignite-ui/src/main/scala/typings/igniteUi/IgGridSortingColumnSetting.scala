package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSortingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables/disables sorting on the specified column. By default all columns are sortable.
    *
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Reference to a function (string or function) used for custom comparison.
    * The function accepts the following arguments:
    * val1 - the first value to compare,
    * val2 - the second value to compare,
    * recordsData (optional) - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare.
    * The function returns the following numeric value:
    * 0 - indicating that values are equal,
    * 1 - indicating that val1 > val2,
    * -1 - indicating that val1 < val2.
    *
    *
    * Valid values:
    * "string" The name of the function as a string located in the global window object.
    * "function" Function which will be used for custom comparison.
    */
  var compareFunc: js.UndefOr[String | js.Function] = js.native
  /**
    * The current (or default) sort direction. If this setting is specified, the column will be rendered sorted according to this option.
    *
    *
    * Valid values:
    * "asc" The initial sort of the column data will be in ascending order.
    * "desc" The initial sort of the column data will be in descending order.
    */
  var currentSortDirection: js.UndefOr[String] = js.native
  /**
    * This will be the first sort direction when the column hasn't been sorted before.
    *
    *
    * Valid values:
    * "asc" The first sort of the column data will be in ascending order.
    * "desc" The first sort of the column data will be in descending order.
    */
  var firstSortDirection: js.UndefOr[String] = js.native
}

object IgGridSortingColumnSetting {
  @scala.inline
  def apply(): IgGridSortingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingColumnSetting]
  }
  @scala.inline
  implicit class IgGridSortingColumnSettingOps[Self <: IgGridSortingColumnSetting] (val x: Self) extends AnyVal {
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
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setCompareFunc(value: String | js.Function): Self = this.set("compareFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareFunc: Self = this.set("compareFunc", js.undefined)
    @scala.inline
    def setCurrentSortDirection(value: String): Self = this.set("currentSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSortDirection: Self = this.set("currentSortDirection", js.undefined)
    @scala.inline
    def setFirstSortDirection(value: String): Self = this.set("firstSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSortDirection: Self = this.set("firstSortDirection", js.undefined)
  }
  
}

