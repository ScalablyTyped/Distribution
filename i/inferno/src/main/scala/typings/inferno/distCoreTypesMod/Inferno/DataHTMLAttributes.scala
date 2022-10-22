package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var value: js.UndefOr[String | js.Array[String] | Double | Null] = js.undefined
}
object DataHTMLAttributes {
  
  inline def apply[T](): DataHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHTMLAttributes[T]]
  }
  
  extension [Self <: DataHTMLAttributes[?], T](x: Self & DataHTMLAttributes[T]) {
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
