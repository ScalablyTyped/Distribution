package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollection extends StObject {
  
  @JSName("apply")
  def apply(method: js.Function, `val`: Any): Any
  
  def each(func: js.Function0[Any]): Any
}
object ICollection {
  
  inline def apply(apply: (js.Function, Any) => Any, each: js.Function0[Any] => Any): ICollection = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[ICollection]
  }
  
  extension [Self <: ICollection](x: Self) {
    
    inline def setApply(value: (js.Function, Any) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setEach(value: js.Function0[Any] => Any): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
  }
}
