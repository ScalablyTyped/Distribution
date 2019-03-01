package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions[TValue] extends js.Object {
  /**
    * If true, JSON Editor will load external URLs in $ref via ajax.
    */
  var ajax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all "add row" buttons from arrays.
    */
  var disable_array_add: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all "delete row" buttons from arrays.
    */
  var disable_array_delete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all "move up" and "move down" buttons from arrays.
    */
  var disable_array_reorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all collapse buttons from objects and arrays.
    */
  var disable_collapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all Edit JSON buttons from objects.
    */
  var disable_edit_json: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, remove all Edit Properties buttons from objects.
    */
  var disable_properties: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, only required properties will be included by default.
    */
  var display_required_only: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The first part of the `name` attribute of form inputs in the editor. An full example name is `root[person][name]` where "root" is the form_name_root.
    */
  var form_name_root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon library to use for the editor.
    */
  var iconlib: js.UndefOr[
    jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap2 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap3 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation2 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation3 | jsonDashEditorLib.jsonDashEditorLibStrings.jqueryui | jsonDashEditorLib.jsonDashEditorLibStrings.fontawesome3 | jsonDashEditorLib.jsonDashEditorLibStrings.fontawesome4
  ] = js.undefined
  /**
    * If true, makes oneOf copy properties over when switching.
    */
  var keep_oneof_values: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, objects can only contain properties defined with the properties keyword.
    */
  var no_additional_properties: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object containing schema definitions for URLs. Allows you to pre-define external schemas.
    */
  var refs: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, all schemas that don't explicitly set the required property will be required.
    */
  var required_by_default: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A valid JSON Schema to use for the editor. Version 3 and Version 4 of the draft specification are supported.
    */
  var schema: js.UndefOr[js.Any] = js.undefined
  /**
    * When to show validation errors in the UI. Valid values are interaction, change, always, and never.
    */
  var show_errors: js.UndefOr[
    jsonDashEditorLib.jsonDashEditorLibStrings.interaction | jsonDashEditorLib.jsonDashEditorLibStrings.change | jsonDashEditorLib.jsonDashEditorLibStrings.always | jsonDashEditorLib.jsonDashEditorLibStrings.never
  ] = js.undefined
  /**
    * Seed the editor with an initial value. This should be valid against the editor's schema.
    */
  var startval: js.UndefOr[TValue] = js.undefined
  /**
    * The JS template engine to use.
    */
  var template: js.UndefOr[java.lang.String | Anon_Compile] = js.undefined
  /**
    * The CSS theme to use.
    */
  var theme: js.UndefOr[
    jsonDashEditorLib.jsonDashEditorLibStrings.barebones | jsonDashEditorLib.jsonDashEditorLibStrings.html | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap2 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap3 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap4 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation3 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation4 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation5 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation6 | jsonDashEditorLib.jsonDashEditorLibStrings.jqueryui
  ] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply[TValue](
    ajax: js.UndefOr[scala.Boolean] = js.undefined,
    disable_array_add: js.UndefOr[scala.Boolean] = js.undefined,
    disable_array_delete: js.UndefOr[scala.Boolean] = js.undefined,
    disable_array_reorder: js.UndefOr[scala.Boolean] = js.undefined,
    disable_collapse: js.UndefOr[scala.Boolean] = js.undefined,
    disable_edit_json: js.UndefOr[scala.Boolean] = js.undefined,
    disable_properties: js.UndefOr[scala.Boolean] = js.undefined,
    display_required_only: js.UndefOr[scala.Boolean] = js.undefined,
    form_name_root: java.lang.String = null,
    iconlib: jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap2 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap3 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation2 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation3 | jsonDashEditorLib.jsonDashEditorLibStrings.jqueryui | jsonDashEditorLib.jsonDashEditorLibStrings.fontawesome3 | jsonDashEditorLib.jsonDashEditorLibStrings.fontawesome4 = null,
    keep_oneof_values: js.UndefOr[scala.Boolean] = js.undefined,
    no_additional_properties: js.UndefOr[scala.Boolean] = js.undefined,
    refs: js.Any = null,
    required_by_default: js.UndefOr[scala.Boolean] = js.undefined,
    schema: js.Any = null,
    show_errors: jsonDashEditorLib.jsonDashEditorLibStrings.interaction | jsonDashEditorLib.jsonDashEditorLibStrings.change | jsonDashEditorLib.jsonDashEditorLibStrings.always | jsonDashEditorLib.jsonDashEditorLibStrings.never = null,
    startval: TValue = null,
    template: java.lang.String | Anon_Compile = null,
    theme: jsonDashEditorLib.jsonDashEditorLibStrings.barebones | jsonDashEditorLib.jsonDashEditorLibStrings.html | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap2 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap3 | jsonDashEditorLib.jsonDashEditorLibStrings.bootstrap4 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation3 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation4 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation5 | jsonDashEditorLib.jsonDashEditorLibStrings.foundation6 | jsonDashEditorLib.jsonDashEditorLibStrings.jqueryui = null
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

