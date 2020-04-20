package typings.marked

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String | Null
  var title: String | Null
}

object AnonHref {
  @scala.inline
  def apply(href: String = null, title: String = null): AnonHref = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

