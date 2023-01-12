package typings.materialUiCore

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableTrapFocusUnstableTrapFocusMod {
  
  @JSImport("@material-ui/core/Unstable_TrapFocus/Unstable_TrapFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TrapFocusProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TrapFocusProps extends StObject {
    
    /**
      * A single child content element.
      */
    var children: ReactNode
    
    /**
      * If `true`, the trap focus will not automatically shift focus to itself when it opens, and
      * replace it to the last focused element when it closes.
      * This also works correctly with any trap focus children that have the `disableAutoFocus` prop.
      *
      * Generally this should never be set to `true` as it makes the trap focus less
      * accessible to assistive technologies, like screen readers.
      */
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the trap focus will not prevent focus from leaving the trap focus while open.
      *
      * Generally this should never be set to `true` as it makes the trap focus less
      * accessible to assistive technologies, like screen readers.
      */
    var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the trap focus will not restore focus to previously focused element once
      * trap focus is hidden.
      */
    var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return the document to consider.
      * We use it to implement the restore focus between different browser documents.
      */
    def getDoc(): Document
    
    /**
      * Do we still want to enforce the focus?
      * This prop helps nesting TrapFocus elements.
      */
    def isEnabled(): Boolean
    
    /**
      * If `true`, focus will be locked.
      */
    var open: Boolean
  }
  object TrapFocusProps {
    
    inline def apply(getDoc: () => Document, isEnabled: () => Boolean, open: Boolean): TrapFocusProps = {
      val __obj = js.Dynamic.literal(getDoc = js.Any.fromFunction0(getDoc), isEnabled = js.Any.fromFunction0(isEnabled), open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrapFocusProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrapFocusProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setDisableEnforceFocus(value: Boolean): Self = StObject.set(x, "disableEnforceFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableEnforceFocusUndefined: Self = StObject.set(x, "disableEnforceFocus", js.undefined)
      
      inline def setDisableRestoreFocus(value: Boolean): Self = StObject.set(x, "disableRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableRestoreFocusUndefined: Self = StObject.set(x, "disableRestoreFocus", js.undefined)
      
      inline def setGetDoc(value: () => Document): Self = StObject.set(x, "getDoc", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
