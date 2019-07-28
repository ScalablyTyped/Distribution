package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminOptions extends js.Object {
  var retry: js.UndefOr[RetryOptions] = js.undefined
}

object AdminOptions {
  @scala.inline
  def apply(retry: RetryOptions = null): AdminOptions = {
    val __obj = js.Dynamic.literal()
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[AdminOptions]
  }
}

