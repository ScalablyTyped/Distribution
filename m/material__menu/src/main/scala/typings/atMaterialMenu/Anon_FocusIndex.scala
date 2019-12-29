package typings.atMaterialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusIndex extends js.Object {
  var focusIndex: js.UndefOr[Null] = js.undefined
}

object Anon_FocusIndex {
  @scala.inline
  def apply(focusIndex: js.UndefOr[scala.Nothing] = js.undefined): Anon_FocusIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusIndex)) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FocusIndex]
  }
}

