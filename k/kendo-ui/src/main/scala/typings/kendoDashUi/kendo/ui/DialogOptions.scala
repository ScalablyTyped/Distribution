package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var actions: js.UndefOr[js.Array[DialogAction]] = js.undefined
  var animation: js.UndefOr[Boolean | DialogAnimation] = js.undefined
  var buttonLayout: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DialogCloseEvent, Unit]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[DialogMessages] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean | DialogModal] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    actions: js.Array[DialogAction] = null,
    animation: Boolean | DialogAnimation = null,
    buttonLayout: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ DialogCloseEvent => Unit = null,
    content: String = null,
    height: Double | String = null,
    hide: /* e */ DialogEvent => Unit = null,
    initOpen: /* e */ DialogEvent => Unit = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    messages: DialogMessages = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    modal: Boolean | DialogModal = null,
    name: String = null,
    open: /* e */ DialogEvent => Unit = null,
    show: /* e */ DialogEvent => Unit = null,
    size: String = null,
    title: String | Boolean = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttonLayout != null) __obj.updateDynamic("buttonLayout")(buttonLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (initOpen != null) __obj.updateDynamic("initOpen")(js.Any.fromFunction1(initOpen))
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

