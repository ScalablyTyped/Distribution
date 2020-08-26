package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotView
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Configuration settings that will be assigned to the igPivotDataSelector widget.
    *
    */
  var dataSelectorOptions: js.UndefOr[IgPivotViewDataSelectorOptions] = js.native
  /**
    * Configuration settings for the panel containing the igPivotDataSelector.
    *
    */
  var dataSelectorPanel: js.UndefOr[IgPivotViewDataSelectorPanel] = js.native
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotViewDataSourceOptions] = js.native
  /**
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number.
    * "null" will stretch vertically to fit the parent, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Configuration settings that will be assigned to the igPivotGrid widget.
    *
    */
  var pivotGridOptions: js.UndefOr[IgPivotViewPivotGridOptions] = js.native
  /**
    * Configuration settings for the panel containing the igPivotGrid.
    *
    */
  var pivotGridPanel: js.UndefOr[IgPivotViewPivotGridPanel] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "number" The widget width can be set as a number.
    * "null" will stretch to fit the parent, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgPivotView {
  @scala.inline
  def apply(): IgPivotView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotView]
  }
  @scala.inline
  implicit class IgPivotViewOps[Self <: IgPivotView] (val x: Self) extends AnyVal {
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
    def setDataSelectorOptions(value: IgPivotViewDataSelectorOptions): Self = this.set("dataSelectorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSelectorOptions: Self = this.set("dataSelectorOptions", js.undefined)
    @scala.inline
    def setDataSelectorPanel(value: IgPivotViewDataSelectorPanel): Self = this.set("dataSelectorPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSelectorPanel: Self = this.set("dataSelectorPanel", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceOptions(value: IgPivotViewDataSourceOptions): Self = this.set("dataSourceOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceOptions: Self = this.set("dataSourceOptions", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPivotGridOptions(value: IgPivotViewPivotGridOptions): Self = this.set("pivotGridOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotGridOptions: Self = this.set("pivotGridOptions", js.undefined)
    @scala.inline
    def setPivotGridPanel(value: IgPivotViewPivotGridPanel): Self = this.set("pivotGridPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotGridPanel: Self = this.set("pivotGridPanel", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

