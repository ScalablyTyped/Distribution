package typings.jestWatcher.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: String
}

object Header {
  @scala.inline
  def apply(header: String): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

