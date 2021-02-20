package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollView extends Widget {
  
  def content(content: String): Unit = js.native
  def content(content: JQuery): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def next(): Unit = js.native
  
  @JSName("options")
  var options_ScrollView: ScrollViewOptions = js.native
  
  def prev(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def scrollTo(page: Double, instant: Boolean): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
