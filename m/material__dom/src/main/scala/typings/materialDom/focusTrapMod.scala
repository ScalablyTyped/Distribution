package typings.materialDom

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapMod {
  
  @JSImport("@material/dom/focus-trap", "FocusTrap")
  @js.native
  class FocusTrap protected () extends StObject {
    def this(root: HTMLElement) = this()
    def this(root: HTMLElement, options: FocusOptions) = this()
    
    /**
      * Releases focus from `root`. Also restores focus to the previously focused
      * element.
      */
    def releaseFocus(): Unit = js.native
    
    /**
      * Traps focus in `root`. Also focuses on either `initialFocusEl` if set;
      * otherwises sets initial focus to the first focusable child element.
      */
    def trapFocus(): Unit = js.native
  }
  
  trait FocusOptions extends StObject {
    
    var initialFocusEl: js.UndefOr[HTMLElement] = js.undefined
    
    var skipInitialFocus: js.UndefOr[Boolean] = js.undefined
  }
  object FocusOptions {
    
    @scala.inline
    def apply(): FocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptions]
    }
    
    @scala.inline
    implicit class FocusOptionsMutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialFocusEl(value: HTMLElement): Self = StObject.set(x, "initialFocusEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFocusElUndefined: Self = StObject.set(x, "initialFocusEl", js.undefined)
      
      @scala.inline
      def setSkipInitialFocus(value: Boolean): Self = StObject.set(x, "skipInitialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInitialFocusUndefined: Self = StObject.set(x, "skipInitialFocus", js.undefined)
    }
  }
}
