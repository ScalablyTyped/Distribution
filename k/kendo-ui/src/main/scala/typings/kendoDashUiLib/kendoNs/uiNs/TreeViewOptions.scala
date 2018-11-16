package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeViewOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | TreeViewAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TreeViewEvent, scala.Unit]] = js.undefined
  var check: js.UndefOr[js.Function1[/* e */ TreeViewCheckEvent, scala.Unit]] = js.undefined
  var checkboxes: js.UndefOr[scala.Boolean | TreeViewCheckboxes] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TreeViewCollapseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeViewDataBoundEvent, scala.Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TreeViewDragEvent, scala.Unit]] = js.undefined
  var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TreeViewDragendEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeViewDragstartEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ TreeViewDropEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TreeViewExpandEvent, scala.Unit]] = js.undefined
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[TreeViewMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ TreeViewNavigateEvent, scala.Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TreeViewSelectEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

