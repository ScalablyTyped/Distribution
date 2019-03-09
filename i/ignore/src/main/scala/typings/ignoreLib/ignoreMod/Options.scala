package typings
package ignoreLib.ignoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignorecase: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(ignorecase: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorecase)) __obj.updateDynamic("ignorecase")(ignorecase)
    __obj.asInstanceOf[Options]
  }
}

