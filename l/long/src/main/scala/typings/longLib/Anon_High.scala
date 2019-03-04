package typings
package longLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_High extends js.Object {
  var high: scala.Double
  var low: scala.Double
  var unsigned: scala.Boolean
}

object Anon_High {
  @scala.inline
  def apply(high: scala.Double, low: scala.Double, unsigned: scala.Boolean): Anon_High = {
    val __obj = js.Dynamic.literal(high = high, low = low, unsigned = unsigned)
  
    __obj.asInstanceOf[Anon_High]
  }
}

