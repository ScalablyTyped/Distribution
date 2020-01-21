package typings.inversifyExpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var route: String
}

object AnonArgs {
  @scala.inline
  def apply(route: String, args: js.Array[String] = null): AnonArgs = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

