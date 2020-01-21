package typings.inboxsdk.mod.Widgets

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoleOptions extends js.Object {
  var chrome: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var el: HTMLElement
  var minimizedTitleEl: js.UndefOr[HTMLElement] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleButtons: js.UndefOr[js.Array[MoleButtonDescriptor]] = js.undefined
  var titleEl: js.UndefOr[HTMLElement] = js.undefined
}

object MoleOptions {
  @scala.inline
  def apply(
    el: HTMLElement,
    chrome: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    minimizedTitleEl: HTMLElement = null,
    title: String = null,
    titleButtons: js.Array[MoleButtonDescriptor] = null,
    titleEl: HTMLElement = null
  ): MoleOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (minimizedTitleEl != null) __obj.updateDynamic("minimizedTitleEl")(minimizedTitleEl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleButtons != null) __obj.updateDynamic("titleButtons")(titleButtons.asInstanceOf[js.Any])
    if (titleEl != null) __obj.updateDynamic("titleEl")(titleEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoleOptions]
  }
}

