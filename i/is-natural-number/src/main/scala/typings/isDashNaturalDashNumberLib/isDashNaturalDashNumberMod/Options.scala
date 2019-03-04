package typings
package isDashNaturalDashNumberLib.isDashNaturalDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Setting this option true makes 0 regarded as a natural number.
    */
  var includeZero: scala.Boolean
}

object Options {
  @scala.inline
  def apply(includeZero: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal(includeZero = includeZero)
  
    __obj.asInstanceOf[Options]
  }
}

