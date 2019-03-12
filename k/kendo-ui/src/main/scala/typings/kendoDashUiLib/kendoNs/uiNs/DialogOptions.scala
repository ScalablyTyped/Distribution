package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var actions: js.UndefOr[js.Array[DialogAction]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | DialogAnimation] = js.undefined
  var buttonLayout: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DialogCloseEvent, scala.Unit]] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[DialogMessages] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean | DialogModal] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    actions: js.Array[DialogAction] = null,
    animation: scala.Boolean | DialogAnimation = null,
    buttonLayout: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    close: /* e */ DialogCloseEvent => scala.Unit = null,
    content: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    hide: /* e */ DialogEvent => scala.Unit = null,
    initOpen: /* e */ DialogEvent => scala.Unit = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    messages: DialogMessages = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    modal: scala.Boolean | DialogModal = null,
    name: java.lang.String = null,
    open: /* e */ DialogEvent => scala.Unit = null,
    show: /* e */ DialogEvent => scala.Unit = null,
    size: java.lang.String = null,
    title: java.lang.String | scala.Boolean = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonLayout != null) __obj.updateDynamic("buttonLayout")(buttonLayout)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (content != null) __obj.updateDynamic("content")(content)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (initOpen != null) __obj.updateDynamic("initOpen")(js.Any.fromFunction1(initOpen))
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

