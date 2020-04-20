package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabItem extends js.Object {
  var content: String
  var title: String
}

object TabItem {
  @scala.inline
  def apply(content: String, title: String): TabItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabItem]
  }
}

