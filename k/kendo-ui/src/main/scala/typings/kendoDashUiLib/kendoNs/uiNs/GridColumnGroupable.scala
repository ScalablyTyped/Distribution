package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnGroupable extends js.Object {
  var compare: js.UndefOr[js.Function] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
}

object GridColumnGroupable {
  @scala.inline
  def apply(compare: js.Function = null, dir: java.lang.String = null): GridColumnGroupable = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    __obj.asInstanceOf[GridColumnGroupable]
  }
}

