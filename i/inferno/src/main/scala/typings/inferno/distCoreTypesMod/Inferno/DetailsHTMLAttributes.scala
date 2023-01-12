package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.InfernoEventHandler
import typings.inferno.distCoreTypesMod.SemiSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[InfernoEventHandler[T] | Null] = js.undefined
  
  var open: js.UndefOr[Boolean | Null] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailsHTMLAttributes[?], T] (val x: Self & DetailsHTMLAttributes[T]) extends AnyVal {
    
    inline def setOnToggle(value: InfernoEventHandler[T]): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
    
    inline def setOnToggleFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
    
    inline def setOnToggleNull: Self = StObject.set(x, "onToggle", null)
    
    inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenNull: Self = StObject.set(x, "open", null)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
