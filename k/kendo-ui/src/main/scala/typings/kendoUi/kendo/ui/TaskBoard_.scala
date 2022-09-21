package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.ObservableObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskBoard_
  extends StObject
     with Widget {
  
  def addCard(data: Any): Unit = js.native
  
  def addColumn(data: Any): Unit = js.native
  
  def columnByStatus(status: String): JQuery = js.native
  
  def columnDataItem(columnElm: JQuery): ObservableObject = js.native
  
  def columns(): JQuery = js.native
  
  var columnsDataSource: DataSource = js.native
  
  def dataItem(cardElm: JQuery): ObservableObject = js.native
  
  var dataSource: DataSource = js.native
  
  def deleteCard(cardElm: JQuery): Unit = js.native
  
  def deleteColumn(columnElm: JQuery): Unit = js.native
  
  def editCard(cardElm: JQuery): Unit = js.native
  
  def editColumn(columnElm: JQuery): Unit = js.native
  
  def enable(cardElm: JQuery): Unit = js.native
  
  def enableByColumn(columnElm: JQuery, state: Boolean): Unit = js.native
  
  def items(): JQuery = js.native
  
  def itemsByColumn(columnElm: JQuery): JQuery = js.native
  
  def itemsByStatus(status: String): JQuery = js.native
  
  def load(): Unit = js.native
  
  @JSName("options")
  var options_TaskBoard_ : TaskBoardOptions = js.native
  
  def previewCard(cardElm: JQuery): Unit = js.native
  
  def readOnly(cardElm: JQuery): Unit = js.native
  
  def readOnlyByColumn(columnElm: JQuery, state: Boolean): Unit = js.native
  
  def registerShortcut(selector: String, shortcut: Any, options: Any): Unit = js.native
  
  def saveCard(): Unit = js.native
  
  def saveColumn(): Unit = js.native
  
  def select(cardElm: JQuery): JQuery = js.native
  
  def setColumnsDataSource(dataSource: Any): Unit = js.native
  def setColumnsDataSource(dataSource: DataSource): Unit = js.native
  
  def setDataSource(dataSource: Any): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
