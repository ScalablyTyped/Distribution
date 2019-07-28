package typings.jpm.sdkContextDashMenuMod

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends ItemMenuSeparator {
  var contentScript: String | js.Array[String]
  var contentScriptFile: String | js.Array[String]
  var context: ItemContext
  var image: String | URL
  var items: js.Array[ItemMenuSeparator]
  var label: String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def addItem(item: ItemMenuSeparator): Unit
  def destroy(): Unit
  def removeItem(item: ItemMenuSeparator): Unit
}

object Menu {
  @scala.inline
  def apply(
    addItem: ItemMenuSeparator => Unit,
    contentScript: String | js.Array[String],
    contentScriptFile: String | js.Array[String],
    context: ItemContext,
    destroy: () => Unit,
    image: String | URL,
    items: js.Array[ItemMenuSeparator],
    label: String,
    removeItem: ItemMenuSeparator => Unit,
    parentMenu: Menu = null
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context, destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], items = items, label = label, removeItem = js.Any.fromFunction1(removeItem))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Menu]
  }
}

