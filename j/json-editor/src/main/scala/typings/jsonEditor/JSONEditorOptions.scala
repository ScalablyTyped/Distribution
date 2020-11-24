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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorOptions[TValue] extends js.Object {
  
  /**
    * If true, JSON Editor will load external URLs in $ref via ajax.
    */
  var ajax: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all "add row" buttons from arrays.
    */
  var disable_array_add: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all "delete row" buttons from arrays.
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all "move up" and "move down" buttons from arrays.
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all collapse buttons from objects and arrays.
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all Edit JSON buttons from objects.
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, remove all Edit Properties buttons from objects.
    */
  var disable_properties: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only required properties will be included by default.
    */
  var display_required_only: js.UndefOr[Boolean] = js.native
  
  /**
    * The first part of the `name` attribute of form inputs in the editor. An full example name is `root[person][name]` where "root" is the form_name_root.
    */
  var form_name_root: js.UndefOr[String] = js.native
  
  /**
    * The icon library to use for the editor.
    */
  var iconlib: js.UndefOr[
    bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
  ] = js.native
  
  /**
    * If true, makes oneOf copy properties over when switching.
    */
  var keep_oneof_values: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, objects can only contain properties defined with the properties keyword.
    */
  var no_additional_properties: js.UndefOr[Boolean] = js.native
  
  /**
    * An object containing schema definitions for URLs. Allows you to pre-define external schemas.
    */
  var refs: js.UndefOr[js.Any] = js.native
  
  /**
    * If true, all schemas that don't explicitly set the required property will be required.
    */
  var required_by_default: js.UndefOr[Boolean] = js.native
  
  /**
    * A valid JSON Schema to use for the editor. Version 3 and Version 4 of the draft specification are supported.
    */
  var schema: js.UndefOr[js.Any] = js.native
  
  /**
    * When to show validation errors in the UI. Valid values are interaction, change, always, and never.
    */
  var show_errors: js.UndefOr[interaction | change | always | never] = js.native
  
  /**
    * Seed the editor with an initial value. This should be valid against the editor's schema.
    */
  var startval: js.UndefOr[TValue] = js.native
  
  /**
    * The JS template engine to use.
    */
  var template: js.UndefOr[String | Compile] = js.native
  
  /**
    * The CSS theme to use.
    */
  var theme: js.UndefOr[
    barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
  ] = js.native
}
object JSONEditorOptions {
  
  @scala.inline
  def apply[TValue](): JSONEditorOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions[TValue]]
  }
  
  @scala.inline
  implicit class JSONEditorOptionsOps[Self <: JSONEditorOptions[_], TValue] (val x: Self with JSONEditorOptions[TValue]) extends AnyVal {
    
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
    def setAjax(value: Boolean): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setDisable_array_add(value: Boolean): Self = this.set("disable_array_add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_add: Self = this.set("disable_array_add", js.undefined)
    
    @scala.inline
    def setDisable_array_delete(value: Boolean): Self = this.set("disable_array_delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_delete: Self = this.set("disable_array_delete", js.undefined)
    
    @scala.inline
    def setDisable_array_reorder(value: Boolean): Self = this.set("disable_array_reorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_reorder: Self = this.set("disable_array_reorder", js.undefined)
    
    @scala.inline
    def setDisable_collapse(value: Boolean): Self = this.set("disable_collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_collapse: Self = this.set("disable_collapse", js.undefined)
    
    @scala.inline
    def setDisable_edit_json(value: Boolean): Self = this.set("disable_edit_json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_edit_json: Self = this.set("disable_edit_json", js.undefined)
    
    @scala.inline
    def setDisable_properties(value: Boolean): Self = this.set("disable_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_properties: Self = this.set("disable_properties", js.undefined)
    
    @scala.inline
    def setDisplay_required_only(value: Boolean): Self = this.set("display_required_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_required_only: Self = this.set("display_required_only", js.undefined)
    
    @scala.inline
    def setForm_name_root(value: String): Self = this.set("form_name_root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm_name_root: Self = this.set("form_name_root", js.undefined)
    
    @scala.inline
    def setIconlib(
      value: bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
    ): Self = this.set("iconlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconlib: Self = this.set("iconlib", js.undefined)
    
    @scala.inline
    def setKeep_oneof_values(value: Boolean): Self = this.set("keep_oneof_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_oneof_values: Self = this.set("keep_oneof_values", js.undefined)
    
    @scala.inline
    def setNo_additional_properties(value: Boolean): Self = this.set("no_additional_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_additional_properties: Self = this.set("no_additional_properties", js.undefined)
    
    @scala.inline
    def setRefs(value: js.Any): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    
    @scala.inline
    def setRequired_by_default(value: Boolean): Self = this.set("required_by_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired_by_default: Self = this.set("required_by_default", js.undefined)
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setShow_errors(value: interaction | change | always | never): Self = this.set("show_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_errors: Self = this.set("show_errors", js.undefined)
    
    @scala.inline
    def setStartval(value: TValue): Self = this.set("startval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartval: Self = this.set("startval", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | Compile): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTheme(
      value: barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
    ): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
