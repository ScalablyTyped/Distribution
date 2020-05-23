package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var next: js.UndefOr[String] = js.undefined
}

object Items {
  @scala.inline
  def apply(items: js.Array[_] = null, next: String = null): Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

