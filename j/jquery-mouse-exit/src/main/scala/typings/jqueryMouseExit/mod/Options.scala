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
  def apply(delay: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

