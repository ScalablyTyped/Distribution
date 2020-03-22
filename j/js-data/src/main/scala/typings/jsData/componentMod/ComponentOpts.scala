package typings.jsData.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOpts extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
}

object ComponentOpts {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined): ComponentOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOpts]
  }
}

