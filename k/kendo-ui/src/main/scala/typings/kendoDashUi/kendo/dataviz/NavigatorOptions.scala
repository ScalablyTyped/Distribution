package typings.kendoDashUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object NavigatorOptions {
  @scala.inline
  def apply(name: String = null): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOptions]
  }
}

