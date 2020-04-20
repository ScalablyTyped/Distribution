package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends js.Object {
  var id: String
  var name: String
  var version: String
}

object AnonVersion {
  @scala.inline
  def apply(id: String, name: String, version: String): AnonVersion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVersion]
  }
}

