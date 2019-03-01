package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait TabEvent extends js.Object {
  var header: js.Array[homeworksLib.JQuery]
  var index: scala.Double
  var length: scala.Double
}

object TabEvent {
  @scala.inline
  def apply(header: js.Array[homeworksLib.JQuery], index: scala.Double, length: scala.Double): TabEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[TabEvent]
  }
}

