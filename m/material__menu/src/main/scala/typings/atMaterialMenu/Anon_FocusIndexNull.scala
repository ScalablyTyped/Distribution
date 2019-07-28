package typings.atMaterialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusIndexNull extends js.Object {
  var focusIndex: js.UndefOr[Double | Null] = js.undefined
}

object Anon_FocusIndexNull {
  @scala.inline
  def apply(focusIndex: Int | Double = null): Anon_FocusIndexNull = {
    val __obj = js.Dynamic.literal()
    if (focusIndex != null) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FocusIndexNull]
  }
}

