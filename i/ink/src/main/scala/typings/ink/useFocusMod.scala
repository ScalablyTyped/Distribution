package typings.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusMod {
  
  @JSImport("ink/build/hooks/use-focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  inline def default(): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Output]
  inline def default(hasIsActiveAutoFocusCustomId: Input): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIsActiveAutoFocusCustomId.asInstanceOf[js.Any]).asInstanceOf[Output]
  
  trait Input extends StObject {
    
    /**
      * Auto focus this component, if there's no active (focused) component right now.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Assign an ID to this component, so it can be programmatically focused with `focus(id)`.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable this component's focus, while still maintaining its position in the list of focusable components.
      */
    var isActive: js.UndefOr[Boolean] = js.undefined
  }
  object Input {
    
    inline def apply(): Input = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
  
  trait Output extends StObject {
    
    /**
      * Allows focusing a specific element with the provided `id`.
      */
    def focus(id: String): Unit
    
    /**
      * Determines whether this component is focused or not.
      */
    var isFocused: Boolean
  }
  object Output {
    
    inline def apply(focus: String => Unit, isFocused: Boolean): Output = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction1(focus), isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setFocus(value: String => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
}
