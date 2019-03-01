package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ColorOptions {
  @scala.inline
  def apply(name: java.lang.String = null): ColorOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ColorOptions]
  }
}

