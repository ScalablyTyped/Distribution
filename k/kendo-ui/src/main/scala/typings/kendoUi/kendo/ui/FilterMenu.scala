package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMenu extends Widget {
  var field: String = js.native
  @JSName("options")
  var options_FilterMenu: FilterMenuOptions = js.native
  var wrapper: JQuery = js.native
  def clear(): Unit = js.native
}

