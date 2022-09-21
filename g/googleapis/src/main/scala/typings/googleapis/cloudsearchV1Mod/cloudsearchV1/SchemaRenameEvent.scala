package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRenameEvent extends StObject {
  
  var newName: js.UndefOr[String | Null] = js.undefined
  
  var originalName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRenameEvent {
  
  inline def apply(): SchemaRenameEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRenameEvent]
  }
  
  extension [Self <: SchemaRenameEvent](x: Self) {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setNewNameNull: Self = StObject.set(x, "newName", null)
    
    inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameNull: Self = StObject.set(x, "originalName", null)
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
  }
}
