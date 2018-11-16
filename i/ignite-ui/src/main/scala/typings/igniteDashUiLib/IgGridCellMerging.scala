package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridCellMerging
  extends /**
	 * Option for igGridCellMerging
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var cellsMerged: js.UndefOr[CellsMergedEvent] = js.undefined
  /**
  	 * Event fired before a new merged cells group is created.
  	 */
  var cellsMerging: js.UndefOr[CellsMergingEvent] = js.undefined
  /**
  	 * A list of column settings that specifies hiding options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridCellMergingColumnSetting]] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
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
  	 * Defines when merging should be applied.
  	 *
  	 *
  	 * Valid values:
  	 * "sorting" Only sorted columns will have merging applied
  	 * "always" Merging will be applied to all columns always
  	 * "never" No merging will be applied
  	 */
  var mergeOn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Defines the whether the rows will be merged or not.
  	 *
  	 */
  var mergeRows: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var mergeStrategy: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	 * Defines the type of merging.
  	 *
  	 *
  	 * Valid values:
  	 * "visual" the grid cells will be merged only visually
  	 * "physical" the grid cell will be merged physically throughout rowspan
  	 */
  var mergeType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var rowMergeStrategy: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

