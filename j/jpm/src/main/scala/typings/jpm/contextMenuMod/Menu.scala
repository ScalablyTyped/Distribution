package typings.jpm.contextMenuMod

import typings.jpm.anon.ContentScript
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends ItemMenuSeparator {
  
  def addItem(item: ItemMenuSeparator): Unit = js.native
  
  var contentScript: String | js.Array[String] = js.native
  
  var contentScriptFile: String | js.Array[String] = js.native
  
  var context: ItemContext = js.native
  
  def destroy(): Unit = js.native
  
  var image: String | URL = js.native
  
  var items: js.Array[ItemMenuSeparator] = js.native
  
  var label: String = js.native
  
  var parentMenu: js.UndefOr[Menu] = js.native
  
  def removeItem(item: ItemMenuSeparator): Unit = js.native
}
@JSImport("sdk/context-menu", "Menu")
@js.native
object Menu extends js.Object {
  
  def apply(options: ContentScript): Menu = js.native
}
