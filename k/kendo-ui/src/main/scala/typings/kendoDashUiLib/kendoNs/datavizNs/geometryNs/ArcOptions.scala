package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ArcOptions {
  @scala.inline
  def apply(name: java.lang.String = null): ArcOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ArcOptions]
  }
}

