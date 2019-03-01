package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(name: java.lang.String = null): LayerOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LayerOptions]
  }
}

