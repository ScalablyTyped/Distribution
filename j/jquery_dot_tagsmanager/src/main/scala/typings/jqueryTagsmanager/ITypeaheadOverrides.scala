package typings.jqueryTagsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeaheadOverrides extends js.Object {
  var instanceSelectHandler: js.UndefOr[js.Function] = js.native
  var select: js.UndefOr[js.Function] = js.native
  var selectedClass: js.UndefOr[String] = js.native
}

object ITypeaheadOverrides {
  @scala.inline
  def apply(): ITypeaheadOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOverrides]
  }
  @scala.inline
  implicit class ITypeaheadOverridesOps[Self <: ITypeaheadOverrides] (val x: Self) extends AnyVal {
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
    def setInstanceSelectHandler(value: js.Function): Self = this.set("instanceSelectHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceSelectHandler: Self = this.set("instanceSelectHandler", js.undefined)
    @scala.inline
    def setSelect(value: js.Function): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectedClass(value: String): Self = this.set("selectedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedClass: Self = this.set("selectedClass", js.undefined)
  }
  
}

