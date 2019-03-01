package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PointOptions {
  @scala.inline
  def apply(name: java.lang.String = null): PointOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PointOptions]
  }
}

