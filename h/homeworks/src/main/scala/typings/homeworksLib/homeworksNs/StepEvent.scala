package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait StepEvent extends js.Object {
  var header: js.Array[homeworksLib.JQuery]
  var index: scala.Double
  var length: scala.Double
}

object StepEvent {
  @scala.inline
  def apply(header: js.Array[homeworksLib.JQuery], index: scala.Double, length: scala.Double): StepEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[StepEvent]
  }
}

