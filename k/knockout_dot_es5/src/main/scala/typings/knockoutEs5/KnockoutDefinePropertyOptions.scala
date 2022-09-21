package typings.knockoutEs5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutDefinePropertyOptions extends StObject {
  
  def get(): Any
  
  var set: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object KnockoutDefinePropertyOptions {
  
  inline def apply(get: () => Any): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
  
  extension [Self <: KnockoutDefinePropertyOptions](x: Self) {
    
    inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: /* value */ Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
