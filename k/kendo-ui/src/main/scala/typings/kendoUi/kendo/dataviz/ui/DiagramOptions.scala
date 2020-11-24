package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramOptions extends js.Object {
  
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, Unit]] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, Unit]] = js.native
  
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, Unit]] = js.native
  
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.native
  
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.native
  
  var connectionsDataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, Unit]] = js.native
  
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, Unit]] = js.native
  
  var editable: js.UndefOr[Boolean | DiagramEditable] = js.native
  
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, Unit]] = js.native
  
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, Unit]] = js.native
  
  var layout: js.UndefOr[DiagramLayout] = js.native
  
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, Unit]] = js.native
  
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, Unit]] = js.native
  
  var pannable: js.UndefOr[Boolean | DiagramPannable] = js.native
  
  var pdf: js.UndefOr[DiagramPdf] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, Unit]] = js.native
  
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, Unit]] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, Unit]] = js.native
  
  var selectable: js.UndefOr[Boolean | DiagramSelectable] = js.native
  
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.native
  
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, Unit]] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, Unit]] = js.native
  
  var zoomMax: js.UndefOr[Double] = js.native
  
  var zoomMin: js.UndefOr[Double] = js.native
  
  var zoomRate: js.UndefOr[Double] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, Unit]] = js.native
}
object DiagramOptions {
  
  @scala.inline
  def apply(): DiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramOptions]
  }
  
  @scala.inline
  implicit class DiagramOptionsOps[Self <: DiagramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: /* e */ DiagramAddEvent => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ DiagramCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DiagramChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ DiagramClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setConnectionDefaults(value: DiagramConnectionDefaults): Self = this.set("connectionDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDefaults: Self = this.set("connectionDefaults", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: DiagramConnection*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[DiagramConnection]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setConnectionsDataSource(value: js.Any | DataSource): Self = this.set("connectionsDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionsDataSource: Self = this.set("connectionsDataSource", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ DiagramDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DiagramDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragEnd(value: /* e */ DiagramDragEndEvent => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ DiagramDragStartEvent => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ DiagramEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | DiagramEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setItemBoundsChange(value: /* e */ DiagramItemBoundsChangeEvent => Unit): Self = this.set("itemBoundsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemBoundsChange: Self = this.set("itemBoundsChange", js.undefined)
    
    @scala.inline
    def setItemRotate(value: /* e */ DiagramItemRotateEvent => Unit): Self = this.set("itemRotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemRotate: Self = this.set("itemRotate", js.undefined)
    
    @scala.inline
    def setLayout(value: DiagramLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMouseEnter(value: /* e */ DiagramMouseEnterEvent => Unit): Self = this.set("mouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseEnter: Self = this.set("mouseEnter", js.undefined)
    
    @scala.inline
    def setMouseLeave(value: /* e */ DiagramMouseLeaveEvent => Unit): Self = this.set("mouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseLeave: Self = this.set("mouseLeave", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPan(value: /* e */ DiagramPanEvent => Unit): Self = this.set("pan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setPannable(value: Boolean | DiagramPannable): Self = this.set("pannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePannable: Self = this.set("pannable", js.undefined)
    
    @scala.inline
    def setPdf(value: DiagramPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ DiagramRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ DiagramSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ DiagramSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | DiagramSelectable): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShapeDefaults(value: DiagramShapeDefaults): Self = this.set("shapeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeDefaults: Self = this.set("shapeDefaults", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: DiagramShape*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[DiagramShape]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setToolBarClick(value: /* e */ DiagramToolBarClickEvent => Unit): Self = this.set("toolBarClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolBarClick: Self = this.set("toolBarClick", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomEnd(value: /* e */ DiagramZoomEndEvent => Unit): Self = this.set("zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMax: Self = this.set("zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMin: Self = this.set("zoomMin", js.undefined)
    
    @scala.inline
    def setZoomRate(value: Double): Self = this.set("zoomRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomRate: Self = this.set("zoomRate", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ DiagramZoomStartEvent => Unit): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
  }
}
