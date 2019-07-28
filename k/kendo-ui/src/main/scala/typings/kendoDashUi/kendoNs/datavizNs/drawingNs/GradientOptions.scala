package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var stops: js.UndefOr[js.Any] = js.undefined
}

object GradientOptions {
  @scala.inline
  def apply(name: String = null, stops: js.Any = null): GradientOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[GradientOptions]
  }
}

