package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.FileManager")
@js.native
class FileManager protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: FileManagerOptions) = this()
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
  def view(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.FileManager")
@js.native
object FileManager extends js.Object {
  var fn: FileManager = js.native
  def extend(proto: js.Object): FileManager = js.native
}

