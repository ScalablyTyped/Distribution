package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColgroupHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var span: js.UndefOr[Double | Null] = js.undefined
}
object ColgroupHTMLAttributes {
  
  inline def apply[T](): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
  
  extension [Self <: ColgroupHTMLAttributes[?], T](x: Self & ColgroupHTMLAttributes[T]) {
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanNull: Self = StObject.set(x, "span", null)
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
