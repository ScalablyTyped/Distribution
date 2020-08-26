package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorObjectOptions extends js.Object {
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the Edit JSON button will be hidden
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the Edit Properties button will be hidden
    */
  var disable_properties: js.UndefOr[Boolean] = js.native
}

object JSONEditorObjectOptions {
  @scala.inline
  def apply(): JSONEditorObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorObjectOptions]
  }
  @scala.inline
  implicit class JSONEditorObjectOptionsOps[Self <: JSONEditorObjectOptions] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setDisable_collapse(value: Boolean): Self = this.set("disable_collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_collapse: Self = this.set("disable_collapse", js.undefined)
    @scala.inline
    def setDisable_edit_json(value: Boolean): Self = this.set("disable_edit_json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_edit_json: Self = this.set("disable_edit_json", js.undefined)
    @scala.inline
    def setDisable_properties(value: Boolean): Self = this.set("disable_properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_properties: Self = this.set("disable_properties", js.undefined)
  }
  
}

