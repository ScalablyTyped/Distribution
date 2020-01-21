package typings.jpm.contextMenuMod

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jpm.contextMenuMod.Item
  - typings.jpm.contextMenuMod.Menu
  - typings.jpm.contextMenuMod.Separator
*/
trait ItemMenuSeparator extends js.Object

object ItemMenuSeparator {
  @scala.inline
  def Item(
    context: ItemContext,
    data: js.Any,
    destroy: () => Unit,
    image: String | URL,
    label: String,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    parentMenu: Menu = null
  ): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  @scala.inline
  def Menu(
    addItem: ItemMenuSeparator => Unit,
    contentScript: String | js.Array[String],
    contentScriptFile: String | js.Array[String],
    context: ItemContext,
    destroy: () => Unit,
    image: String | URL,
    items: js.Array[ItemMenuSeparator],
    label: String,
    removeItem: ItemMenuSeparator => Unit,
    parentMenu: typings.jpm.contextMenuMod.Menu = null
  ): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  @scala.inline
  def Separator(destroy: () => Unit, parentMenu: Menu): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), parentMenu = parentMenu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemMenuSeparator]
  }
}

