package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookerOverride
  extends IHookerPostHookResult
     with IHookerPreHookResult {
  var value: js.Any
}

object HookerOverride {
  @scala.inline
  def apply(value: js.Any): HookerOverride = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerOverride]
  }
}

