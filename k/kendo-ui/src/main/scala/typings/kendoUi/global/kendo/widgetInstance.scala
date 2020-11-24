package typings.kendoUi.global.kendo

import typings.kendoUi.JQuery
import typings.kendoUi.anon.Typeofui
import typings.kendoUi.anon.TypeofuiActionSheet
import typings.kendoUi.anon.TypeofuiArcGauge
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.widgetInstance")
@js.native
object widgetInstance extends js.Object {
  
  def apply(element: JQuery): Widget = js.native
  def apply(element: JQuery, suite: Typeofui): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiActionSheet): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiArcGauge): Widget = js.native
}
