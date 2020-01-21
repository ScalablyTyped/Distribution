package typings.jestRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVirtual extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object AnonVirtual {
  @scala.inline
  def apply(virtual: js.UndefOr[Boolean] = js.undefined): AnonVirtual = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVirtual]
  }
}

