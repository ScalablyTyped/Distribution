package typings.materialUiCore.anon

import typings.enzyme.mod.ComponentType
import typings.enzyme.mod.EnzymeAdapter
import typings.enzyme.mod.EnzymeSelector
import typings.enzyme.mod.Lifecycles
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createShallow.ShallowOptions> */
trait PartialShallowOptions extends StObject {
  
  var PROVIDER_VALUES: js.UndefOr[Any] = js.undefined
  
  var adapter: js.UndefOr[EnzymeAdapter] = js.undefined
  
  var attachTo: js.UndefOr[Any] = js.undefined
  
  var context: js.UndefOr[Any] = js.undefined
  
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
  
  var dive: js.UndefOr[Boolean] = js.undefined
  
  var enableComponentDidUpdateOnSetState: js.UndefOr[Boolean] = js.undefined
  
  var hydrateIn: js.UndefOr[Any] = js.undefined
  
  var lifecycleExperimental: js.UndefOr[Boolean] = js.undefined
  
  var lifecycles: js.UndefOr[Lifecycles] = js.undefined
  
  var shallow: js.UndefOr[Fn2] = js.undefined
  
  var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[Boolean] = js.undefined
  
  var suspenseFallback: js.UndefOr[Boolean] = js.undefined
  
  var untilSelector: js.UndefOr[EnzymeSelector] = js.undefined
  
  var wrappingComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
}
object PartialShallowOptions {
  
  inline def apply(): PartialShallowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShallowOptions]
  }
  
  extension [Self <: PartialShallowOptions](x: Self) {
    
    inline def setAdapter(value: EnzymeAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAttachTo(value: Any): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
    
    inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
    
    inline def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
    
    inline def setDive(value: Boolean): Self = StObject.set(x, "dive", value.asInstanceOf[js.Any])
    
    inline def setDiveUndefined: Self = StObject.set(x, "dive", js.undefined)
    
    inline def setEnableComponentDidUpdateOnSetState(value: Boolean): Self = StObject.set(x, "enableComponentDidUpdateOnSetState", value.asInstanceOf[js.Any])
    
    inline def setEnableComponentDidUpdateOnSetStateUndefined: Self = StObject.set(x, "enableComponentDidUpdateOnSetState", js.undefined)
    
    inline def setHydrateIn(value: Any): Self = StObject.set(x, "hydrateIn", value.asInstanceOf[js.Any])
    
    inline def setHydrateInUndefined: Self = StObject.set(x, "hydrateIn", js.undefined)
    
    inline def setLifecycleExperimental(value: Boolean): Self = StObject.set(x, "lifecycleExperimental", value.asInstanceOf[js.Any])
    
    inline def setLifecycleExperimentalUndefined: Self = StObject.set(x, "lifecycleExperimental", js.undefined)
    
    inline def setLifecycles(value: Lifecycles): Self = StObject.set(x, "lifecycles", value.asInstanceOf[js.Any])
    
    inline def setLifecyclesUndefined: Self = StObject.set(x, "lifecycles", js.undefined)
    
    inline def setPROVIDER_VALUES(value: Any): Self = StObject.set(x, "PROVIDER_VALUES", value.asInstanceOf[js.Any])
    
    inline def setPROVIDER_VALUESUndefined: Self = StObject.set(x, "PROVIDER_VALUES", js.undefined)
    
    inline def setShallow(value: Fn2): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setSupportPrevContextArgumentOfComponentDidUpdate(value: Boolean): Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", value.asInstanceOf[js.Any])
    
    inline def setSupportPrevContextArgumentOfComponentDidUpdateUndefined: Self = StObject.set(x, "supportPrevContextArgumentOfComponentDidUpdate", js.undefined)
    
    inline def setSuspenseFallback(value: Boolean): Self = StObject.set(x, "suspenseFallback", value.asInstanceOf[js.Any])
    
    inline def setSuspenseFallbackUndefined: Self = StObject.set(x, "suspenseFallback", js.undefined)
    
    inline def setUntilSelector(value: EnzymeSelector): Self = StObject.set(x, "untilSelector", value.asInstanceOf[js.Any])
    
    inline def setUntilSelectorFunction2(value: (Any, /* context */ js.UndefOr[Any]) => Element | Null): Self = StObject.set(x, "untilSelector", js.Any.fromFunction2(value))
    
    inline def setUntilSelectorUndefined: Self = StObject.set(x, "untilSelector", js.undefined)
    
    inline def setWrappingComponent(value: ComponentType[Any]): Self = StObject.set(x, "wrappingComponent", value.asInstanceOf[js.Any])
    
    inline def setWrappingComponentFunction2(value: (Any, /* context */ js.UndefOr[Any]) => Element | Null): Self = StObject.set(x, "wrappingComponent", js.Any.fromFunction2(value))
    
    inline def setWrappingComponentProps(value: js.Object): Self = StObject.set(x, "wrappingComponentProps", value.asInstanceOf[js.Any])
    
    inline def setWrappingComponentPropsUndefined: Self = StObject.set(x, "wrappingComponentProps", js.undefined)
    
    inline def setWrappingComponentUndefined: Self = StObject.set(x, "wrappingComponent", js.undefined)
  }
}
