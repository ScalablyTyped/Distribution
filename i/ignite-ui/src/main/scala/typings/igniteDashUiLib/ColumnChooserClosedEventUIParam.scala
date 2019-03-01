package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChooserClosedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the Column Chooser element. This is a jQuery object.
  	 */
  var columnChooserElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnChooserClosedEventUIParam {
  @scala.inline
  def apply(columnChooserElement: java.lang.String = null, owner: js.Any = null): ColumnChooserClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnChooserElement != null) __obj.updateDynamic("columnChooserElement")(columnChooserElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnChooserClosedEventUIParam]
  }
}

