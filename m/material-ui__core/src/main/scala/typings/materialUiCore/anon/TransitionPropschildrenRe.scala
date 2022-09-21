package typings.materialUiCore.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @material-ui/core.@material-ui/core/transitions/transition.TransitionProps & {  children :react.react.ReactElement | undefined} */
trait TransitionPropschildrenRe extends StObject {
  
  var addEndListener: js.UndefOr[Any] = js.undefined
  
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.undefined
  
  var in: js.UndefOr[Any] = js.undefined
  
  var mountOnEnter: js.UndefOr[Any] = js.undefined
  
  var onEnter: js.UndefOr[Any] = js.undefined
  
  var onEntered: js.UndefOr[Any] = js.undefined
  
  var onEntering: js.UndefOr[Any] = js.undefined
  
  var onExit: js.UndefOr[Any] = js.undefined
  
  var onExited: js.UndefOr[Any] = js.undefined
  
  var onExiting: js.UndefOr[Any] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var timeout: js.UndefOr[Any] = js.undefined
  
  var unmountOnExit: js.UndefOr[Any] = js.undefined
}
object TransitionPropschildrenRe {
  
  inline def apply(): TransitionPropschildrenRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionPropschildrenRe]
  }
  
  extension [Self <: TransitionPropschildrenRe](x: Self) {
    
    inline def setAddEndListener(value: Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
    
    inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setIn(value: Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setMountOnEnter(value: Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
    
    inline def setOnEnter(value: Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUnmountOnExit(value: Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
  }
}
