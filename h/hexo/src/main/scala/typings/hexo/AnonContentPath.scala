package typings.hexo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentPath extends js.Object {
  var content: String
  var path: String
}

object AnonContentPath {
  @scala.inline
  def apply(content: String, path: String): AnonContentPath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentPath]
  }
}

