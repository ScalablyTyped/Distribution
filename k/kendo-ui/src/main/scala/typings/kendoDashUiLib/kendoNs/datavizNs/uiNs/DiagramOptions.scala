package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, scala.Unit]] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, scala.Unit]] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, scala.Unit]] = js.undefined
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.undefined
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.undefined
  var connectionsDataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, scala.Unit]] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | DiagramEditable] = js.undefined
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, scala.Unit]] = js.undefined
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, scala.Unit]] = js.undefined
  var layout: js.UndefOr[DiagramLayout] = js.undefined
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, scala.Unit]] = js.undefined
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, scala.Unit]] = js.undefined
  var pannable: js.UndefOr[scala.Boolean | DiagramPannable] = js.undefined
  var pdf: js.UndefOr[DiagramPdf] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, scala.Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, scala.Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | DiagramSelectable] = js.undefined
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.undefined
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, scala.Unit]] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, scala.Unit]] = js.undefined
  var zoomMax: js.UndefOr[scala.Double] = js.undefined
  var zoomMin: js.UndefOr[scala.Double] = js.undefined
  var zoomRate: js.UndefOr[scala.Double] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, scala.Unit]] = js.undefined
}

