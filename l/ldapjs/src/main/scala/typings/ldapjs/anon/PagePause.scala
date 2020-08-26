package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagePause extends js.Object {
  var pagePause: js.UndefOr[Boolean] = js.native
  var pageSize: js.UndefOr[Double] = js.native
}

object PagePause {
  @scala.inline
  def apply(): PagePause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagePause]
  }
  @scala.inline
  implicit class PagePauseOps[Self <: PagePause] (val x: Self) extends AnyVal {
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
    def setPagePause(value: Boolean): Self = this.set("pagePause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagePause: Self = this.set("pagePause", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
  
}

