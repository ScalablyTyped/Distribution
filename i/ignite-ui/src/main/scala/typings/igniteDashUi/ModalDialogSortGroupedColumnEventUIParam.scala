package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogSortGroupedColumnEventUIParam extends js.Object {
  /**
  	 * Gets whether column should be sorted ascending or descending.
  	 */
  var isAsc: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the key of the column to be grouped.
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Get a reference to the current layout object, if any.
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogSortGroupedColumnEventUIParam {
  @scala.inline
  def apply(
    isAsc: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    layout: js.Any = null,
    owner: js.Any = null
  ): ModalDialogSortGroupedColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isAsc)) __obj.updateDynamic("isAsc")(isAsc)
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogSortGroupedColumnEventUIParam]
  }
}

