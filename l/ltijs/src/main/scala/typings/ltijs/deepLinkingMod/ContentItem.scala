package typings.ltijs.deepLinkingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentItem extends js.Object {
  var custom: js.UndefOr[js.Any] = js.undefined
  var title: String
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
}

object ContentItem {
  @scala.inline
  def apply(title: String, `type`: String, custom: js.Any = null, url: String = null): ContentItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentItem]
  }
}

