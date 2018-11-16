package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Diagram")
@js.native
class Diagram protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DiagramOptions) = this()
  var connections: js.Array[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection] = js.native
  var connectionsDataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_Diagram: DiagramOptions = js.native
  var shapes: js.Array[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape] = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def addConnection(connection: js.Any, undoable: scala.Boolean): scala.Unit = js.native
  def addShape(obj: js.Any, undoable: scala.Boolean): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = js.native
  def alignShapes(direction: java.lang.String): scala.Unit = js.native
  def boundingBox(items: js.Any): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Rect = js.native
  def bringIntoView(obj: js.Any, options: js.Any): scala.Unit = js.native
  def cancelEdit(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def connect(source: js.Any, target: js.Any, options: js.Any): scala.Unit = js.native
  def connected(source: js.Any, target: js.Any): scala.Unit = js.native
  def copy(): scala.Unit = js.native
  def createConnection(item: js.Any): scala.Unit = js.native
  def createShape(item: js.Any): scala.Unit = js.native
  def cut(): scala.Unit = js.native
  def documentToModel(point: js.Any): js.Any = js.native
  def documentToView(point: js.Any): js.Any = js.native
  def edit(item: js.Any): scala.Unit = js.native
  def exportImage(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def focus(): scala.Unit = js.native
  def getConnectionByModelId(id: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection = js.native
  def getConnectionByModelId(id: scala.Double): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection = js.native
  def getConnectionByModelUid(uid: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection = js.native
  def getShapeById(id: java.lang.String): js.Any = js.native
  def getShapeByModelId(id: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = js.native
  def getShapeByModelId(id: scala.Double): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = js.native
  def getShapeByModelUid(uid: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape = js.native
  def layerToModel(point: js.Any): js.Any = js.native
  def layout(options: js.Any): scala.Unit = js.native
  def load(json: java.lang.String): scala.Unit = js.native
  def modelToDocument(point: js.Any): js.Any = js.native
  def modelToLayer(point: js.Any): js.Any = js.native
  def modelToView(point: js.Any): js.Any = js.native
  def pan(pan: js.Any): scala.Unit = js.native
  def paste(): scala.Unit = js.native
  def redo(): scala.Unit = js.native
  def remove(items: js.Any, undoable: scala.Boolean): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def saveAsPdf(): kendoDashUiLib.JQueryPromise[_] = js.native
  def saveEdit(): scala.Unit = js.native
  def select(): js.Any = js.native
  def select(elements: js.Any, options: js.Any): scala.Unit = js.native
  def select(elements: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Connection, options: js.Any): scala.Unit = js.native
  def select(elements: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Shape, options: js.Any): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def selectArea(rect: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Rect): scala.Unit = js.native
  def setConnectionsDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def toBack(items: js.Any, undoable: scala.Boolean): scala.Unit = js.native
  def toFront(items: js.Any, undoable: scala.Boolean): scala.Unit = js.native
  def transformPoint(p: js.Any): scala.Unit = js.native
  def transformRect(r: js.Any): scala.Unit = js.native
  def undo(): scala.Unit = js.native
  def viewToDocument(point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = js.native
  def viewToModel(point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = js.native
  def viewport(): kendoDashUiLib.kendoNs.datavizNs.diagramNs.Rect = js.native
  def zoom(): scala.Double = js.native
  def zoom(zoom: scala.Double, point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point): scala.Unit = js.native
}

@JSGlobal("kendo.dataviz.ui.Diagram")
@js.native
object Diagram extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.Diagram = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.Diagram = js.native
}

