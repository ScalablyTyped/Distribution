package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFilteringColumnSetting
  extends /**
	 * Option for IgGridFilteringColumnSetting
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables/disables filtering for the column.
  	 *
  	 */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Identifies the grid column by index. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Identifies the grid column by key. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Initial filtering condition for the column.
  	 *
  	 *
  	 * Valid values:
  	 * "empty"
  	 * "notEmpty"
  	 * "null"
  	 * "notNull"
  	 * "equals"
  	 * "doesNotEqual"
  	 * "startsWith"
  	 * "contains"
  	 * "doesNotContain"
  	 * "endsWith"
  	 * "greaterThan"
  	 * "lessThan"
  	 * "greaterThanOrEqualTo"
  	 * "lessThanOrEqualTo"
  	 * "true"
  	 * "false"
  	 * "on"
  	 * "notOn"
  	 * "before"
  	 * "after"
  	 * "today"
  	 * "yesterday"
  	 * "thisMonth"
  	 * "lastMonth"
  	 * "nextMonth"
  	 * "thisYear"
  	 * "nextYear"
  	 * "lastYear"
  	 */
  var condition: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  	 * An array of strings that determine which [conditions](ui.iggridfiltering#options:columnSettings.condition) to display for this column.
  	 *
  	 */
  var conditionList: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * An object used to specify custom filtering conditions as objects for this column.
  	 *
  	 * labelText  The label as it will appear in the column's condition dropdown.
  	 * expressionText  The text to display in the editor when requireExpr is false.
  	 * requireExpr  If this condition requires the user to input a filtering expression.
  	 * filterImgIcon  Class applied to the dropdown item when in simple mode.
  	 * filterFunc  The custom comparing filter function. Signature: function (value, expression, dataType, ignoreCase, preciseDateFormat).
  	 */
  var customConditions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Initial filtering expressions - if set they will be applied on initialization together with the preset [condition](ui.iggridfiltering#options:columnSettings.condition).
  	 *
  	 */
  var defaultExpressions: js.UndefOr[IgGridFilteringColumnSettingDefaultExpressions] = js.undefined
}

