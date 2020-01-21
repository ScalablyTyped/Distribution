package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItemChangedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the current selected data item.
  	 */
  var newItem: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the previous selected data item.
  	 */
  var oldItem: js.UndefOr[js.Any] = js.undefined
}

object SelectedItemChangedEventUIParam {
  @scala.inline
  def apply(newItem: js.Any = null, oldItem: js.Any = null): SelectedItemChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newItem != null) __obj.updateDynamic("newItem")(newItem.asInstanceOf[js.Any])
    if (oldItem != null) __obj.updateDynamic("oldItem")(oldItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItemChangedEventUIParam]
  }
}

