package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.InfernoEventHandler
import typings.inferno.distCoreTypesMod.SemiSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onCancel: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var onClose: js.UndefOr[InfernoEventHandler[T]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  extension [Self <: DialogHTMLAttributes[?], T](x: Self & DialogHTMLAttributes[T]) {
    
    inline def setOnCancel(value: InfernoEventHandler[T]): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnCancelFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    inline def setOnCancelNull: Self = StObject.set(x, "onCancel", null)
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnClose(value: InfernoEventHandler[T]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseFunction1(value: SemiSyntheticEvent[T] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
