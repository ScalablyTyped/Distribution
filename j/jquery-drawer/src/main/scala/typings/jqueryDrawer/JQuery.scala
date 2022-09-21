package typings.jqueryDrawer

import typings.jqueryDrawer.jqueryDrawerStrings.close
import typings.jqueryDrawer.jqueryDrawerStrings.destroy
import typings.jqueryDrawer.jqueryDrawerStrings.drawerDotclosed
import typings.jqueryDrawer.jqueryDrawerStrings.drawerDotopened
import typings.jqueryDrawer.jqueryDrawerStrings.open
import typings.jqueryDrawer.jqueryDrawerStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def drawer(): JQuery = js.native
  def drawer(method: open | close | toggle | destroy): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  
  def on(event: drawerDotopened | drawerDotclosed, handler: js.Function0[Unit]): JQuery = js.native
}
