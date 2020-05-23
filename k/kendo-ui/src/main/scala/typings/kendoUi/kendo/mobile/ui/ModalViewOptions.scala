package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewOptions extends js.Object {
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, Unit]] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ModalViewOptions {
  @scala.inline
  def apply(
    beforeOpen: /* e */ ModalViewBeforeOpenEvent => Unit = null,
    close: /* e */ ModalViewCloseEvent => Unit = null,
    height: js.UndefOr[Double] = js.undefined,
    init: /* e */ ModalViewInitEvent => Unit = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    open: /* e */ ModalViewOpenEvent => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalViewOptions]
  }
}

