package typings
package jqueryDashMouseDashExitLib.jqueryDashMouseDashExitMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def mouseExit(): JQuery = js.native
  def mouseExit(options: jqueryDashMouseDashExitLib.jqueryDashMouseDashExitMod.Options): JQuery = js.native
  @JSName("on")
  def on_mouseExit(
    event: jqueryDashMouseDashExitLib.jqueryDashMouseDashExitLibStrings.mouseExit,
    handler: js.Function2[
      /* event */ jqueryLib.JQueryNs.TriggeredEvent[stdLib.HTMLElement, _, _, _], 
      /* data */ jqueryDashMouseDashExitLib.jqueryDashMouseDashExitMod.FocusElements, 
      scala.Unit
    ]
  ): JQuery = js.native
}

