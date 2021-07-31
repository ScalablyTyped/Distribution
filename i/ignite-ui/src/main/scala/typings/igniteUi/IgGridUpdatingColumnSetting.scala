package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridUpdatingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Identifies the grid column by key.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the default value for the column when adding new rows. When in edit mode for adding a row the value will be pre-filled in the column's editor (if the column is not read-only). The value should be of the type specified for the column in the grid's [columns](ui.iggrid#options:columns) collection.
    *
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
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
  
  /**
    * Specifies if the column is read-only. In 'cell' and 'row' [editMode](ui.iggridupdating#options:editMode) no editor will be created for read-only columns. In 'dialog' mode enabling [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) will display disabled editors for such columns.
    *
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the end-user will be allowed to leave the editor's value empty during edit mode or not.
    *
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the column's value should be validated or not. The validation is done based on the rules of the corresponding editor.
    *
    */
  var validation: js.UndefOr[Boolean] = js.undefined
}
object IgGridUpdatingColumnSetting {
  
  @scala.inline
  def apply(): IgGridUpdatingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridUpdatingColumnSettingMutableBuilder[Self <: IgGridUpdatingColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setEditorOptions(value: js.Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    @scala.inline
    def setEditorProvider(value: js.Any): Self = StObject.set(x, "editorProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorProviderUndefined: Self = StObject.set(x, "editorProvider", js.undefined)
    
    @scala.inline
    def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValidation(value: Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
