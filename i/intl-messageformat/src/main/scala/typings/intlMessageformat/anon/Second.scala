package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Second extends js.Object {
  var hour: String
  var minute: String
  var second: String
  var timeZoneName: String
}

object Second {
  @scala.inline
  def apply(hour: String, minute: String, second: String, timeZoneName: String): Second = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
}

