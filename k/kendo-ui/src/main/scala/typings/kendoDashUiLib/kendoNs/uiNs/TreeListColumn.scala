package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumn extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var columns: js.UndefOr[js.Any] = js.undefined
  var command: js.UndefOr[js.Array[TreeListColumnCommandItem]] = js.undefined
  var editable: js.UndefOr[js.Function] = js.undefined
  var editor: js.UndefOr[
    js.Function2[
      /* container */ kendoDashUiLib.JQuery, 
      /* options */ TreeListEditorOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var encoded: js.UndefOr[scala.Boolean] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | TreeListColumnFilterable] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var headerAttributes: js.UndefOr[js.Any] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var lockable: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var menu: js.UndefOr[scala.Boolean] = js.undefined
  var minScreenWidth: js.UndefOr[scala.Double] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | TreeListColumnSortable] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object TreeListColumn {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    columns: js.Any = null,
    command: js.Array[TreeListColumnCommandItem] = null,
    editable: js.Function = null,
    editor: js.Function2[
      /* container */ kendoDashUiLib.JQuery, 
      /* options */ TreeListEditorOptions, 
      scala.Unit
    ] = null,
    encoded: js.UndefOr[scala.Boolean] = js.undefined,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    filterable: scala.Boolean | TreeListColumnFilterable = null,
    footerTemplate: java.lang.String | js.Function = null,
    format: java.lang.String = null,
    headerAttributes: js.Any = null,
    headerTemplate: java.lang.String | js.Function = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    lockable: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    menu: js.UndefOr[scala.Boolean] = js.undefined,
    minScreenWidth: scala.Int | scala.Double = null,
    sortable: scala.Boolean | TreeListColumnSortable = null,
    template: java.lang.String | js.Function = null,
    title: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): TreeListColumn = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (command != null) __obj.updateDynamic("command")(command)
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (headerAttributes != null) __obj.updateDynamic("headerAttributes")(headerAttributes)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu)
    if (minScreenWidth != null) __obj.updateDynamic("minScreenWidth")(minScreenWidth.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumn]
  }
}

