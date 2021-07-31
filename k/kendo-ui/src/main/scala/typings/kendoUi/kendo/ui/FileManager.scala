package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.FileManagerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManager
  extends StObject
     with Widget {
  
  var dataSource: DataSource = js.native
  
  def executeCommand(): Unit = js.native
  
  def getSelected(): Unit = js.native
  
  def getSize(): Unit = js.native
  
  def navigate(): Unit = js.native
  
  @JSName("options")
  var options_FileManager: FileManagerOptions = js.native
  
  def path(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setDataSource(dataSource: FileManagerDataSource): Unit = js.native
  
  def view(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
