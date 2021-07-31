package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ImageEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofImageEditor extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ImageEditor
  
  /* static member */
  var fn: ImageEditor
}
object TypeofImageEditor {
  
  @scala.inline
  def apply(extend: js.Object => ImageEditor, fn: ImageEditor): TypeofImageEditor = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofImageEditor]
  }
  
  @scala.inline
  implicit class TypeofImageEditorMutableBuilder[Self <: TypeofImageEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ImageEditor): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ImageEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
