package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Minute extends js.Object {
  var hour: String
  var minute: String
  var second: String
}

object Minute {
  @scala.inline
  def apply(hour: String, minute: String, second: String): Minute = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minute]
  }
}

