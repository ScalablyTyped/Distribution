package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stops: js.UndefOr[js.Any] = js.undefined
}

object LinearGradientOptions {
  @scala.inline
  def apply(name: java.lang.String = null, stops: js.Any = null): LinearGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[LinearGradientOptions]
  }
}

