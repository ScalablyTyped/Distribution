package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ColorOptions {
  @scala.inline
  def apply(name: String = null): ColorOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorOptions]
  }
}

