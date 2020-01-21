package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClickEventUIParam extends js.Object {
  /**
  	 * Used to determine whether or not the label click should fire slice click event.
  	 */
  var allowSliceClick: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to the slice object.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
}

object LabelClickEventUIParam {
  @scala.inline
  def apply(allowSliceClick: js.Any = null, item: js.Any = null): LabelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (allowSliceClick != null) __obj.updateDynamic("allowSliceClick")(allowSliceClick.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelClickEventUIParam]
  }
}

