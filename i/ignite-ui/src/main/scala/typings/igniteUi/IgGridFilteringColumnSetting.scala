package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridFilteringColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  var conditionList: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An object used to specify custom filtering conditions as objects for this column.
    *
    * labelText  The label as it will appear in the column's condition dropdown.
    * expressionText  The text to display in the editor when requireExpr is false.
    * requireExpr  If this condition requires the user to input a filtering expression.
    * filterImgIcon  Class applied to the dropdown item when in simple mode.
    * filterFunc  The custom comparing filter function. Signature: function (value, expression, dataType, ignoreCase, preciseDateFormat).
    */
  var customConditions: js.UndefOr[Any] = js.undefined
  
  /**
    * Initial filtering expressions - if set they will be applied on initialization together with the preset [condition](ui.iggridfiltering#options:columnSettings.condition).
    *
    */
  var defaultExpressions: js.UndefOr[IgGridFilteringColumnSettingDefaultExpressions] = js.undefined
  
  /**
    * Specifies options to initialize the corresponding editor with.
    *
    */
  var editorOptions: js.UndefOr[Any] = js.undefined
  
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
  var editorProvider: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): IgGridFilteringColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFilteringColumnSetting]
  }
  
  extension [Self <: IgGridFilteringColumnSetting](x: Self) {
    
    inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setCondition(value: String | Boolean): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionList(value: js.Array[Any]): Self = StObject.set(x, "conditionList", value.asInstanceOf[js.Any])
    
    inline def setConditionListUndefined: Self = StObject.set(x, "conditionList", js.undefined)
    
    inline def setConditionListVarargs(value: Any*): Self = StObject.set(x, "conditionList", js.Array(value*))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setCustomConditions(value: Any): Self = StObject.set(x, "customConditions", value.asInstanceOf[js.Any])
    
    inline def setCustomConditionsUndefined: Self = StObject.set(x, "customConditions", js.undefined)
    
    inline def setDefaultExpressions(value: IgGridFilteringColumnSettingDefaultExpressions): Self = StObject.set(x, "defaultExpressions", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpressionsUndefined: Self = StObject.set(x, "defaultExpressions", js.undefined)
    
    inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorProvider(value: Any): Self = StObject.set(x, "editorProvider", value.asInstanceOf[js.Any])
    
    inline def setEditorProviderUndefined: Self = StObject.set(x, "editorProvider", js.undefined)
    
    inline def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
  }
}
