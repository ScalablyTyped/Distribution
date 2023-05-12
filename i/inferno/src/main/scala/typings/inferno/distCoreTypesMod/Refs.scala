package typings.inferno.distCoreTypesMod

import typings.inferno.anon.Children
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refs[P] extends StObject {
  
  var onComponentDidAppear: js.UndefOr[js.Function2[/* domNode */ Element, /* props */ Children & P, Unit]] = js.undefined
  
  var onComponentDidMount: js.UndefOr[js.Function2[/* domNode */ Element | Null, /* nextProps */ Children & P, Unit]] = js.undefined
  
  var onComponentDidUpdate: js.UndefOr[js.Function2[/* lastProps */ Children & P, /* nextProps */ Children & P, Unit]] = js.undefined
  
  var onComponentShouldUpdate: js.UndefOr[
    js.Function2[/* lastProps */ Children & P, /* nextProps */ Children & P, Boolean]
  ] = js.undefined
  
  var onComponentWillDisappear: js.UndefOr[
    js.Function3[/* domNode */ Element, /* props */ Children & P, /* callback */ js.Function, Unit]
  ] = js.undefined
  
  var onComponentWillMount: js.UndefOr[js.Function1[/* props */ Children & P, Unit]] = js.undefined
  
  var onComponentWillMove: js.UndefOr[
    js.Function4[
      /* parentVNode */ VNode, 
      /* parentDOM */ Element, 
      /* dom */ Element, 
      /* props */ Children & P, 
      Unit
    ]
  ] = js.undefined
  
  var onComponentWillUnmount: js.UndefOr[js.Function2[/* domNode */ Element, /* nextProps */ Children & P, Unit]] = js.undefined
  
  var onComponentWillUpdate: js.UndefOr[js.Function2[/* lastProps */ Children & P, /* nextProps */ Children & P, Unit]] = js.undefined
}
object Refs {
  
  inline def apply[P](): Refs[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refs[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refs[?], P] (val x: Self & Refs[P]) extends AnyVal {
    
    inline def setOnComponentDidAppear(value: (/* domNode */ Element, /* props */ Children & P) => Unit): Self = StObject.set(x, "onComponentDidAppear", js.Any.fromFunction2(value))
    
    inline def setOnComponentDidAppearUndefined: Self = StObject.set(x, "onComponentDidAppear", js.undefined)
    
    inline def setOnComponentDidMount(value: (/* domNode */ Element | Null, /* nextProps */ Children & P) => Unit): Self = StObject.set(x, "onComponentDidMount", js.Any.fromFunction2(value))
    
    inline def setOnComponentDidMountUndefined: Self = StObject.set(x, "onComponentDidMount", js.undefined)
    
    inline def setOnComponentDidUpdate(value: (/* lastProps */ Children & P, /* nextProps */ Children & P) => Unit): Self = StObject.set(x, "onComponentDidUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentDidUpdateUndefined: Self = StObject.set(x, "onComponentDidUpdate", js.undefined)
    
    inline def setOnComponentShouldUpdate(value: (/* lastProps */ Children & P, /* nextProps */ Children & P) => Boolean): Self = StObject.set(x, "onComponentShouldUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentShouldUpdateUndefined: Self = StObject.set(x, "onComponentShouldUpdate", js.undefined)
    
    inline def setOnComponentWillDisappear(value: (/* domNode */ Element, /* props */ Children & P, /* callback */ js.Function) => Unit): Self = StObject.set(x, "onComponentWillDisappear", js.Any.fromFunction3(value))
    
    inline def setOnComponentWillDisappearUndefined: Self = StObject.set(x, "onComponentWillDisappear", js.undefined)
    
    inline def setOnComponentWillMount(value: /* props */ Children & P => Unit): Self = StObject.set(x, "onComponentWillMount", js.Any.fromFunction1(value))
    
    inline def setOnComponentWillMountUndefined: Self = StObject.set(x, "onComponentWillMount", js.undefined)
    
    inline def setOnComponentWillMove(
      value: (/* parentVNode */ VNode, /* parentDOM */ Element, /* dom */ Element, /* props */ Children & P) => Unit
    ): Self = StObject.set(x, "onComponentWillMove", js.Any.fromFunction4(value))
    
    inline def setOnComponentWillMoveUndefined: Self = StObject.set(x, "onComponentWillMove", js.undefined)
    
    inline def setOnComponentWillUnmount(value: (/* domNode */ Element, /* nextProps */ Children & P) => Unit): Self = StObject.set(x, "onComponentWillUnmount", js.Any.fromFunction2(value))
    
    inline def setOnComponentWillUnmountUndefined: Self = StObject.set(x, "onComponentWillUnmount", js.undefined)
    
    inline def setOnComponentWillUpdate(value: (/* lastProps */ Children & P, /* nextProps */ Children & P) => Unit): Self = StObject.set(x, "onComponentWillUpdate", js.Any.fromFunction2(value))
    
    inline def setOnComponentWillUpdateUndefined: Self = StObject.set(x, "onComponentWillUpdate", js.undefined)
  }
}
