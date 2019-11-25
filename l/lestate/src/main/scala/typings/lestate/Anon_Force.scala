package typings.lestate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var id: Double
  def selector(state: js.Any): js.Object
}

object Anon_Force {
  @scala.inline
  def apply(id: Double, selector: js.Any => js.Object, force: js.UndefOr[Boolean] = js.undefined): Anon_Force = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Force]
  }
}

