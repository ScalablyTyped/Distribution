package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextRowRenderingEventUIParam extends js.Object {
  /**
  	 * Gets the current context row mode.
  	 */
  var contextRowMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to the first data row. Null if there are no records.
  	 */
  var dataRow: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to igTreeGridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ContextRowRenderingEventUIParam {
  @scala.inline
  def apply(
    contextRowMode: java.lang.String = null,
    currentPageIndex: scala.Int | scala.Double = null,
    dataRow: js.Any = null,
    owner: js.Any = null
  ): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (contextRowMode != null) __obj.updateDynamic("contextRowMode")(contextRowMode)
    if (currentPageIndex != null) __obj.updateDynamic("currentPageIndex")(currentPageIndex.asInstanceOf[js.Any])
    if (dataRow != null) __obj.updateDynamic("dataRow")(dataRow)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
}

