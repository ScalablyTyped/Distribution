package typings
package laterLib.laterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifier extends TimePeriod {
  /**
    * Creates a new modified constraint.
    *
    * @param constraint: The constraint to be modified
    * @param value: The starting value of the after constraint
    */
  def apply(constraint: TimePeriod, value: scala.Double): TimePeriod = js.native
}

