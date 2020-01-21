package typings.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrEvent extends js.Object {
  var data: js.UndefOr[String | Boolean] = js.undefined
  var `type`: String
}

object ListrEvent {
  @scala.inline
  def apply(`type`: String, data: String | Boolean = null): ListrEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrEvent]
  }
}

