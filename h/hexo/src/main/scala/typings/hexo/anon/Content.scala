package typings.hexo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var path: String
}

object Content {
  @scala.inline
  def apply(content: String, path: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

