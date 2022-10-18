package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntlCollator extends StObject {
  
  def compare(a: String, b: String): Double
  
  def resolvedOptions(): Any
}
object IntlCollator {
  
  inline def apply(compare: (String, String) => Double, resolvedOptions: () => Any): IntlCollator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[IntlCollator]
  }
  
  extension [Self <: IntlCollator](x: Self) {
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setResolvedOptions(value: () => Any): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
  }
}
