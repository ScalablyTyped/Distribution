package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookerFilter extends IHookerPreHookResult {
  var args: js.Array[_]
  var context: js.Any
}

object HookerFilter {
  @scala.inline
  def apply(args: js.Array[_], context: js.Any): HookerFilter = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerFilter]
  }
}

