package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.FileManagerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManager extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_FileManager: FileManagerOptions = js.native
  var wrapper: JQuery = js.native
  def executeCommand(): Unit = js.native
  def getSelected(): Unit = js.native
  def getSize(): Unit = js.native
  def navigate(): Unit = js.native
  def path(): Unit = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: FileManagerDataSource): Unit = js.native
  def view(): Unit = js.native
}

