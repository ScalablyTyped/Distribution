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

