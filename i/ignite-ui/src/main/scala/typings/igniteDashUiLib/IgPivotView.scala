package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgPivotView
  extends /**
	 * Option for igPivotView
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
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
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number.
  	 * "null" will stretch to fit the parent, if no other widths are defined.
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

