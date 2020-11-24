package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pager extends Widget {
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_Pager: PagerOptions = js.native
  
  def page(): Double = js.native
  def page(page: Double): Unit = js.native
  
  def pageSize(): Double = js.native
  
  def refresh(): Unit = js.native
  
  def totalPages(): Double = js.native
  
  var wrapper: JQuery = js.native
}
