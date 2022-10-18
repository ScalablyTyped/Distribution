package typings.ionicons.distTypesStencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var dateTime: js.UndefOr[String] = js.undefined
}
object TimeHTMLAttributes {
  
  inline def apply[T](): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
  
  extension [Self <: TimeHTMLAttributes[?], T](x: Self & TimeHTMLAttributes[T]) {
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
