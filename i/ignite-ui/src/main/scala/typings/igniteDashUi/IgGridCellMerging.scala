package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMerging
  extends /**
	 * Option for igGridCellMerging
	 */
/* optionName */ StringDictionary[js.Any] {
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
  var inherit: js.UndefOr[Boolean] = js.undefined
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
  	 * Defines when merging should be applied.
  	 *
  	 *
  	 * Valid values:
  	 * "sorting" Only sorted columns will have merging applied
  	 * "always" Merging will be applied to all columns always
  	 * "never" No merging will be applied
  	 */
  var mergeOn: js.UndefOr[String] = js.undefined
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
  var mergeStrategy: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * Defines the type of merging.
  	 *
  	 *
  	 * Valid values:
  	 * "visual" the grid cells will be merged only visually
  	 * "physical" the grid cell will be merged physically throughout rowspan
  	 */
  var mergeType: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var rowMergeStrategy: js.UndefOr[String | js.Function] = js.undefined
}

object IgGridCellMerging {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridCellMerging
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cellsMerged: CellsMergedEvent = null,
    cellsMerging: CellsMergingEvent = null,
    columnSettings: js.Array[IgGridCellMergingColumnSetting] = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    mergeOn: String = null,
    mergeRows: js.Any = null,
    mergeStrategy: String | js.Function = null,
    mergeType: String = null,
    regional: String | js.Object = null,
    rowMergeStrategy: String | js.Function = null
  ): IgGridCellMerging = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cellsMerged != null) __obj.updateDynamic("cellsMerged")(cellsMerged)
    if (cellsMerging != null) __obj.updateDynamic("cellsMerging")(cellsMerging)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mergeOn != null) __obj.updateDynamic("mergeOn")(mergeOn)
    if (mergeRows != null) __obj.updateDynamic("mergeRows")(mergeRows)
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    if (mergeType != null) __obj.updateDynamic("mergeType")(mergeType)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rowMergeStrategy != null) __obj.updateDynamic("rowMergeStrategy")(rowMergeStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridCellMerging]
  }
}

