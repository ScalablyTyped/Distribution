package typings.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInputMod {
  
  /**
    * This hook is used for handling user input.
    * It's a more convienient alternative to using `StdinContext` and listening to `data` events.
    * The callback you pass to `useInput` is called for each character when user enters any input.
    * However, if user pastes text and it's more than one character, the callback will be called only once and the whole string will be passed as `input`.
    *
    * ```
    * import {useInput} from 'ink';
    *
    * const UserInput = () => {
    *   useInput((input, key) => {
    *     if (input === 'q') {
    *       // Exit program
    *     }
    *
    *     if (key.leftArrow) {
    *       // Left arrow key pressed
    *     }
    *   });
    *
    *   return …
    * };
    * ```
    */
  @JSImport("ink/build/hooks/use-input", JSImport.Default)
  @js.native
  def default(inputHandler: Handler): Unit = js.native
  @JSImport("ink/build/hooks/use-input", JSImport.Default)
  @js.native
  def default(inputHandler: Handler, options: Options): Unit = js.native
  
  type Handler = js.Function2[/* input */ String, /* key */ Key, Unit]
  
  @js.native
  trait Key extends StObject {
    
    /**
      * Backspace key was pressed.
      */
    var backspace: Boolean = js.native
    
    /**
      * Ctrl key was pressed.
      */
    var ctrl: Boolean = js.native
    
    /**
      * Delete key was pressed.
      */
    var delete: Boolean = js.native
    
    /**
      * Down arrow key was pressed.
      */
    var downArrow: Boolean = js.native
    
    /**
      * Escape key was pressed.
      */
    var escape: Boolean = js.native
    
    /**
      * Left arrow key was pressed.
      */
    var leftArrow: Boolean = js.native
    
    /**
      * [Meta key](https://en.wikipedia.org/wiki/Meta_key) was pressed.
      */
    var meta: Boolean = js.native
    
    /**
      * Page Down key was pressed.
      */
    var pageDown: Boolean = js.native
    
    /**
      * Page Up key was pressed.
      */
    var pageUp: Boolean = js.native
    
    /**
      * Return (Enter) key was pressed.
      */
    var `return`: Boolean = js.native
    
    /**
      * Right arrow key was pressed.
      */
    var rightArrow: Boolean = js.native
    
    /**
      * Shift key was pressed.
      */
    var shift: Boolean = js.native
    
    /**
      * Tab key was pressed.
      */
    var tab: Boolean = js.native
    
    /**
      * Up arrow key was pressed.
      */
    var upArrow: Boolean = js.native
  }
  object Key {
    
    @scala.inline
    def apply(
      backspace: Boolean,
      ctrl: Boolean,
      delete: Boolean,
      downArrow: Boolean,
      escape: Boolean,
      leftArrow: Boolean,
      meta: Boolean,
      pageDown: Boolean,
      pageUp: Boolean,
      `return`: Boolean,
      rightArrow: Boolean,
      shift: Boolean,
      tab: Boolean,
      upArrow: Boolean
    ): Key = {
      val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackspace(value: Boolean): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownArrow(value: Boolean): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftArrow(value: Boolean): Self = StObject.set(x, "leftArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageDown(value: Boolean): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUp(value: Boolean): Self = StObject.set(x, "pageUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn(value: Boolean): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightArrow(value: Boolean): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: Boolean): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpArrow(value: Boolean): Self = StObject.set(x, "upArrow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Enable or disable capturing of user input.
      * Useful when there are multiple useInput hooks used at once to avoid handling the same input several times.
      *
      * @default true
      */
    var isActive: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
}
