package typings.hexo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesc extends js.Object {
  var desc: String
  var name: String
}

object AnonDesc {
  @scala.inline
  def apply(desc: String, name: String): AnonDesc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesc]
  }
}

