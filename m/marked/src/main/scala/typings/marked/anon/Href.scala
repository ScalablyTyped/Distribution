package typings.marked.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String | Null
  var title: String | Null
}

object Href {
  @scala.inline
  def apply(href: String = null, title: String = null): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

