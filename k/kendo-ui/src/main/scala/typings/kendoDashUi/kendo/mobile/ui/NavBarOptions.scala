package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object NavBarOptions {
  @scala.inline
  def apply(name: String = null): NavBarOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NavBarOptions]
  }
}

