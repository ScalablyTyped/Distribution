package typings.mailgunJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayname extends js.Object {
  var display_name: String | Null
  var domain: String
  var local_part: String
}

object AnonDisplayname {
  @scala.inline
  def apply(domain: String, local_part: String, display_name: String = null): AnonDisplayname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayname]
  }
}

