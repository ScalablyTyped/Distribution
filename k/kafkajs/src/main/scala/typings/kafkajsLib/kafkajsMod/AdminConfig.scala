package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfig extends js.Object {
  var retry: js.UndefOr[RetryOptions] = js.undefined
}

object AdminConfig {
  @scala.inline
  def apply(retry: RetryOptions = null): AdminConfig = {
    val __obj = js.Dynamic.literal()
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[AdminConfig]
  }
}

