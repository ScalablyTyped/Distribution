package typings.jestEnvironment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Virtual extends js.Object {
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object Virtual {
  @scala.inline
  def apply(virtual: js.UndefOr[Boolean] = js.undefined): Virtual = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Virtual]
  }
}

