package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRenderedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference of the item's index, if the layout is flow or vertical
  	 */
  var index: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the rendered item
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference of item's settings, such as colspan ,rowspan, etc.
  	 */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to the igLayoutManager.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ItemRenderedEventUIParam {
  @scala.inline
  def apply(index: js.Any = null, item: js.Any = null, itemData: js.Any = null, owner: js.Any = null): ItemRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRenderedEventUIParam]
  }
}

