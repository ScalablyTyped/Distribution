package typings.idyllDocument.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: String | Null
  var className: js.UndefOr[String] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: String = null, className: String = null): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

