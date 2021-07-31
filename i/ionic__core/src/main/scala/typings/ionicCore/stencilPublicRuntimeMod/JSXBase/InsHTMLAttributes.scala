package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[String] = js.undefined
  
  var dateTime: js.UndefOr[String] = js.undefined
  
  var datetime: js.UndefOr[String] = js.undefined
}
object InsHTMLAttributes {
  
  @scala.inline
  def apply[T](): InsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class InsHTMLAttributesMutableBuilder[Self <: InsHTMLAttributes[?], T] (val x: Self & InsHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
