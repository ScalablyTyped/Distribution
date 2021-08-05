package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorNodeUpdateDomOptions extends StObject {
  
  var recurse: js.UndefOr[Boolean] = js.undefined
  
  var updateIndexes: js.UndefOr[Boolean] = js.undefined
}
object JSONEditorNodeUpdateDomOptions {
  
  inline def apply(): JSONEditorNodeUpdateDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorNodeUpdateDomOptions]
  }
  
  extension [Self <: JSONEditorNodeUpdateDomOptions](x: Self) {
    
    inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    
    inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    
    inline def setUpdateIndexes(value: Boolean): Self = StObject.set(x, "updateIndexes", value.asInstanceOf[js.Any])
    
    inline def setUpdateIndexesUndefined: Self = StObject.set(x, "updateIndexes", js.undefined)
  }
}
