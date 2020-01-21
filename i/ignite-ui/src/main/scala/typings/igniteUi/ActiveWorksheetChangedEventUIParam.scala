package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveWorksheetChangedEventUIParam extends js.Object {
  /**
  	 * Gets the current active [worksheet](ig.excel.Worksheet).
  	 */
  var newActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the new active worksheet or null if newActiveWorksheet is null.
  	 */
  var newActiveWorksheetName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the previous active [worksheet](ig.excel.Worksheet).
  	 */
  var oldActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the previous active worksheet or null if oldActiveWorksheet is null.
  	 */
  var oldActiveWorksheetName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ActiveWorksheetChangedEventUIParam {
  @scala.inline
  def apply(
    newActiveWorksheet: js.Any = null,
    newActiveWorksheetName: String = null,
    oldActiveWorksheet: js.Any = null,
    oldActiveWorksheetName: String = null,
    owner: js.Any = null
  ): ActiveWorksheetChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newActiveWorksheet != null) __obj.updateDynamic("newActiveWorksheet")(newActiveWorksheet.asInstanceOf[js.Any])
    if (newActiveWorksheetName != null) __obj.updateDynamic("newActiveWorksheetName")(newActiveWorksheetName.asInstanceOf[js.Any])
    if (oldActiveWorksheet != null) __obj.updateDynamic("oldActiveWorksheet")(oldActiveWorksheet.asInstanceOf[js.Any])
    if (oldActiveWorksheetName != null) __obj.updateDynamic("oldActiveWorksheetName")(oldActiveWorksheetName.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveWorksheetChangedEventUIParam]
  }
}

