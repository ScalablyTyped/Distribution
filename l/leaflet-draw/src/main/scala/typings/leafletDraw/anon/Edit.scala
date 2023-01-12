package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edit extends StObject {
  
  var edit: String
  
  var editDisabled: String
  
  var remove: String
  
  var removeDisabled: String
}
object Edit {
  
  inline def apply(edit: String, editDisabled: String, remove: String, removeDisabled: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], editDisabled = editDisabled.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeDisabled = removeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edit] (val x: Self) extends AnyVal {
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditDisabled(value: String): Self = StObject.set(x, "editDisabled", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveDisabled(value: String): Self = StObject.set(x, "removeDisabled", value.asInstanceOf[js.Any])
  }
}
