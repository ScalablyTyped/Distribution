package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait RippleEvent extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object RippleEvent {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): RippleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[RippleEvent]
  }
}

