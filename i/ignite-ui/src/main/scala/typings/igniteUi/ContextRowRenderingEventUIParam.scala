package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextRowRenderingEventUIParam extends js.Object {
  /**
    * Gets the current context row mode.
    */
  var contextRowMode: js.UndefOr[String] = js.undefined
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.undefined
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
    contextRowMode: String = null,
    currentPageIndex: js.UndefOr[Double] = js.undefined,
    dataRow: js.Any = null,
    owner: js.Any = null
  ): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (contextRowMode != null) __obj.updateDynamic("contextRowMode")(contextRowMode.asInstanceOf[js.Any])
    if (!js.isUndefined(currentPageIndex)) __obj.updateDynamic("currentPageIndex")(currentPageIndex.get.asInstanceOf[js.Any])
    if (dataRow != null) __obj.updateDynamic("dataRow")(dataRow.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
}

