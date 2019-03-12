package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ DetailButtonClickEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DetailButtonOptions {
  @scala.inline
  def apply(click: /* e */ DetailButtonClickEvent => scala.Unit = null, name: java.lang.String = null): DetailButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DetailButtonOptions]
  }
}

