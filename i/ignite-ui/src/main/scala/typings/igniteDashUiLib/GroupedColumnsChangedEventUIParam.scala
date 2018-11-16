package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupedColumnsChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the current groupedColumns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the current layout object, if any(not set if called from modal dialog).
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
  	 */
  var triggeredBy: js.UndefOr[java.lang.String] = js.undefined
}

