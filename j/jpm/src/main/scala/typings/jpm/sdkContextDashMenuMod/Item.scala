package typings.jpm.sdkContextDashMenuMod

import typings.jpm.Anon_AccessKey
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends ItemMenuSeparator {
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var context: ItemContext
  var data: js.Any
  var image: String | URL
  var label: String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def destroy(): Unit
}

@JSImport("sdk/context-menu", "Item")
@js.native
object Item extends js.Object {
  def apply(options: Anon_AccessKey): Item = js.native
}

