package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onClose: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var returnValue: js.UndefOr[String] = js.undefined
}
object DialogHTMLAttributes {
  
  @scala.inline
  def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DialogHTMLAttributesMutableBuilder[Self <: DialogHTMLAttributes[?], T] (val x: Self & DialogHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setOnClose(value: /* event */ Event => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setReturnValue(value: String): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
