package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priorities extends js.Object {
  var critical: scala.Double
  var high: scala.Double
  var low: scala.Double
  var medium: scala.Double
  var normal: scala.Double
}

object Priorities {
  @scala.inline
  def apply(
    critical: scala.Double,
    high: scala.Double,
    low: scala.Double,
    medium: scala.Double,
    normal: scala.Double
  ): Priorities = {
    val __obj = js.Dynamic.literal(critical = critical, high = high, low = low, medium = medium, normal = normal)
  
    __obj.asInstanceOf[Priorities]
  }
}

