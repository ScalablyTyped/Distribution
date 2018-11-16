package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ActionSheet")
@js.native
class ActionSheet protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ActionSheetOptions) = this()
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def open(target: kendoDashUiLib.JQuery, context: js.Any): scala.Unit = js.native
}

@JSGlobal("kendo.mobile.ui.ActionSheet")
@js.native
object ActionSheet extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.ActionSheet = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.ActionSheet = js.native
}

