package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridFilteringColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables/disables filtering for the column.
    *
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  
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
  var condition: js.UndefOr[String | Boolean] = js.native
  
  /**
    * An array of strings that determine which [conditions](ui.iggridfiltering#options:columnSettings.condition) to display for this column.
    *
    */
  var conditionList: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An object used to specify custom filtering conditions as objects for this column.
    *
    * labelText  The label as it will appear in the column's condition dropdown.
    * expressionText  The text to display in the editor when requireExpr is false.
    * requireExpr  If this condition requires the user to input a filtering expression.
    * filterImgIcon  Class applied to the dropdown item when in simple mode.
    * filterFunc  The custom comparing filter function. Signature: function (value, expression, dataType, ignoreCase, preciseDateFormat).
    */
  var customConditions: js.UndefOr[js.Any] = js.native
  
  /**
    * Initial filtering expressions - if set they will be applied on initialization together with the preset [condition](ui.iggridfiltering#options:columnSettings.condition).
    *
    */
  var defaultExpressions: js.UndefOr[IgGridFilteringColumnSettingDefaultExpressions] = js.native
  
  /**
    * Specifies options to initialize the corresponding editor with.
    *
    */
  var editorOptions: js.UndefOr[js.Any] = js.native
  
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
  var editorProvider: js.UndefOr[js.Any] = js.native
  
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
  var editorType: js.UndefOr[String] = js.native
}
object IgGridFilteringColumnSetting {
  
  @scala.inline
  def apply(): IgGridFilteringColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFilteringColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridFilteringColumnSettingOps[Self <: IgGridFilteringColumnSetting] (val x: Self) extends AnyVal {
    
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
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setCondition(value: String | Boolean): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setConditionListVarargs(value: js.Any*): Self = this.set("conditionList", js.Array(value :_*))
    
    @scala.inline
    def setConditionList(value: js.Array[_]): Self = this.set("conditionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionList: Self = this.set("conditionList", js.undefined)
    
    @scala.inline
    def setCustomConditions(value: js.Any): Self = this.set("customConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomConditions: Self = this.set("customConditions", js.undefined)
    
    @scala.inline
    def setDefaultExpressions(value: IgGridFilteringColumnSettingDefaultExpressions): Self = this.set("defaultExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpressions: Self = this.set("defaultExpressions", js.undefined)
    
    @scala.inline
    def setEditorOptions(value: js.Any): Self = this.set("editorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorOptions: Self = this.set("editorOptions", js.undefined)
    
    @scala.inline
    def setEditorProvider(value: js.Any): Self = this.set("editorProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorProvider: Self = this.set("editorProvider", js.undefined)
    
    @scala.inline
    def setEditorType(value: String): Self = this.set("editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorType: Self = this.set("editorType", js.undefined)
  }
}
