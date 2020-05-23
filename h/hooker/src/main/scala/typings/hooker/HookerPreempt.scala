package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookerPreempt extends IHookerPreHookResult {
  var value: js.Any
}

object HookerPreempt {
  @scala.inline
  def apply(value: js.Any): HookerPreempt = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerPreempt]
  }
}

