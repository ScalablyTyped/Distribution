package typings.kendoDashUi.kendo

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.Typeofui
import typings.kendoDashUi.TypeofuiActionSheet
import typings.kendoDashUi.TypeofuiArcGauge
import typings.kendoDashUi.kendo.ui.Widget
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

