package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double | Null] = js.undefined
}
object ParamHTMLAttributes {
  
  inline def apply[T](): ParamHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamHTMLAttributes[T]]
  }
  
  extension [Self <: ParamHTMLAttributes[?], T](x: Self & ParamHTMLAttributes[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
