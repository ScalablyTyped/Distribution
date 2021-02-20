package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImmutables extends StObject {
  
  var deserialization: js.UndefOr[js.Function] = js.native
  
  var serialization: js.UndefOr[String | js.Function] = js.native
}
object EditorImmutables {
  
  @scala.inline
  def apply(): EditorImmutables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImmutables]
  }
  
  @scala.inline
  implicit class EditorImmutablesMutableBuilder[Self <: EditorImmutables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserialization(value: js.Function): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializationUndefined: Self = StObject.set(x, "deserialization", js.undefined)
    
    @scala.inline
    def setSerialization(value: String | js.Function): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
