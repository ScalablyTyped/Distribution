package typings.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var isCaseSensitive: Boolean
}

object RouterOptions {
  @scala.inline
  def apply(isCaseSensitive: Boolean): RouterOptions = {
    val __obj = js.Dynamic.literal(isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

