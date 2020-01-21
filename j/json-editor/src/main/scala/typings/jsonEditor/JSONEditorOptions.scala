package typings.jsonEditor

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
import scala.scalajs.js.annotation._

trait JSONEditorOptions[TValue] extends js.Object {
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
  var refs: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, all schemas that don't explicitly set the required property will be required.
    */
  var required_by_default: js.UndefOr[Boolean] = js.undefined
  /**
    * A valid JSON Schema to use for the editor. Version 3 and Version 4 of the draft specification are supported.
    */
  var schema: js.UndefOr[js.Any] = js.undefined
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
  var template: js.UndefOr[String | AnonCompile] = js.undefined
  /**
    * The CSS theme to use.
    */
  var theme: js.UndefOr[
    barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
  ] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply[TValue](
    ajax: js.UndefOr[Boolean] = js.undefined,
    disable_array_add: js.UndefOr[Boolean] = js.undefined,
    disable_array_delete: js.UndefOr[Boolean] = js.undefined,
    disable_array_reorder: js.UndefOr[Boolean] = js.undefined,
    disable_collapse: js.UndefOr[Boolean] = js.undefined,
    disable_edit_json: js.UndefOr[Boolean] = js.undefined,
    disable_properties: js.UndefOr[Boolean] = js.undefined,
    display_required_only: js.UndefOr[Boolean] = js.undefined,
    form_name_root: String = null,
    iconlib: bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4 = null,
    keep_oneof_values: js.UndefOr[Boolean] = js.undefined,
    no_additional_properties: js.UndefOr[Boolean] = js.undefined,
    refs: js.Any = null,
    required_by_default: js.UndefOr[Boolean] = js.undefined,
    schema: js.Any = null,
    show_errors: interaction | change | always | never = null,
    startval: TValue = null,
    template: String | AnonCompile = null,
    theme: barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui = null
  ): JSONEditorOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ajax)) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_array_add)) __obj.updateDynamic("disable_array_add")(disable_array_add.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_array_delete)) __obj.updateDynamic("disable_array_delete")(disable_array_delete.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_array_reorder)) __obj.updateDynamic("disable_array_reorder")(disable_array_reorder.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_collapse)) __obj.updateDynamic("disable_collapse")(disable_collapse.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_edit_json)) __obj.updateDynamic("disable_edit_json")(disable_edit_json.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_properties)) __obj.updateDynamic("disable_properties")(disable_properties.asInstanceOf[js.Any])
    if (!js.isUndefined(display_required_only)) __obj.updateDynamic("display_required_only")(display_required_only.asInstanceOf[js.Any])
    if (form_name_root != null) __obj.updateDynamic("form_name_root")(form_name_root.asInstanceOf[js.Any])
    if (iconlib != null) __obj.updateDynamic("iconlib")(iconlib.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_oneof_values)) __obj.updateDynamic("keep_oneof_values")(keep_oneof_values.asInstanceOf[js.Any])
    if (!js.isUndefined(no_additional_properties)) __obj.updateDynamic("no_additional_properties")(no_additional_properties.asInstanceOf[js.Any])
    if (refs != null) __obj.updateDynamic("refs")(refs.asInstanceOf[js.Any])
    if (!js.isUndefined(required_by_default)) __obj.updateDynamic("required_by_default")(required_by_default.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (show_errors != null) __obj.updateDynamic("show_errors")(show_errors.asInstanceOf[js.Any])
    if (startval != null) __obj.updateDynamic("startval")(startval.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorOptions[TValue]]
  }
}

