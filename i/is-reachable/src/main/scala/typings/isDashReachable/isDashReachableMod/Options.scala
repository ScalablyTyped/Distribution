package typings.isDashReachable.isDashReachableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Timeout in milliseconds after which a request is considered failed.
  		@default 5000
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(timeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

