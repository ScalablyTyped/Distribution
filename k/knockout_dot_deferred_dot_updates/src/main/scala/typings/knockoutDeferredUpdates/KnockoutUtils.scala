package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utils
trait KnockoutUtils extends StObject {
  
  def objectForEach(obj: Any, action: js.Function): Unit
  
  def objectMap(source: Any, mapping: js.Function): Any
}
object KnockoutUtils {
  
  inline def apply(objectForEach: (Any, js.Function) => Unit, objectMap: (Any, js.Function) => Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(objectForEach = js.Any.fromFunction2(objectForEach), objectMap = js.Any.fromFunction2(objectMap))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  extension [Self <: KnockoutUtils](x: Self) {
    
    inline def setObjectForEach(value: (Any, js.Function) => Unit): Self = StObject.set(x, "objectForEach", js.Any.fromFunction2(value))
    
    inline def setObjectMap(value: (Any, js.Function) => Any): Self = StObject.set(x, "objectMap", js.Any.fromFunction2(value))
  }
}
