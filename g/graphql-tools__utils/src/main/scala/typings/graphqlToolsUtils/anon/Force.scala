package typings.graphqlToolsUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Force extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object Force {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): Force = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

