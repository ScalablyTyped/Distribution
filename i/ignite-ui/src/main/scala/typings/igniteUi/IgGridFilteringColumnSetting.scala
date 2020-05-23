package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFilteringColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables/disables filtering for the column.
    *
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
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
    * "at"
    * "notAt"
    * "atBefore"
    * "atAfter"
    */
  var condition: js.UndefOr[String | Boolean] = js.undefined
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
  /**
    * Specifies options to initialize the corresponding editor with.
    *
    */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies а custom editor provider instance. More information about editor providers can be found [here](http://www.igniteui.com/help/implementing-custom-editor-provider) and [here](http://www.igniteui.com/help/working-with-combo-editor-provider).
    * It should either extend $.ig.EditorProvider or have definitions for the following methods:
    * $.ig.EditorProvider = $.ig.EditorProvider|| $.ig.EditorProvider.extend({
    * createEditor: function (callbacks, key, editorOptions, tabIndex, format, element) {},
    * attachErrorEvents: function (errorShowing, errorShown, errorHidden) {},
    * getEditor: function () {},
    * refreshValue: function () {},
    * getValue: function () {},
    * setValue: function (val) {},
    * setSize: function (width, height) {},
    * setFocus: function () {},
    * removeFromParent: function () {},
    * destroy: function () {},
    * validator: function () {},
    * validate: function (noLabel) {},
    * isValid: function () {}
    * });
    *
    */
  var editorProvider: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the type of editor to use for the column.
    *
    *
    * Valid values:
    * "text" An igTextEditor will be created
    * "mask" An igMaskEditor will be created
    * "date" An igDateEditor will be created
    * "datepicker" An igDatePicker will be created
    * "timepicker" An igTimePikcer will be created
    * "numeric" An igNumericEditor will be created
    * "checkbox" An igCheckboxEditor will be created
    * "currency" An igCurrencyEditor will be created
    * "percent" An igPercentEditor will be created
    * "combo" An igCombo editor is created. Both the JS and CSS files used by ui.igCombo should be available.
    * "rating" An igRating editor is created. Both the JS and CSS files used by ui.igRating should be available.
    */
  var editorType: js.UndefOr[String] = js.undefined
}

object IgGridFilteringColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    condition: String | Boolean = null,
    conditionList: js.Array[_] = null,
    customConditions: js.Any = null,
    defaultExpressions: IgGridFilteringColumnSettingDefaultExpressions = null,
    editorOptions: js.Any = null,
    editorProvider: js.Any = null,
    editorType: String = null
  ): IgGridFilteringColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (conditionList != null) __obj.updateDynamic("conditionList")(conditionList.asInstanceOf[js.Any])
    if (customConditions != null) __obj.updateDynamic("customConditions")(customConditions.asInstanceOf[js.Any])
    if (defaultExpressions != null) __obj.updateDynamic("defaultExpressions")(defaultExpressions.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorProvider != null) __obj.updateDynamic("editorProvider")(editorProvider.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFilteringColumnSetting]
  }
}

