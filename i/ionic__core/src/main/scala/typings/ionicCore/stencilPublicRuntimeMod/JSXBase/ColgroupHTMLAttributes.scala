package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColgroupHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var span: js.UndefOr[Double] = js.undefined
}
object ColgroupHTMLAttributes {
  
  @scala.inline
  def apply[T](): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ColgroupHTMLAttributesMutableBuilder[Self <: ColgroupHTMLAttributes[?], T] (val x: Self & ColgroupHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
