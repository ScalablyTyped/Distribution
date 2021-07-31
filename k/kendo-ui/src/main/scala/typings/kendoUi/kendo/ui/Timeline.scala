package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline
  extends StObject
     with Widget {
  
  def collapse(event: String): Unit = js.native
  def collapse(event: JQuery): Unit = js.native
  def collapse(event: Element): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def expand(event: String): Unit = js.native
  def expand(event: JQuery): Unit = js.native
  def expand(event: Element): Unit = js.native
  
  def next(): Unit = js.native
  
  def open(event: String): Unit = js.native
  def open(event: JQuery): Unit = js.native
  def open(event: Element): Unit = js.native
  
  @JSName("options")
  var options_Timeline: TimelineOptions = js.native
  
  def previous(): Unit = js.native
  
  def redraw(): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
