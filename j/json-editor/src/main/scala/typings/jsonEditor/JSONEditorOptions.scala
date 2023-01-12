package typings.jsonEditor

import typings.jsonEditor.anon.Compile
import typings.jsonEditor.jsonEditorStrings.always
import typings.jsonEditor.jsonEditorStrings.barebones
import typings.jsonEditor.jsonEditorStrings.bootstrap2
import typings.jsonEditor.jsonEditorStrings.bootstrap3
import typings.jsonEditor.jsonEditorStrings.bootstrap4
import typings.jsonEditor.jsonEditorStrings.change
import typings.jsonEditor.jsonEditorStrings.fontawesome3
import typings.jsonEditor.jsonEditorStrings.fontawesome4
import typings.jsonEditor.jsonEditorStrings.foundation2
import typings.jsonEditor.jsonEditorStrings.foundation3
import typings.jsonEditor.jsonEditorStrings.foundation4
import typings.jsonEditor.jsonEditorStrings.foundation5
import typings.jsonEditor.jsonEditorStrings.foundation6
import typings.jsonEditor.jsonEditorStrings.html
import typings.jsonEditor.jsonEditorStrings.interaction
import typings.jsonEditor.jsonEditorStrings.jqueryui
import typings.jsonEditor.jsonEditorStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorOptions[TValue] extends StObject {
  
  /**
    * If true, JSON Editor will load external URLs in $ref via ajax.
    */
  var ajax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all "add row" buttons from arrays.
    */
  var disable_array_add: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all "delete row" buttons from arrays.
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all "move up" and "move down" buttons from arrays.
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all collapse buttons from objects and arrays.
    */
  var disable_collapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all Edit JSON buttons from objects.
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, remove all Edit Properties buttons from objects.
    */
  var disable_properties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, only required properties will be included by default.
    */
  var display_required_only: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The first part of the `name` attribute of form inputs in the editor. An full example name is `root[person][name]` where "root" is the form_name_root.
    */
  var form_name_root: js.UndefOr[String] = js.undefined
  
  /**
    * The icon library to use for the editor.
    */
  var iconlib: js.UndefOr[
    bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
  ] = js.undefined
  
  /**
    * If true, makes oneOf copy properties over when switching.
    */
  var keep_oneof_values: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, objects can only contain properties defined with the properties keyword.
    */
  var no_additional_properties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing schema definitions for URLs. Allows you to pre-define external schemas.
    */
  var refs: js.UndefOr[Any] = js.undefined
  
  /**
    * If true, all schemas that don't explicitly set the required property will be required.
    */
  var required_by_default: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A valid JSON Schema to use for the editor. Version 3 and Version 4 of the draft specification are supported.
    */
  var schema: js.UndefOr[Any] = js.undefined
  
  /**
    * When to show validation errors in the UI. Valid values are interaction, change, always, and never.
    */
  var show_errors: js.UndefOr[interaction | change | always | never] = js.undefined
  
  /**
    * Seed the editor with an initial value. This should be valid against the editor's schema.
    */
  var startval: js.UndefOr[TValue] = js.undefined
  
  /**
    * The JS template engine to use.
    */
  var template: js.UndefOr[String | Compile] = js.undefined
  
  /**
    * The CSS theme to use.
    */
  var theme: js.UndefOr[
    barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
  ] = js.undefined
}
object JSONEditorOptions {
  
  inline def apply[TValue](): JSONEditorOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONEditorOptions[?], TValue] (val x: Self & JSONEditorOptions[TValue]) extends AnyVal {
    
    inline def setAjax(value: Boolean): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    inline def setDisable_array_add(value: Boolean): Self = StObject.set(x, "disable_array_add", value.asInstanceOf[js.Any])
    
    inline def setDisable_array_addUndefined: Self = StObject.set(x, "disable_array_add", js.undefined)
    
    inline def setDisable_array_delete(value: Boolean): Self = StObject.set(x, "disable_array_delete", value.asInstanceOf[js.Any])
    
    inline def setDisable_array_deleteUndefined: Self = StObject.set(x, "disable_array_delete", js.undefined)
    
    inline def setDisable_array_reorder(value: Boolean): Self = StObject.set(x, "disable_array_reorder", value.asInstanceOf[js.Any])
    
    inline def setDisable_array_reorderUndefined: Self = StObject.set(x, "disable_array_reorder", js.undefined)
    
    inline def setDisable_collapse(value: Boolean): Self = StObject.set(x, "disable_collapse", value.asInstanceOf[js.Any])
    
    inline def setDisable_collapseUndefined: Self = StObject.set(x, "disable_collapse", js.undefined)
    
    inline def setDisable_edit_json(value: Boolean): Self = StObject.set(x, "disable_edit_json", value.asInstanceOf[js.Any])
    
    inline def setDisable_edit_jsonUndefined: Self = StObject.set(x, "disable_edit_json", js.undefined)
    
    inline def setDisable_properties(value: Boolean): Self = StObject.set(x, "disable_properties", value.asInstanceOf[js.Any])
    
    inline def setDisable_propertiesUndefined: Self = StObject.set(x, "disable_properties", js.undefined)
    
    inline def setDisplay_required_only(value: Boolean): Self = StObject.set(x, "display_required_only", value.asInstanceOf[js.Any])
    
    inline def setDisplay_required_onlyUndefined: Self = StObject.set(x, "display_required_only", js.undefined)
    
    inline def setForm_name_root(value: String): Self = StObject.set(x, "form_name_root", value.asInstanceOf[js.Any])
    
    inline def setForm_name_rootUndefined: Self = StObject.set(x, "form_name_root", js.undefined)
    
    inline def setIconlib(
      value: bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
    ): Self = StObject.set(x, "iconlib", value.asInstanceOf[js.Any])
    
    inline def setIconlibUndefined: Self = StObject.set(x, "iconlib", js.undefined)
    
    inline def setKeep_oneof_values(value: Boolean): Self = StObject.set(x, "keep_oneof_values", value.asInstanceOf[js.Any])
    
    inline def setKeep_oneof_valuesUndefined: Self = StObject.set(x, "keep_oneof_values", js.undefined)
    
    inline def setNo_additional_properties(value: Boolean): Self = StObject.set(x, "no_additional_properties", value.asInstanceOf[js.Any])
    
    inline def setNo_additional_propertiesUndefined: Self = StObject.set(x, "no_additional_properties", js.undefined)
    
    inline def setRefs(value: Any): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    inline def setRequired_by_default(value: Boolean): Self = StObject.set(x, "required_by_default", value.asInstanceOf[js.Any])
    
    inline def setRequired_by_defaultUndefined: Self = StObject.set(x, "required_by_default", js.undefined)
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setShow_errors(value: interaction | change | always | never): Self = StObject.set(x, "show_errors", value.asInstanceOf[js.Any])
    
    inline def setShow_errorsUndefined: Self = StObject.set(x, "show_errors", js.undefined)
    
    inline def setStartval(value: TValue): Self = StObject.set(x, "startval", value.asInstanceOf[js.Any])
    
    inline def setStartvalUndefined: Self = StObject.set(x, "startval", js.undefined)
    
    inline def setTemplate(value: String | Compile): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTheme(
      value: barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
