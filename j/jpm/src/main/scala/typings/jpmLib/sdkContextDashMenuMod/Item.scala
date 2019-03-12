package typings
package jpmLib.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends ItemMenuSeparator {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var context: ItemContext
  var data: js.Any
  var image: java.lang.String | stdLib.URL
  var label: java.lang.String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def destroy(): scala.Unit
}

object Item {
  @scala.inline
  def apply(
    context: ItemContext,
    data: js.Any,
    destroy: () => scala.Unit,
    image: java.lang.String | stdLib.URL,
    label: java.lang.String,
    contentScript: java.lang.String | js.Array[java.lang.String] = null,
    contentScriptFile: java.lang.String | js.Array[java.lang.String] = null,
    parentMenu: Menu = null
  ): Item = {
    val __obj = js.Dynamic.literal(context = context, data = data, destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], label = label)
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    __obj.asInstanceOf[Item]
  }
}

