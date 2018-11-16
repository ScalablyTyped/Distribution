package typings
package jqueryDashFocusDashExitLib.jqueryDashFocusDashExitMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def focusExit(): JQuery = js.native
  def focusExit(options: jqueryDashFocusDashExitLib.Anon_Debug): JQuery = js.native
  @JSName("on")
  def on_focusExit(
    event: jqueryDashFocusDashExitLib.jqueryDashFocusDashExitLibStrings.focusExit,
    handler: js.Function2[
      /* event */ jqueryLib.JQueryNs.Event[stdLib.HTMLElement, scala.Null], 
      /* data */ jqueryDashFocusDashExitLib.jqueryDashFocusDashExitMod.FocusElements, 
      scala.Unit
    ]
  ): JQuery = js.native
  @JSName("one")
  def one_focusin(
    event: jqueryDashFocusDashExitLib.jqueryDashFocusDashExitLibStrings.focusin,
    handler: js.Function1[/* event */ jqueryLib.JQueryNs.Event[stdLib.HTMLElement, scala.Null], scala.Unit]
  ): JQuery = js.native
}

