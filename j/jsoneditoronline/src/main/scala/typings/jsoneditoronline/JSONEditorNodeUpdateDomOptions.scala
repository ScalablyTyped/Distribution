package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorNodeUpdateDomOptions extends js.Object {
  var recurse: js.UndefOr[Boolean] = js.native
  var updateIndexes: js.UndefOr[Boolean] = js.native
}

object JSONEditorNodeUpdateDomOptions {
  @scala.inline
  def apply(): JSONEditorNodeUpdateDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorNodeUpdateDomOptions]
  }
  @scala.inline
  implicit class JSONEditorNodeUpdateDomOptionsOps[Self <: JSONEditorNodeUpdateDomOptions] (val x: Self) extends AnyVal {
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
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
    @scala.inline
    def setUpdateIndexes(value: Boolean): Self = this.set("updateIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateIndexes: Self = this.set("updateIndexes", js.undefined)
  }
  
}

