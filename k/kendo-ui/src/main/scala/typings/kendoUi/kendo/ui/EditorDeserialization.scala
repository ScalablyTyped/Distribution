package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorDeserialization extends StObject {
  
  var custom: js.UndefOr[js.Function] = js.undefined
}
object EditorDeserialization {
  
  inline def apply(): EditorDeserialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorDeserialization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorDeserialization] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: js.Function): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
  }
}
