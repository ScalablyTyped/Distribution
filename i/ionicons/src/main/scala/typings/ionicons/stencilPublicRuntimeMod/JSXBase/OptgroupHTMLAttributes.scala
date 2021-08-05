package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptgroupHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object OptgroupHTMLAttributes {
  
  inline def apply[T](): OptgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptgroupHTMLAttributes[T]]
  }
  
  extension [Self <: OptgroupHTMLAttributes[?], T](x: Self & OptgroupHTMLAttributes[T]) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
