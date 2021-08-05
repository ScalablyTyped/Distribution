package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorImmutables extends StObject {
  
  var deserialization: js.UndefOr[js.Function] = js.undefined
  
  var serialization: js.UndefOr[String | js.Function] = js.undefined
}
object EditorImmutables {
  
  inline def apply(): EditorImmutables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImmutables]
  }
  
  extension [Self <: EditorImmutables](x: Self) {
    
    inline def setDeserialization(value: js.Function): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
    
    inline def setDeserializationUndefined: Self = StObject.set(x, "deserialization", js.undefined)
    
    inline def setSerialization(value: String | js.Function): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
