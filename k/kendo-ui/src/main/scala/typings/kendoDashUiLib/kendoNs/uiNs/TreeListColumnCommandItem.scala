package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnCommandItem extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListColumnCommandItem {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    click: js.Function = null,
    imageClass: java.lang.String = null,
    name: java.lang.String = null,
    text: java.lang.String = null
  ): TreeListColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (click != null) __obj.updateDynamic("click")(click)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TreeListColumnCommandItem]
  }
}

