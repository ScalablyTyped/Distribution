package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.dataviz.diagram.Connection
import typings.kendoUi.kendo.dataviz.diagram.Point
import typings.kendoUi.kendo.dataviz.diagram.Rect
import typings.kendoUi.kendo.dataviz.diagram.Shape
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagram
  extends StObject
     with Widget {
  
  def addConnection(connection: Any, undoable: Boolean): Unit = js.native
  
  def addShape(obj: Any, undoable: Boolean): Shape = js.native
  
  def alignShapes(direction: String): Unit = js.native
  
  def boundingBox(items: Any): Rect = js.native
  
  def bringIntoView(obj: Any, options: Any): Unit = js.native
  
  def cancelEdit(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def connect(source: Any, target: Any, options: Any): Unit = js.native
  
  def connected(source: Any, target: Any): Unit = js.native
  
  var connections: js.Array[Connection] = js.native
  
  var connectionsDataSource: DataSource = js.native
  
  def copy(): Unit = js.native
  
  def createConnection(item: Any): Unit = js.native
  
  def createShape(item: Any): Unit = js.native
  
  def cut(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def documentToModel(point: Any): Any = js.native
  
  def documentToView(point: Any): Any = js.native
  
  def edit(item: Any): Unit = js.native
  
  def exportImage(options: Any): JQueryPromise[Any] = js.native
  
  def exportPDF(): JQueryPromise[Any] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[Any] = js.native
  
  def exportSVG(options: Any): JQueryPromise[Any] = js.native
  
  def focus(): Unit = js.native
  
  def getConnectionByModelId(id: String): Connection = js.native
  def getConnectionByModelId(id: Double): Connection = js.native
  
  def getConnectionByModelUid(uid: String): Connection = js.native
  
  def getShapeById(id: String): Any = js.native
  
  def getShapeByModelId(id: String): Shape = js.native
  def getShapeByModelId(id: Double): Shape = js.native
  
  def getShapeByModelUid(uid: String): Shape = js.native
  
  def layerToModel(point: Any): Any = js.native
  
  def layout(options: Any): Unit = js.native
  
  def load(json: String): Unit = js.native
  
  def modelToDocument(point: Any): Any = js.native
  
  def modelToLayer(point: Any): Any = js.native
  
  def modelToView(point: Any): Any = js.native
  
  @JSName("options")
  var options_Diagram: DiagramOptions = js.native
  
  def pan(pan: Any): Unit = js.native
  
  def paste(): Unit = js.native
  
  def redo(): Unit = js.native
  
  def remove(items: Any, undoable: Boolean): Unit = js.native
  
  def save(): Unit = js.native
  
  def saveAsPdf(): JQueryPromise[Any] = js.native
  
  def saveEdit(): Unit = js.native
  
  def select(): Any = js.native
  def select(elements: Any, options: Any): Unit = js.native
  def select(elements: Connection, options: Any): Unit = js.native
  def select(elements: Shape, options: Any): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def selectArea(rect: Rect): Unit = js.native
  
  def setConnectionsDataSource(dataSource: DataSource): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var shapes: js.Array[Shape] = js.native
  
  def toBack(items: Any, undoable: Boolean): Unit = js.native
  
  def toFront(items: Any, undoable: Boolean): Unit = js.native
  
  def transformPoint(p: Any): Unit = js.native
  
  def transformRect(r: Any): Unit = js.native
  
  def undo(): Unit = js.native
  
  def viewToDocument(point: Point): Point = js.native
  
  def viewToModel(point: Point): Point = js.native
  
  def viewport(): Rect = js.native
  
  var wrapper: JQuery = js.native
  
  def zoom(): Double = js.native
  def zoom(zoom: Double, point: Point): Unit = js.native
}
