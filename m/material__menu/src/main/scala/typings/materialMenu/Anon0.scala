package typings.materialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var focusIndex: js.UndefOr[Double | Null] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(focusIndex: Int | Double = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (focusIndex != null) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

