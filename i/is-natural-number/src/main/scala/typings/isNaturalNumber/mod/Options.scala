package typings.isNaturalNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Setting this option true makes 0 regarded as a natural number.
    */
  var includeZero: Boolean
}

object Options {
  @scala.inline
  def apply(includeZero: Boolean): Options = {
    val __obj = js.Dynamic.literal(includeZero = includeZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

