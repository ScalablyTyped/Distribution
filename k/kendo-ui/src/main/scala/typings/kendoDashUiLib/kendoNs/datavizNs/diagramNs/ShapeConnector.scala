package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnector extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[js.Function] = js.undefined
}

object ShapeConnector {
  @scala.inline
  def apply(description: java.lang.String = null, name: java.lang.String = null, position: js.Function = null): ShapeConnector = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ShapeConnector]
  }
}

