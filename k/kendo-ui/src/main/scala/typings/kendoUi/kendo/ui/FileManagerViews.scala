package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerViews extends js.Object {
  var grid: js.UndefOr[js.Any] = js.native
  var list: js.UndefOr[js.Any] = js.native
  var tree: js.UndefOr[js.Any] = js.native
}

object FileManagerViews {
  @scala.inline
  def apply(): FileManagerViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerViews]
  }
  @scala.inline
  implicit class FileManagerViewsOps[Self <: FileManagerViews] (val x: Self) extends AnyVal {
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
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setList(value: js.Any): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setTree(value: js.Any): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTree: Self = this.set("tree", js.undefined)
  }
  
}

