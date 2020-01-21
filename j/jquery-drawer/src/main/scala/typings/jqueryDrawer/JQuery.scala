package typings.jqueryDrawer

import typings.jqueryDrawer.jqueryDrawerStrings.close
import typings.jqueryDrawer.jqueryDrawerStrings.destroy
import typings.jqueryDrawer.jqueryDrawerStrings.drawerDotclosed
import typings.jqueryDrawer.jqueryDrawerStrings.drawerDotopened
import typings.jqueryDrawer.jqueryDrawerStrings.open
import typings.jqueryDrawer.jqueryDrawerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def drawer(): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  @JSName("drawer")
  def drawer_close(method: close): JQuery = js.native
  @JSName("drawer")
  def drawer_destroy(method: destroy): JQuery = js.native
  @JSName("drawer")
  def drawer_open(method: open): JQuery = js.native
  @JSName("drawer")
  def drawer_toggle(method: toggle): JQuery = js.native
  @JSName("on")
  def on_drawerclosed(event: drawerDotclosed, handler: js.Function0[Unit]): JQuery = js.native
  @JSName("on")
  def on_draweropened(event: drawerDotopened, handler: js.Function0[Unit]): JQuery = js.native
}

