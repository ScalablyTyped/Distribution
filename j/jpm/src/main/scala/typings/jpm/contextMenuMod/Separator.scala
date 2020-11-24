package typings.jpm.contextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Separator extends ItemMenuSeparator {
  
  def destroy(): Unit = js.native
  
  var parentMenu: Menu = js.native
}
@JSImport("sdk/context-menu", "Separator")
@js.native
object Separator extends js.Object {
  
  def apply(): Separator = js.native
}
