package typings.koaRatelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderNameOptions extends js.Object {
  /**
    * The amount of requests remaining in the current limiting period.
    */
  var remaining: String
  /**
    * The time, expressed as a UNIX epoch timestamp, at which your rate-limit expires.
    */
  var reset: String
  /**
    * The total amount of requests a client may make during a limiting period.
    */
  var total: String
}

object HeaderNameOptions {
  @scala.inline
  def apply(remaining: String, reset: String, total: String): HeaderNameOptions = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderNameOptions]
  }
}

