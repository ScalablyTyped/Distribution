package typings.inferno.distCoreTypesMod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refs[P] extends StObject {
  
  var onComponentDidMount: js.UndefOr[js.Function2[/* domNode */ Element | Null, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentDidUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentShouldUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Boolean]] = js.undefined
  
  var onComponentWillMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onComponentWillUnmount: js.UndefOr[js.Function2[/* domNode */ Element, /* nextProps */ P, Unit]] = js.undefined
  
  var onComponentWillUpdate: js.UndefOr[js.Function2[/* lastProps */ P, /* nextProps */ P, Unit]] = js.undefined
}
object Refs {
  
  inline def apply[P](): Refs[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refs[P]]
  }
  
  extension [Self <: Refs[?], P](x: Self & Refs[P]) {
    
    inline def setOnComponentDidMount(value: (/* domNode */ Element | Null, /* nextProps */ P) => Unit): Self = StObject.set(x, "onComponentDidMount", js.Any.fromFunction2(value))
    
    inline def setOnComponentDidMountUndefined: Self = StObject.set(x, "onComponentDidMount", js.undefined)
    
    inline def setOnComponentDidUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Unit): Self = StObject.set(x, "onComponentDidUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentDidUpdateUndefined: Self = StObject.set(x, "onComponentDidUpdate", js.undefined)
    
    inline def setOnComponentShouldUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Boolean): Self = StObject.set(x, "onComponentShouldUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentShouldUpdateUndefined: Self = StObject.set(x, "onComponentShouldUpdate", js.undefined)
    
    inline def setOnComponentWillMount(value: () => Unit): Self = StObject.set(x, "onComponentWillMount", js.Any.fromFunction0(value))
    
    inline def setOnComponentWillMountUndefined: Self = StObject.set(x, "onComponentWillMount", js.undefined)
    
    inline def setOnComponentWillUnmount(value: (/* domNode */ Element, /* nextProps */ P) => Unit): Self = StObject.set(x, "onComponentWillUnmount", js.Any.fromFunction2(value))
    
    inline def setOnComponentWillUnmountUndefined: Self = StObject.set(x, "onComponentWillUnmount", js.undefined)
    
    inline def setOnComponentWillUpdate(value: (/* lastProps */ P, /* nextProps */ P) => Unit): Self = StObject.set(x, "onComponentWillUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentWillUpdateUndefined: Self = StObject.set(x, "onComponentWillUpdate", js.undefined)
  }
}
