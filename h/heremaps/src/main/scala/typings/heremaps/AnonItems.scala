package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var next: js.UndefOr[String] = js.undefined
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[_] = null, next: String = null): AnonItems = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

