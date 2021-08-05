package typings.kdbxweb.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait editingState extends StObject {
  
  var added: js.Array[Date]
  
  var deleted: js.Array[Date]
}
object editingState {
  
  inline def apply(added: js.Array[Date], deleted: js.Array[Date]): editingState = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[editingState]
  }
  
  extension [Self <: editingState](x: Self) {
    
    inline def setAdded(value: js.Array[Date]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Date*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    inline def setDeleted(value: js.Array[Date]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: Date*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
