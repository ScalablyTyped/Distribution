package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResponsiveColumnShownEventUIParam extends js.Object {
  /**
  	 * Gets the shown column index. Has a value only if the column's key is a number.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the shown column key. Has a value only if the column's key is a string.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

