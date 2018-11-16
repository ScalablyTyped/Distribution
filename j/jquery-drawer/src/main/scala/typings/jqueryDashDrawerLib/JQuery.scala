package typings
package jqueryDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def drawer(): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  @JSName("drawer")
  def drawer_close(method: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.close): JQuery = js.native
  @JSName("drawer")
  def drawer_destroy(method: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.destroy): JQuery = js.native
  @JSName("drawer")
  def drawer_open(method: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.open): JQuery = js.native
  @JSName("drawer")
  def drawer_toggle(method: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.toggle): JQuery = js.native
  @JSName("on")
  def on_drawerclosed(
    event: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.drawerDOTclosed,
    handler: js.Function0[scala.Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_draweropened(
    event: jqueryDashDrawerLib.jqueryDashDrawerLibStrings.drawerDOTopened,
    handler: js.Function0[scala.Unit]
  ): JQuery = js.native
}

