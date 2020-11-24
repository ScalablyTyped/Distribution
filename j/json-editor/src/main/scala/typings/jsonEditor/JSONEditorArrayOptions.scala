package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorArrayOptions extends js.Object {
  
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the "add row" button will be hidden
    */
  var disable_array_add: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, all of the "delete" buttons will be hidden
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, just the "delete all rows" button will be hidden
    */
  var disable_array_delete_all_rows: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, just the "delete last row" buttons will be hidden
    */
  var disable_array_delete_last_row: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the "move up/down" buttons will be hidden
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
}
object JSONEditorArrayOptions {
  
  @scala.inline
  def apply(): JSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorArrayOptions]
  }
  
  @scala.inline
  implicit class JSONEditorArrayOptionsOps[Self <: JSONEditorArrayOptions] (val x: Self) extends AnyVal {
    
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
    def setDisable_array_add(value: Boolean): Self = this.set("disable_array_add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_add: Self = this.set("disable_array_add", js.undefined)
    
    @scala.inline
    def setDisable_array_delete(value: Boolean): Self = this.set("disable_array_delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_delete: Self = this.set("disable_array_delete", js.undefined)
    
    @scala.inline
    def setDisable_array_delete_all_rows(value: Boolean): Self = this.set("disable_array_delete_all_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_delete_all_rows: Self = this.set("disable_array_delete_all_rows", js.undefined)
    
    @scala.inline
    def setDisable_array_delete_last_row(value: Boolean): Self = this.set("disable_array_delete_last_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_delete_last_row: Self = this.set("disable_array_delete_last_row", js.undefined)
    
    @scala.inline
    def setDisable_array_reorder(value: Boolean): Self = this.set("disable_array_reorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_array_reorder: Self = this.set("disable_array_reorder", js.undefined)
    
    @scala.inline
    def setDisable_collapse(value: Boolean): Self = this.set("disable_collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_collapse: Self = this.set("disable_collapse", js.undefined)
  }
}
