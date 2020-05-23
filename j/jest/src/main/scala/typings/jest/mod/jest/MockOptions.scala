package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptions extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object MockOptions {
  @scala.inline
  def apply(virtual: js.UndefOr[Boolean] = js.undefined): MockOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptions]
  }
}

