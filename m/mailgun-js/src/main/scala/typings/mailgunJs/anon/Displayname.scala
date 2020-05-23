package typings.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displayname extends js.Object {
  var display_name: String | Null
  var domain: String
  var local_part: String
}

object Displayname {
  @scala.inline
  def apply(domain: String, local_part: String, display_name: String = null): Displayname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
}

