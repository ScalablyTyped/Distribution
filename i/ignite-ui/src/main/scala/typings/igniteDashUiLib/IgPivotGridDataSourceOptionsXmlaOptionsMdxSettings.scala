package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings
  extends /**
	 * Option for IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on COLUMNS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on ROWS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on COLUMNS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on ROWS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnRows: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on COLUMNS axis. Default value is true
  	 */
  var nonEmptyOnColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on ROWS axis. Default value is true
  	 */
  var nonEmptyOnRows: js.UndefOr[scala.Boolean] = js.undefined
}

object IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addCalculatedMembersOnColumns: js.UndefOr[scala.Boolean] = js.undefined,
    addCalculatedMembersOnRows: js.UndefOr[scala.Boolean] = js.undefined,
    dimensionPropertiesOnColumns: js.Array[_] = null,
    dimensionPropertiesOnRows: js.Array[_] = null,
    nonEmptyOnColumns: js.UndefOr[scala.Boolean] = js.undefined,
    nonEmptyOnRows: js.UndefOr[scala.Boolean] = js.undefined
  ): IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addCalculatedMembersOnColumns)) __obj.updateDynamic("addCalculatedMembersOnColumns")(addCalculatedMembersOnColumns)
    if (!js.isUndefined(addCalculatedMembersOnRows)) __obj.updateDynamic("addCalculatedMembersOnRows")(addCalculatedMembersOnRows)
    if (dimensionPropertiesOnColumns != null) __obj.updateDynamic("dimensionPropertiesOnColumns")(dimensionPropertiesOnColumns)
    if (dimensionPropertiesOnRows != null) __obj.updateDynamic("dimensionPropertiesOnRows")(dimensionPropertiesOnRows)
    if (!js.isUndefined(nonEmptyOnColumns)) __obj.updateDynamic("nonEmptyOnColumns")(nonEmptyOnColumns)
    if (!js.isUndefined(nonEmptyOnRows)) __obj.updateDynamic("nonEmptyOnRows")(nonEmptyOnRows)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings]
  }
}

