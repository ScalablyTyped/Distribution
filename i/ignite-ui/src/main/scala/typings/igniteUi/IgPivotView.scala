package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotView
  extends /**
	 * Option for igPivotView
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Configuration settings that will be assigned to the igPivotDataSelector widget.
  	 *
  	 */
  var dataSelectorOptions: js.UndefOr[IgPivotViewDataSelectorOptions] = js.undefined
  /**
  	 * Configuration settings for the panel containing the igPivotDataSelector.
  	 *
  	 */
  var dataSelectorPanel: js.UndefOr[IgPivotViewDataSelectorPanel] = js.undefined
  /**
  	 * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
  	 *
  	 */
  var dataSourceOptions: js.UndefOr[IgPivotViewDataSourceOptions] = js.undefined
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number.
  	 * "null" will stretch vertically to fit the parent, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Configuration settings that will be assigned to the igPivotGrid widget.
  	 *
  	 */
  var pivotGridOptions: js.UndefOr[IgPivotViewPivotGridOptions] = js.undefined
  /**
  	 * Configuration settings for the panel containing the igPivotGrid.
  	 *
  	 */
  var pivotGridPanel: js.UndefOr[IgPivotViewPivotGridPanel] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number.
  	 * "null" will stretch to fit the parent, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgPivotView {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPivotView
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    dataSelectorOptions: IgPivotViewDataSelectorOptions = null,
    dataSelectorPanel: IgPivotViewDataSelectorPanel = null,
    dataSource: js.Any = null,
    dataSourceOptions: IgPivotViewDataSourceOptions = null,
    height: String | Double = null,
    language: String = null,
    locale: js.Any = null,
    pivotGridOptions: IgPivotViewPivotGridOptions = null,
    pivotGridPanel: IgPivotViewPivotGridPanel = null,
    regional: String | js.Object = null,
    width: String | Double = null
  ): IgPivotView = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataSelectorOptions != null) __obj.updateDynamic("dataSelectorOptions")(dataSelectorOptions.asInstanceOf[js.Any])
    if (dataSelectorPanel != null) __obj.updateDynamic("dataSelectorPanel")(dataSelectorPanel.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceOptions != null) __obj.updateDynamic("dataSourceOptions")(dataSourceOptions.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pivotGridOptions != null) __obj.updateDynamic("pivotGridOptions")(pivotGridOptions.asInstanceOf[js.Any])
    if (pivotGridPanel != null) __obj.updateDynamic("pivotGridPanel")(pivotGridPanel.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotView]
  }
}

