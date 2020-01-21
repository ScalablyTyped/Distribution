package typings.idyllDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: String | Null
  var className: js.UndefOr[String] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: String = null, className: String = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

