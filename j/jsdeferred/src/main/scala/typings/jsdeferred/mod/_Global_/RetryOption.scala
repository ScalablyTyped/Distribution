package typings.jsdeferred.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOption extends js.Object {
  @JSName("wait")
  var wait_FRetryOption: Double
}

object RetryOption {
  @scala.inline
  def apply(wait: Double): RetryOption = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOption]
  }
}

