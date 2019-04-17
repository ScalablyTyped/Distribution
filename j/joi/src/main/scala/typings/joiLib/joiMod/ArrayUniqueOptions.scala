package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayUniqueOptions extends js.Object {
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
}

object ArrayUniqueOptions {
  @scala.inline
  def apply(ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
}

