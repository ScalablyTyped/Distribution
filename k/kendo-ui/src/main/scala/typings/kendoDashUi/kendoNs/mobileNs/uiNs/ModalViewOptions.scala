package typings.kendoDashUi.kendoNs.mobileNs.uiNs

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
    height: Int | Double = null,
    init: /* e */ ModalViewInitEvent => Unit = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    open: /* e */ ModalViewOpenEvent => Unit = null,
    width: Int | Double = null
  ): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalViewOptions]
  }
}

