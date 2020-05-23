package typings.lestate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Force extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var id: Double
  def selector(state: js.Any): js.Object
}

object Force {
  @scala.inline
  def apply(id: Double, selector: js.Any => js.Object, force: js.UndefOr[Boolean] = js.undefined): Force = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

