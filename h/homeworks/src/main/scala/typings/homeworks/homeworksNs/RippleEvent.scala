package typings.homeworks.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait RippleEvent extends js.Object {
  var x: Double
  var y: Double
}

object RippleEvent {
  @scala.inline
  def apply(x: Double, y: Double): RippleEvent = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[RippleEvent]
  }
}

