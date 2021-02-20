package typings.jsonEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorArrayOptions extends StObject {
  
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
  implicit class JSONEditorArrayOptionsMutableBuilder[Self <: JSONEditorArrayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setDisable_array_add(value: Boolean): Self = StObject.set(x, "disable_array_add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_array_addUndefined: Self = StObject.set(x, "disable_array_add", js.undefined)
    
    @scala.inline
    def setDisable_array_delete(value: Boolean): Self = StObject.set(x, "disable_array_delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_array_deleteUndefined: Self = StObject.set(x, "disable_array_delete", js.undefined)
    
    @scala.inline
    def setDisable_array_delete_all_rows(value: Boolean): Self = StObject.set(x, "disable_array_delete_all_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_array_delete_all_rowsUndefined: Self = StObject.set(x, "disable_array_delete_all_rows", js.undefined)
    
    @scala.inline
    def setDisable_array_delete_last_row(value: Boolean): Self = StObject.set(x, "disable_array_delete_last_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_array_delete_last_rowUndefined: Self = StObject.set(x, "disable_array_delete_last_row", js.undefined)
    
    @scala.inline
    def setDisable_array_reorder(value: Boolean): Self = StObject.set(x, "disable_array_reorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_array_reorderUndefined: Self = StObject.set(x, "disable_array_reorder", js.undefined)
    
    @scala.inline
    def setDisable_collapse(value: Boolean): Self = StObject.set(x, "disable_collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_collapseUndefined: Self = StObject.set(x, "disable_collapse", js.undefined)
  }
}
