package typings.jqueryMouseExit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  delay  :number}> */
trait Options extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(delay: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

