package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageIndexChangedEventUIParam extends js.Object {
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the current page index.
    */
  var pageIndex: js.UndefOr[Double] = js.native
}

object PageIndexChangedEventUIParam {
  @scala.inline
  def apply(): PageIndexChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangedEventUIParam]
  }
  @scala.inline
  implicit class PageIndexChangedEventUIParamOps[Self <: PageIndexChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
  }
  
}

