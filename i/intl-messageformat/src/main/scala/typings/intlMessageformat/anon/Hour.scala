package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hour extends js.Object {
  var hour: String
  var minute: String
}

object Hour {
  @scala.inline
  def apply(hour: String, minute: String): Hour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
}

