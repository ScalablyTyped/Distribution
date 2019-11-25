package typings.homeworks.homeworks

import typings.homeworks.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
trait TabEvent extends js.Object {
  var header: js.Array[JQuery]
  var index: Double
  var length: Double
}

object TabEvent {
  @scala.inline
  def apply(header: js.Array[JQuery], index: Double, length: Double): TabEvent = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabEvent]
  }
}

