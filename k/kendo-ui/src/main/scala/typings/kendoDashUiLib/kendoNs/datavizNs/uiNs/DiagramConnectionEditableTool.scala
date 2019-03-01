package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEditableTool extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionEditableTool {
  @scala.inline
  def apply(name: java.lang.String = null): DiagramConnectionEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DiagramConnectionEditableTool]
  }
}

