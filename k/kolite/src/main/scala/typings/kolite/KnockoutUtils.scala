package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutUtils extends StObject {
  
  def wrapAccessor(accessor: Any): js.Function
}
object KnockoutUtils {
  
  inline def apply(wrapAccessor: Any => js.Function): KnockoutUtils = {
    val __obj = js.Dynamic.literal(wrapAccessor = js.Any.fromFunction1(wrapAccessor))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  extension [Self <: KnockoutUtils](x: Self) {
    
    inline def setWrapAccessor(value: Any => js.Function): Self = StObject.set(x, "wrapAccessor", js.Any.fromFunction1(value))
  }
}
