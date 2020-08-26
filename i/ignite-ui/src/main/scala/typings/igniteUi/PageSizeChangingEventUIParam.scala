package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSizeChangingEventUIParam extends js.Object {
  /**
    * Gets the current page size.
    */
  var currentPageSize: js.UndefOr[Double] = js.native
  /**
    * Gets the new page size.
    */
  var newPageSize: js.UndefOr[Double] = js.native
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object PageSizeChangingEventUIParam {
  @scala.inline
  def apply(): PageSizeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSizeChangingEventUIParam]
  }
  @scala.inline
  implicit class PageSizeChangingEventUIParamOps[Self <: PageSizeChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentPageSize(value: Double): Self = this.set("currentPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageSize: Self = this.set("currentPageSize", js.undefined)
    @scala.inline
    def setNewPageSize(value: Double): Self = this.set("newPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPageSize: Self = this.set("newPageSize", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

