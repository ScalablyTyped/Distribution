package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  var touchOverflow: js.Any
}

object JQuerySupport {
  @scala.inline
  def apply(touchOverflow: js.Any): JQuerySupport = {
    val __obj = js.Dynamic.literal(touchOverflow = touchOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
}

