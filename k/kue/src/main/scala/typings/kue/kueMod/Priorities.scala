package typings.kue.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priorities extends js.Object {
  var critical: Double
  var high: Double
  var low: Double
  var medium: Double
  var normal: Double
}

object Priorities {
  @scala.inline
  def apply(critical: Double, high: Double, low: Double, medium: Double, normal: Double): Priorities = {
    val __obj = js.Dynamic.literal(critical = critical, high = high, low = low, medium = medium, normal = normal)
  
    __obj.asInstanceOf[Priorities]
  }
}

