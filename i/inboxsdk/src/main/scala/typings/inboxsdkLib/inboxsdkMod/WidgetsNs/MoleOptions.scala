package typings
package inboxsdkLib.inboxsdkMod.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoleOptions extends js.Object {
  var chrome: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var el: stdLib.HTMLElement
  var minimizedTitleEl: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleButtons: js.UndefOr[js.Array[MoleButtonDescriptor]] = js.undefined
  var titleEl: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object MoleOptions {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    chrome: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    minimizedTitleEl: stdLib.HTMLElement = null,
    title: java.lang.String = null,
    titleButtons: js.Array[MoleButtonDescriptor] = null,
    titleEl: stdLib.HTMLElement = null
  ): MoleOptions = {
    val __obj = js.Dynamic.literal(el = el)
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome)
    if (className != null) __obj.updateDynamic("className")(className)
    if (minimizedTitleEl != null) __obj.updateDynamic("minimizedTitleEl")(minimizedTitleEl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleButtons != null) __obj.updateDynamic("titleButtons")(titleButtons)
    if (titleEl != null) __obj.updateDynamic("titleEl")(titleEl)
    __obj.asInstanceOf[MoleOptions]
  }
}

