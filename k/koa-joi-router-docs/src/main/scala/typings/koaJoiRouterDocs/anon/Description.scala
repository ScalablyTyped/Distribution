package typings.koaJoiRouterDocs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var title: String
  var version: String
}

object Description {
  @scala.inline
  def apply(description: String, title: String, version: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

