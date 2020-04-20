package typings.kue.mod

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
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priorities]
  }
}

