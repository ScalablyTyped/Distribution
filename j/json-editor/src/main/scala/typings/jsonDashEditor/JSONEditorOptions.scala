package typings.jsonDashEditor

import typings.jsonDashEditor.jsonDashEditorStrings.always
import typings.jsonDashEditor.jsonDashEditorStrings.barebones
import typings.jsonDashEditor.jsonDashEditorStrings.bootstrap2
import typings.jsonDashEditor.jsonDashEditorStrings.bootstrap3
import typings.jsonDashEditor.jsonDashEditorStrings.bootstrap4
import typings.jsonDashEditor.jsonDashEditorStrings.change
import typings.jsonDashEditor.jsonDashEditorStrings.fontawesome3
import typings.jsonDashEditor.jsonDashEditorStrings.fontawesome4
import typings.jsonDashEditor.jsonDashEditorStrings.foundation2
import typings.jsonDashEditor.jsonDashEditorStrings.foundation3
import typings.jsonDashEditor.jsonDashEditorStrings.foundation4
import typings.jsonDashEditor.jsonDashEditorStrings.foundation5
import typings.jsonDashEditor.jsonDashEditorStrings.foundation6
import typings.jsonDashEditor.jsonDashEditorStrings.html
import typings.jsonDashEditor.jsonDashEditorStrings.interaction
import typings.jsonDashEditor.jsonDashEditorStrings.jqueryui
import typings.jsonDashEditor.jsonDashEditorStrings.never
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
  var template: js.UndefOr[String | Anon_Compile] = js.undefined
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
    template: String | Anon_Compile = null,
    theme: barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui = null
  ): JSONEditorOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ajax)) __obj.updateDynamic("ajax")(ajax)
    if (!js.isUndefined(disable_array_add)) __obj.updateDynamic("disable_array_add")(disable_array_add)
    if (!js.isUndefined(disable_array_delete)) __obj.updateDynamic("disable_array_delete")(disable_array_delete)
    if (!js.isUndefined(disable_array_reorder)) __obj.updateDynamic("disable_array_reorder")(disable_array_reorder)
    if (!js.isUndefined(disable_collapse)) __obj.updateDynamic("disable_collapse")(disable_collapse)
    if (!js.isUndefined(disable_edit_json)) __obj.updateDynamic("disable_edit_json")(disable_edit_json)
    if (!js.isUndefined(disable_properties)) __obj.updateDynamic("disable_properties")(disable_properties)
    if (!js.isUndefined(display_required_only)) __obj.updateDynamic("display_required_only")(display_required_only)
    if (form_name_root != null) __obj.updateDynamic("form_name_root")(form_name_root)
    if (iconlib != null) __obj.updateDynamic("iconlib")(iconlib.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_oneof_values)) __obj.updateDynamic("keep_oneof_values")(keep_oneof_values)
    if (!js.isUndefined(no_additional_properties)) __obj.updateDynamic("no_additional_properties")(no_additional_properties)
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (!js.isUndefined(required_by_default)) __obj.updateDynamic("required_by_default")(required_by_default)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (show_errors != null) __obj.updateDynamic("show_errors")(show_errors.asInstanceOf[js.Any])
    if (startval != null) __obj.updateDynamic("startval")(startval.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorOptions[TValue]]
  }
}

