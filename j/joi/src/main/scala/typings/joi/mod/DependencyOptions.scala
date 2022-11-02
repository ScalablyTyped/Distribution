package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyOptions
  extends StObject
     with HierarchySeparatorOptions {
  
  /**
    * overrides the default check for a present value.
    *
    * @default (resolved) => resolved !== undefined
    */
  var isPresent: js.UndefOr[js.Function1[/* resolved */ Any, Boolean]] = js.undefined
}
object DependencyOptions {
  
  inline def apply(): DependencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyOptions]
  }
  
  extension [Self <: DependencyOptions](x: Self) {
    
    inline def setIsPresent(value: /* resolved */ Any => Boolean): Self = StObject.set(x, "isPresent", js.Any.fromFunction1(value))
    
    inline def setIsPresentUndefined: Self = StObject.set(x, "isPresent", js.undefined)
  }
}
