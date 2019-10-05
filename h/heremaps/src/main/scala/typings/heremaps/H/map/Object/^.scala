package typings.heremaps.H.map.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.map.Object")
@js.native
object ^ extends js.Object {
  /**
    * Compares two objects regarding their z-order, useful to sort a list of objects via Array's sort() method
    * @param first {H.map.Object} - The first object to compare
    * @param second {H.map.Object} - The second object to compare
    * @returns {number} - If less then 0 the first object has a lower z-order. If equal 0 booth objects have the same z-order. If greater then 0 the first object has a higher z-order.
    */
  def compareZOrder(first: typings.heremaps.H.map.Object, second: typings.heremaps.H.map.Object): Double = js.native
}

