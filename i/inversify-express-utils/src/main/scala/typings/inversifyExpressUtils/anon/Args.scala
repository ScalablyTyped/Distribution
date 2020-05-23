package typings.inversifyExpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var route: String
}

object Args {
  @scala.inline
  def apply(route: String, args: js.Array[String] = null): Args = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

