package typings
package jpmLib.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends ItemMenuSeparator {
  var contentScript: java.lang.String | js.Array[java.lang.String]
  var contentScriptFile: java.lang.String | js.Array[java.lang.String]
  var context: ItemContext
  var image: java.lang.String | stdLib.URL
  var items: js.Array[ItemMenuSeparator]
  var label: java.lang.String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def addItem(item: ItemMenuSeparator): scala.Unit
  def destroy(): scala.Unit
  def removeItem(item: ItemMenuSeparator): scala.Unit
}

object Menu {
  @scala.inline
  def apply(
    addItem: ItemMenuSeparator => scala.Unit,
    contentScript: java.lang.String | js.Array[java.lang.String],
    contentScriptFile: java.lang.String | js.Array[java.lang.String],
    context: ItemContext,
    destroy: () => scala.Unit,
    image: java.lang.String | stdLib.URL,
    items: js.Array[ItemMenuSeparator],
    label: java.lang.String,
    removeItem: ItemMenuSeparator => scala.Unit,
    parentMenu: Menu = null
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context, destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], items = items, label = label, removeItem = js.Any.fromFunction1(removeItem))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Menu]
  }
}

