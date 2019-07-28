package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogGroupColumnEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current groupedColumns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * The key of the column to be grouped.
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the current layout object, if any.
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogGroupColumnEventUIParam {
  @scala.inline
  def apply(
    groupedColumns: js.Array[_] = null,
    key: String = null,
    layout: js.Any = null,
    owner: js.Any = null
  ): ModalDialogGroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns)
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogGroupColumnEventUIParam]
  }
}

