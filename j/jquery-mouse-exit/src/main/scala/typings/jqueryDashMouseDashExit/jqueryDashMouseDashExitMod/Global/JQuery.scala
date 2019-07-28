package typings.jqueryDashMouseDashExit.jqueryDashMouseDashExitMod.Global

import typings.jquery.JQueryNs.TriggeredEvent
import typings.jqueryDashMouseDashExit.jqueryDashMouseDashExitMod.FocusElements
import typings.jqueryDashMouseDashExit.jqueryDashMouseDashExitMod.Options
import typings.jqueryDashMouseDashExit.jqueryDashMouseDashExitStrings.mouseExit
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def mouseExit(): JQuery = js.native
  def mouseExit(options: Options): JQuery = js.native
  @JSName("on")
  def on_mouseExit(
    event: mouseExit,
    handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
  ): JQuery = js.native
}

