package typings
package koaDashRatelimitLib.koaDashRatelimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderNameOptions extends js.Object {
  /**
    * The amount of requests remaining in the current limiting period.
    */
  var remaining: java.lang.String
  /**
    * The time, expressed as a UNIX epoch timestamp, at which your rate-limit expires.
    */
  var reset: java.lang.String
  /**
    * The total amount of requests a client may make during a limiting period.
    */
  var total: java.lang.String
}

object HeaderNameOptions {
  @scala.inline
  def apply(remaining: java.lang.String, reset: java.lang.String, total: java.lang.String): HeaderNameOptions = {
    val __obj = js.Dynamic.literal(remaining = remaining, reset = reset, total = total)
  
    __obj.asInstanceOf[HeaderNameOptions]
  }
}

