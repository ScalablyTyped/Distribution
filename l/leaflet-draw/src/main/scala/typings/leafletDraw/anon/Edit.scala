package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edit extends StObject {
  
  var edit: String = js.native
  
  var editDisabled: String = js.native
  
  var remove: String = js.native
  
  var removeDisabled: String = js.native
}
object Edit {
  
  @scala.inline
  def apply(edit: String, editDisabled: String, remove: String, removeDisabled: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], editDisabled = editDisabled.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeDisabled = removeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  
  @scala.inline
  implicit class EditMutableBuilder[Self <: Edit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditDisabled(value: String): Self = StObject.set(x, "editDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveDisabled(value: String): Self = StObject.set(x, "removeDisabled", value.asInstanceOf[js.Any])
  }
}
