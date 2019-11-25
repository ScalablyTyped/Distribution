package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var stops: js.UndefOr[js.Any] = js.undefined
}

object LinearGradientOptions {
  @scala.inline
  def apply(name: String = null, stops: js.Any = null): LinearGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientOptions]
  }
}

