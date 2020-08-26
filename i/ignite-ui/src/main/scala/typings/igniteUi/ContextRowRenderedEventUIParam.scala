package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRowRenderedEventUIParam extends js.Object {
  /**
    * Gets the current context row mode.
    */
  var contextRowMode: js.UndefOr[String] = js.native
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.native
  /**
    * Gets reference to the first data row. Null if there are no records.
    */
  var dataRow: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to igTreeGridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets array of the parent rows(of the ui.dataRow). If the dataRow is null(for instance filter is applied and no records are shown) then it is empty array. Otherwise it contains all ancestors ordered by level(including the current dataRow) - the first item is root level, the last array item is the current ui.dataRow
    */
  var parentRows: js.UndefOr[js.Array[_]] = js.native
}

object ContextRowRenderedEventUIParam {
  @scala.inline
  def apply(): ContextRowRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderedEventUIParam]
  }
  @scala.inline
  implicit class ContextRowRenderedEventUIParamOps[Self <: ContextRowRenderedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextRowMode(value: String): Self = this.set("contextRowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextRowMode: Self = this.set("contextRowMode", js.undefined)
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = this.set("currentPageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageIndex: Self = this.set("currentPageIndex", js.undefined)
    @scala.inline
    def setDataRow(value: js.Any): Self = this.set("dataRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRow: Self = this.set("dataRow", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setParentRowsVarargs(value: js.Any*): Self = this.set("parentRows", js.Array(value :_*))
    @scala.inline
    def setParentRows(value: js.Array[_]): Self = this.set("parentRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRows: Self = this.set("parentRows", js.undefined)
  }
  
}

