package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ActionSheetOpenEvent, scala.Unit]] = js.undefined
  var popup: js.UndefOr[ActionSheetPopup] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    close: /* e */ ActionSheetEvent => scala.Unit = null,
    name: java.lang.String = null,
    open: /* e */ ActionSheetOpenEvent => scala.Unit = null,
    popup: ActionSheetPopup = null,
    `type`: java.lang.String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

