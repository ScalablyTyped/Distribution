package typings.jpm.sdkContextDashMenuMod

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

object Item {
  @scala.inline
  def apply(
    context: ItemContext,
    data: js.Any,
    destroy: () => Unit,
    image: String | URL,
    label: String,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    parentMenu: Menu = null
  ): Item = {
    val __obj = js.Dynamic.literal(context = context, data = data, destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], label = label)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Item]
  }
}

