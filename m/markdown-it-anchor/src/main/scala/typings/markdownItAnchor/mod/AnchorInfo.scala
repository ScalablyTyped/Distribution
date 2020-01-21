package typings.markdownItAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorInfo extends js.Object {
  var slug: String
  var title: String
}

object AnchorInfo {
  @scala.inline
  def apply(slug: String, title: String): AnchorInfo = {
    val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnchorInfo]
  }
}

