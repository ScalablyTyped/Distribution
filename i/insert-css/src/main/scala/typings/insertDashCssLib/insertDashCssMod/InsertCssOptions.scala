package typings
package insertDashCssLib.insertDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCssOptions extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var prepend: js.UndefOr[scala.Boolean] = js.undefined
}

object InsertCssOptions {
  @scala.inline
  def apply(container: stdLib.HTMLElement = null, prepend: js.UndefOr[scala.Boolean] = js.undefined): InsertCssOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend)
    __obj.asInstanceOf[InsertCssOptions]
  }
}

