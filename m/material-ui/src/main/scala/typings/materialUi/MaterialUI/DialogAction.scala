package typings.materialUi.MaterialUI

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var text: String
}
object DialogAction {
  
  inline def apply(text: String): DialogAction = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
