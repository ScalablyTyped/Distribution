package typings.materialUiCore.anon

import typings.enzyme.mod.EnzymeSelector
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createShallow.ShallowOptions> */
trait PartialShallowOptions extends StObject {
  
  var dive: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Fn2] = js.undefined
  
  var untilSelector: js.UndefOr[EnzymeSelector] = js.undefined
}
object PartialShallowOptions {
  
  inline def apply(): PartialShallowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShallowOptions]
  }
  
  extension [Self <: PartialShallowOptions](x: Self) {
    
    inline def setDive(value: Boolean): Self = StObject.set(x, "dive", value.asInstanceOf[js.Any])
    
    inline def setDiveUndefined: Self = StObject.set(x, "dive", js.undefined)
    
    inline def setShallow(value: Fn2): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setUntilSelector(value: EnzymeSelector): Self = StObject.set(x, "untilSelector", value.asInstanceOf[js.Any])
    
    inline def setUntilSelectorFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = StObject.set(x, "untilSelector", js.Any.fromFunction2(value))
    
    inline def setUntilSelectorUndefined: Self = StObject.set(x, "untilSelector", js.undefined)
  }
}
