package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumn extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var columns: js.UndefOr[js.Any] = js.undefined
  var command: js.UndefOr[js.Array[TreeListColumnCommandItem]] = js.undefined
  var editable: js.UndefOr[js.Function] = js.undefined
  var editor: js.UndefOr[js.Function2[/* container */ JQuery, /* options */ TreeListEditorOptions, Unit]] = js.undefined
  var encoded: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var filterable: js.UndefOr[Boolean | TreeListColumnFilterable] = js.undefined
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var headerAttributes: js.UndefOr[js.Any] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var lockable: js.UndefOr[Boolean] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var menu: js.UndefOr[Boolean] = js.undefined
  var minScreenWidth: js.UndefOr[Double] = js.undefined
  var sortable: js.UndefOr[Boolean | TreeListColumnSortable] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object TreeListColumn {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    columns: js.Any = null,
    command: js.Array[TreeListColumnCommandItem] = null,
    editable: js.Function = null,
    editor: (/* container */ JQuery, /* options */ TreeListEditorOptions) => Unit = null,
    encoded: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filterable: Boolean | TreeListColumnFilterable = null,
    footerTemplate: String | js.Function = null,
    format: String = null,
    headerAttributes: js.Any = null,
    headerTemplate: String | js.Function = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    lockable: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    menu: js.UndefOr[Boolean] = js.undefined,
    minScreenWidth: Int | Double = null,
    sortable: Boolean | TreeListColumnSortable = null,
    template: String | js.Function = null,
    title: String = null,
    width: String | Double = null
  ): TreeListColumn = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (command != null) __obj.updateDynamic("command")(command)
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (editor != null) __obj.updateDynamic("editor")(js.Any.fromFunction2(editor))
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

