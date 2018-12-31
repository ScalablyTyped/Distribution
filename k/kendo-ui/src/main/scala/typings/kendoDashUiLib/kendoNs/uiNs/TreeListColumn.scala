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

