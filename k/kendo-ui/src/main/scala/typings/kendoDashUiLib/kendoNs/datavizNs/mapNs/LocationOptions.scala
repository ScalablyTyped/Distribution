package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(name: java.lang.String = null): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LocationOptions]
  }
}

