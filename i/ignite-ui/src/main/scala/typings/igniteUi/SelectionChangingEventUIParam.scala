package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangingEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to array of the selected items before the new selection has happened. That can be null.
  	 */
  var currentItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to array of all items that will be selected after the selection finish. That can be null.
  	 */
  var items: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SelectionChangingEventUIParam {
  @scala.inline
  def apply(currentItems: js.Any = null, items: js.Any = null, owner: js.Any = null): SelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentItems != null) __obj.updateDynamic("currentItems")(currentItems.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangingEventUIParam]
  }
}

