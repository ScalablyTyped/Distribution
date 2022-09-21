package typings.materialDialog

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialDialog.foundationMod.MDCDialogFoundation
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/dialog/component", "MDCDialog")
  @js.native
  open class MDCDialog protected () extends MDCComponent[MDCDialogFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCDialogFoundation, args: Any*) = this()
    
    def autoStackButtons: Boolean = js.native
    def autoStackButtons_=(autoStack: Boolean): Unit = js.native
    
    /* private */ var buttonRipples: Any = js.native
    
    /* private */ var buttons: Any = js.native
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var content: Any = js.native
    
    /* private */ var defaultButton: Any = js.native
    
    def escapeKeyAction: String = js.native
    def escapeKeyAction_=(action: String): Unit = js.native
    
    /* private */ var focusTrap: Any = js.native
    
    /* private */ var focusTrapFactory: Any = js.native
    
    /* private */ var getInitialFocusEl: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleClosing: Any = js.native
    
    /* private */ var handleDocumentKeydown: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    /* private */ var handleOpening: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: MDCDialogFocusTrapFactory): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def layout(): Unit = js.native
    
    def open(): Unit = js.native
    
    def scrimClickAction: String = js.native
    def scrimClickAction_=(action: String): Unit = js.native
  }
  /* static members */
  object MDCDialog {
    
    @JSImport("@material/dialog/component", "MDCDialog")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCDialog]
  }
}
