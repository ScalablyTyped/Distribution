package typings.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusManagerMod {
  
  @JSImport("ink/build/hooks/use-focus-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This hook exposes methods to enable or disable focus management for all
    * components or manually switch focus to next or previous components.
    */
  @scala.inline
  def default(): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Output]
  
  trait Output extends StObject {
    
    /**
      * Disable focus management for all components. Currently active component (if there's one) will lose its focus.
      */
    var disableFocus: js.Function0[Unit]
    
    /**
      * Enable focus management for all components.
      */
    var enableFocus: js.Function0[Unit]
    
    /**
      * Switch focus to the next focusable component.
      * If there's no active component right now, focus will be given to the first focusable component.
      * If active component is the last in the list of focusable components, focus will be switched to the first component.
      */
    var focusNext: js.Function0[Unit]
    
    /**
      * Switch focus to the previous focusable component.
      * If there's no active component right now, focus will be given to the first focusable component.
      * If active component is the first in the list of focusable components, focus will be switched to the last component.
      */
    var focusPrevious: js.Function0[Unit]
  }
  object Output {
    
    @scala.inline
    def apply(
      disableFocus: () => Unit,
      enableFocus: () => Unit,
      focusNext: () => Unit,
      focusPrevious: () => Unit
    ): Output = {
      val __obj = js.Dynamic.literal(disableFocus = js.Any.fromFunction0(disableFocus), enableFocus = js.Any.fromFunction0(enableFocus), focusNext = js.Any.fromFunction0(focusNext), focusPrevious = js.Any.fromFunction0(focusPrevious))
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableFocus(value: () => Unit): Self = StObject.set(x, "disableFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableFocus(value: () => Unit): Self = StObject.set(x, "enableFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusNext(value: () => Unit): Self = StObject.set(x, "focusNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusPrevious(value: () => Unit): Self = StObject.set(x, "focusPrevious", js.Any.fromFunction0(value))
    }
  }
}
