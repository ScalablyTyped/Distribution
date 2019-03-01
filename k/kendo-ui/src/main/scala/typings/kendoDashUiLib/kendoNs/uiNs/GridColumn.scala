package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumn extends js.Object {
  var aggregates: js.UndefOr[js.Any] = js.undefined
  var attributes: js.UndefOr[js.Any] = js.undefined
  var columns: js.UndefOr[js.Any] = js.undefined
  var command: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | GridColumnCommandItem | js.Array[GridColumnCommandItem]
  ] = js.undefined
  var editable: js.UndefOr[js.Function] = js.undefined
  var editor: js.UndefOr[
    js.Function2[
      /* container */ kendoDashUiLib.JQuery, 
      /* options */ GridColumnEditorOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var encoded: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | GridColumnFilterable] = js.undefined
  var footerAttributes: js.UndefOr[js.Any] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var groupFooterTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupHeaderColumnTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupable: js.UndefOr[scala.Boolean | GridColumnGroupable] = js.undefined
  var headerAttributes: js.UndefOr[js.Any] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var lockable: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var menu: js.UndefOr[scala.Boolean] = js.undefined
  var minResizableWidth: js.UndefOr[scala.Double] = js.undefined
  var minScreenWidth: js.UndefOr[scala.Double] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | GridColumnSortable] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object GridColumn {
  @scala.inline
  def apply(
    aggregates: js.Any = null,
    attributes: js.Any = null,
    columns: js.Any = null,
    command: java.lang.String | js.Array[java.lang.String] | GridColumnCommandItem | js.Array[GridColumnCommandItem] = null,
    editable: js.Function = null,
    editor: js.Function2[
      /* container */ kendoDashUiLib.JQuery, 
      /* options */ GridColumnEditorOptions, 
      scala.Unit
    ] = null,
    encoded: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    filterable: scala.Boolean | GridColumnFilterable = null,
    footerAttributes: js.Any = null,
    footerTemplate: java.lang.String | js.Function = null,
    format: java.lang.String = null,
    groupFooterTemplate: java.lang.String | js.Function = null,
    groupHeaderColumnTemplate: java.lang.String | js.Function = null,
    groupHeaderTemplate: java.lang.String | js.Function = null,
    groupable: scala.Boolean | GridColumnGroupable = null,
    headerAttributes: js.Any = null,
    headerTemplate: java.lang.String | js.Function = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    lockable: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null,
    menu: js.UndefOr[scala.Boolean] = js.undefined,
    minResizableWidth: scala.Int | scala.Double = null,
    minScreenWidth: scala.Int | scala.Double = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: scala.Boolean | GridColumnSortable = null,
    template: java.lang.String | js.Function = null,
    title: java.lang.String = null,
    values: js.Any = null,
    width: java.lang.String | scala.Double = null
  ): GridColumn = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (footerAttributes != null) __obj.updateDynamic("footerAttributes")(footerAttributes)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (groupFooterTemplate != null) __obj.updateDynamic("groupFooterTemplate")(groupFooterTemplate.asInstanceOf[js.Any])
    if (groupHeaderColumnTemplate != null) __obj.updateDynamic("groupHeaderColumnTemplate")(groupHeaderColumnTemplate.asInstanceOf[js.Any])
    if (groupHeaderTemplate != null) __obj.updateDynamic("groupHeaderTemplate")(groupHeaderTemplate.asInstanceOf[js.Any])
    if (groupable != null) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (headerAttributes != null) __obj.updateDynamic("headerAttributes")(headerAttributes)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (media != null) __obj.updateDynamic("media")(media)
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu)
    if (minResizableWidth != null) __obj.updateDynamic("minResizableWidth")(minResizableWidth.asInstanceOf[js.Any])
    if (minScreenWidth != null) __obj.updateDynamic("minScreenWidth")(minScreenWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumn]
  }
}

