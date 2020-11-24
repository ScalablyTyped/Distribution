package typings.jpm.contextMenuMod

import typings.jpm.anon.AccessKey
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends ItemMenuSeparator {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var context: ItemContext = js.native
  
  var data: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var image: String | URL = js.native
  
  var label: String = js.native
  
  var parentMenu: js.UndefOr[Menu] = js.native
}
@JSImport("sdk/context-menu", "Item")
@js.native
object Item extends js.Object {
  
  def apply(options: AccessKey): Item = js.native
}
