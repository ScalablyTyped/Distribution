package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Filter: FilterOptions = js.native
  var wrapper: JQuery = js.native
  def applyFilter(): Unit = js.native
}

