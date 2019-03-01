package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewOptions extends js.Object {
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, scala.Unit]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, scala.Unit]] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, scala.Unit]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ModalViewOptions {
  @scala.inline
  def apply(
    beforeOpen: js.Function1[/* e */ ModalViewBeforeOpenEvent, scala.Unit] = null,
    close: js.Function1[/* e */ ModalViewCloseEvent, scala.Unit] = null,
    height: scala.Int | scala.Double = null,
    init: js.Function1[/* e */ ModalViewInitEvent, scala.Unit] = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    open: js.Function1[/* e */ ModalViewOpenEvent, scala.Unit] = null,
    width: scala.Int | scala.Double = null
  ): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (close != null) __obj.updateDynamic("close")(close)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalViewOptions]
  }
}

