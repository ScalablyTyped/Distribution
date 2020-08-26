package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewCheckboxes extends js.Object {
  var checkChildren: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
}

object TreeViewCheckboxes {
  @scala.inline
  def apply(): TreeViewCheckboxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewCheckboxes]
  }
  @scala.inline
  implicit class TreeViewCheckboxesOps[Self <: TreeViewCheckboxes] (val x: Self) extends AnyVal {
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
    def setCheckChildren(value: Boolean): Self = this.set("checkChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckChildren: Self = this.set("checkChildren", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

