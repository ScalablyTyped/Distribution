package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListToolbarItem extends js.Object {
  var click: js.UndefOr[js.Function] = js.undefined
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListToolbarItem {
  @scala.inline
  def apply(
    click: js.Function = null,
    imageClass: java.lang.String = null,
    name: java.lang.String = null,
    text: java.lang.String = null
  ): TreeListToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TreeListToolbarItem]
  }
}

