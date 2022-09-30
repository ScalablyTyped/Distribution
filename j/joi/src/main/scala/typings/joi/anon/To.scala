package typings.joi.anon

import typings.joi.mod.CustomHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  def from(value: Any): Any
  
  def to(value: Any, helpers: CustomHelpers[Any]): Any
}
object To {
  
  inline def apply(from: Any => Any, to: (Any, CustomHelpers[Any]) => Any): To = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
    __obj.asInstanceOf[To]
  }
  
  extension [Self <: To](x: Self) {
    
    inline def setFrom(value: Any => Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setTo(value: (Any, CustomHelpers[Any]) => Any): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
  }
}
