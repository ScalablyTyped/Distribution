package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRequestRename extends js.Object {
  var limitName: String = js.native
  var pageName: String = js.native
}

object TableRequestRename {
  @scala.inline
  def apply(limitName: String, pageName: String): TableRequestRename = {
    val __obj = js.Dynamic.literal(limitName = limitName.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRequestRename]
  }
  @scala.inline
  implicit class TableRequestRenameOps[Self <: TableRequestRename] (val x: Self) extends AnyVal {
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
    def setLimitName(value: String): Self = this.set("limitName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageName(value: String): Self = this.set("pageName", value.asInstanceOf[js.Any])
  }
  
}

