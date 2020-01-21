package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, Unit]] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, Unit]] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, Unit]] = js.undefined
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.undefined
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.undefined
  var connectionsDataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, Unit]] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, Unit]] = js.undefined
  var editable: js.UndefOr[Boolean | DiagramEditable] = js.undefined
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, Unit]] = js.undefined
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, Unit]] = js.undefined
  var layout: js.UndefOr[DiagramLayout] = js.undefined
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, Unit]] = js.undefined
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, Unit]] = js.undefined
  var pannable: js.UndefOr[Boolean | DiagramPannable] = js.undefined
  var pdf: js.UndefOr[DiagramPdf] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, Unit]] = js.undefined
  var selectable: js.UndefOr[Boolean | DiagramSelectable] = js.undefined
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.undefined
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, Unit]] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, Unit]] = js.undefined
  var zoomMax: js.UndefOr[Double] = js.undefined
  var zoomMin: js.UndefOr[Double] = js.undefined
  var zoomRate: js.UndefOr[Double] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, Unit]] = js.undefined
}

object DiagramOptions {
  @scala.inline
  def apply(
    add: /* e */ DiagramAddEvent => Unit = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    cancel: /* e */ DiagramCancelEvent => Unit = null,
    change: /* e */ DiagramChangeEvent => Unit = null,
    click: /* e */ DiagramClickEvent => Unit = null,
    connectionDefaults: DiagramConnectionDefaults = null,
    connections: js.Array[DiagramConnection] = null,
    connectionsDataSource: js.Any | DataSource = null,
    dataBound: /* e */ DiagramDataBoundEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    drag: /* e */ DiagramDragEvent => Unit = null,
    dragEnd: /* e */ DiagramDragEndEvent => Unit = null,
    dragStart: /* e */ DiagramDragStartEvent => Unit = null,
    edit: /* e */ DiagramEditEvent => Unit = null,
    editable: Boolean | DiagramEditable = null,
    itemBoundsChange: /* e */ DiagramItemBoundsChangeEvent => Unit = null,
    itemRotate: /* e */ DiagramItemRotateEvent => Unit = null,
    layout: DiagramLayout = null,
    mouseEnter: /* e */ DiagramMouseEnterEvent => Unit = null,
    mouseLeave: /* e */ DiagramMouseLeaveEvent => Unit = null,
    name: String = null,
    pan: /* e */ DiagramPanEvent => Unit = null,
    pannable: Boolean | DiagramPannable = null,
    pdf: DiagramPdf = null,
    remove: /* e */ DiagramRemoveEvent => Unit = null,
    save: /* e */ DiagramSaveEvent => Unit = null,
    select: /* e */ DiagramSelectEvent => Unit = null,
    selectable: Boolean | DiagramSelectable = null,
    shapeDefaults: DiagramShapeDefaults = null,
    shapes: js.Array[DiagramShape] = null,
    template: String | js.Function = null,
    theme: String = null,
    toolBarClick: /* e */ DiagramToolBarClickEvent => Unit = null,
    zoom: Int | Double = null,
    zoomEnd: /* e */ DiagramZoomEndEvent => Unit = null,
    zoomMax: Int | Double = null,
    zoomMin: Int | Double = null,
    zoomRate: Int | Double = null,
    zoomStart: /* e */ DiagramZoomStartEvent => Unit = null
  ): DiagramOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (connectionDefaults != null) __obj.updateDynamic("connectionDefaults")(connectionDefaults.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (connectionsDataSource != null) __obj.updateDynamic("connectionsDataSource")(connectionsDataSource.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (itemBoundsChange != null) __obj.updateDynamic("itemBoundsChange")(js.Any.fromFunction1(itemBoundsChange))
    if (itemRotate != null) __obj.updateDynamic("itemRotate")(js.Any.fromFunction1(itemRotate))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction1(mouseEnter))
    if (mouseLeave != null) __obj.updateDynamic("mouseLeave")(js.Any.fromFunction1(mouseLeave))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (pannable != null) __obj.updateDynamic("pannable")(pannable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shapeDefaults != null) __obj.updateDynamic("shapeDefaults")(shapeDefaults.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (toolBarClick != null) __obj.updateDynamic("toolBarClick")(js.Any.fromFunction1(toolBarClick))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    if (zoomRate != null) __obj.updateDynamic("zoomRate")(zoomRate.asInstanceOf[js.Any])
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    __obj.asInstanceOf[DiagramOptions]
  }
}

