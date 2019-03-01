package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object RectOptions {
  @scala.inline
  def apply(name: java.lang.String = null): RectOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RectOptions]
  }
}

