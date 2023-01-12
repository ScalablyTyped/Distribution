package typings.materialDom

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapMod {
  
  @JSImport("@material/dom/focus-trap", "FocusTrap")
  @js.native
  open class FocusTrap protected () extends StObject {
    def this(root: HTMLElement) = this()
    def this(root: HTMLElement, options: FocusOptions) = this()
    
    /* private */ var createSentinel: Any = js.native
    
    /* private */ var elFocusedBeforeTrapFocus: Any = js.native
    
    /**
      * Focuses on `initialFocusEl` if defined and a child of the root element.
      * Otherwise, focuses on the first focusable child element of the root.
      */
    /* private */ var focusInitialElement: Any = js.native
    
    /* private */ var getFocusableElements: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /**
      * Releases focus from `root`. Also restores focus to the previously focused
      * element.
      */
    def releaseFocus(): Unit = js.native
    
    /* private */ val root: Any = js.native
    
    /**
      * Traps focus in `root`. Also focuses on either `initialFocusEl` if set;
      * otherwises sets initial focus to the first focusable child element.
      */
    def trapFocus(): Unit = js.native
    
    /**
      * Wraps tab focus within `el` by adding two hidden sentinel divs which are
      * used to mark the beginning and the end of the tabbable region. When
      * focused, these sentinel elements redirect focus to the first/last
      * children elements of the tabbable region, ensuring that focus is trapped
      * within that region.
      */
    /* private */ var wrapTabFocus: Any = js.native
  }
  
  trait FocusOptions extends StObject {
    
    var initialFocusEl: js.UndefOr[HTMLElement] = js.undefined
    
    var skipInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    var skipRestoreFocus: js.UndefOr[Boolean] = js.undefined
  }
  object FocusOptions {
    
    inline def apply(): FocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
      
      inline def setInitialFocusEl(value: HTMLElement): Self = StObject.set(x, "initialFocusEl", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusElUndefined: Self = StObject.set(x, "initialFocusEl", js.undefined)
      
      inline def setSkipInitialFocus(value: Boolean): Self = StObject.set(x, "skipInitialFocus", value.asInstanceOf[js.Any])
      
      inline def setSkipInitialFocusUndefined: Self = StObject.set(x, "skipInitialFocus", js.undefined)
      
      inline def setSkipRestoreFocus(value: Boolean): Self = StObject.set(x, "skipRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setSkipRestoreFocusUndefined: Self = StObject.set(x, "skipRestoreFocus", js.undefined)
    }
  }
}
