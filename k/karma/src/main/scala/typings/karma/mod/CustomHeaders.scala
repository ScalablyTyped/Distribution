package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomHeaders extends js.Object {
  /** Regular expression string to match files */
  var `match`: String
  /** HTTP header name */
  var name: String
  /** HTTP header value */
  var value: String
}

object CustomHeaders {
  @scala.inline
  def apply(`match`: String, name: String, value: String): CustomHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeaders]
  }
}

