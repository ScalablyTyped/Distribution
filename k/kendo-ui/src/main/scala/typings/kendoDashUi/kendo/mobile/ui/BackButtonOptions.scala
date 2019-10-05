package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ BackButtonClickEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object BackButtonOptions {
  @scala.inline
  def apply(click: /* e */ BackButtonClickEvent => Unit = null, name: String = null): BackButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BackButtonOptions]
  }
}

