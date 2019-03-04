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
    addItem: js.Function1[ItemMenuSeparator, scala.Unit],
    contentScript: java.lang.String | js.Array[java.lang.String],
    contentScriptFile: java.lang.String | js.Array[java.lang.String],
    context: ItemContext,
    destroy: js.Function0[scala.Unit],
    image: java.lang.String | stdLib.URL,
    items: js.Array[ItemMenuSeparator],
    label: java.lang.String,
    removeItem: js.Function1[ItemMenuSeparator, scala.Unit],
    parentMenu: Menu = null
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = addItem, contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context, destroy = destroy, image = image.asInstanceOf[js.Any], items = items, label = label, removeItem = removeItem)
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Menu]
  }
}

