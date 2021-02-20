package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends Widget {
  
  def applyFilter(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_Filter: FilterOptions = js.native
  
  var wrapper: JQuery = js.native
}
