package typings.materialDialog

import typings.materialBase.componentMod.MDCComponent
import typings.materialDialog.foundationMod.MDCDialogFoundation
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/dialog/component", "MDCDialog")
  @js.native
  class MDCDialog protected () extends MDCComponent[MDCDialogFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCDialogFoundation, args: js.Any*) = this()
    
    def autoStackButtons: Boolean = js.native
    def autoStackButtons_=(autoStack: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    def escapeKeyAction: String = js.native
    def escapeKeyAction_=(action: String): Unit = js.native
    
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
    
    @scala.inline
    def attachTo(root: Element): MDCDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCDialog]
  }
}
