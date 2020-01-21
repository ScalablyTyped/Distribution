package typings.kendoUi.kendo

import typings.kendoUi.JQuery
import typings.kendoUi.Typeofui
import typings.kendoUi.TypeofuiActionSheet
import typings.kendoUi.TypeofuiArcGauge
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.widgetInstance")
@js.native
object widgetInstance extends js.Object {
  def apply(element: JQuery): Widget = js.native
  def apply(element: JQuery, suite: Typeofui): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiActionSheet): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiArcGauge): Widget = js.native
}

