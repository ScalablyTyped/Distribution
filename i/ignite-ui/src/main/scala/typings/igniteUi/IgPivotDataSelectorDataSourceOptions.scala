package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
    */
  var columns: js.UndefOr[String] = js.native
  /**
    * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Settings for creating an instance of $.ig.OlapFlatDataSource.
    */
  var flatDataOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptions] = js.native
  /**
    * A list of measure names separated by comma (,). These will be the measures of the data source.
    */
  var measures: js.UndefOr[String] = js.native
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
    */
  var rows: js.UndefOr[String] = js.native
  /**
    * Settings for creating an instance of $.ig.OlapXmlaDataSource.
    */
  var xmlaOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsXmlaOptions] = js.native
}

object IgPivotDataSelectorDataSourceOptions {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptions]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsOps[Self <: IgPivotDataSelectorDataSourceOptions] (val x: Self) extends AnyVal {
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setFlatDataOptions(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptions): Self = this.set("flatDataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatDataOptions: Self = this.set("flatDataOptions", js.undefined)
    @scala.inline
    def setMeasures(value: String): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setXmlaOptions(value: IgPivotDataSelectorDataSourceOptionsXmlaOptions): Self = this.set("xmlaOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlaOptions: Self = this.set("xmlaOptions", js.undefined)
  }
  
}

