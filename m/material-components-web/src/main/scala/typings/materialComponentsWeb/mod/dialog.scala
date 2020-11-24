package typings.materialComponentsWeb.mod

import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.anon.ACTIONATTRIBUTE
import typings.materialDialog.anon.CLOSING
import typings.materialDialog.anon.DIALOGANIMATIONCLOSETIMEMS
import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "dialog")
@js.native
object dialog extends js.Object {
  
  @js.native
  class MDCDialog ()
    extends typings.materialDialog.mod.MDCDialog
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    
    def attachTo(root: Element): typings.materialDialog.componentMod.MDCDialog = js.native
  }
  
  @js.native
  class MDCDialogFoundation ()
    extends typings.materialDialog.mod.MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCDialogAdapter = js.native
    
    def numbers: DIALOGANIMATIONCLOSETIMEMS = js.native
    
    def strings: ACTIONATTRIBUTE = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CLOSING: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
    
    var SCROLLABLE: String = js.native
    
    var SCROLL_LOCK: String = js.native
    
    var STACKED: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
    
    var DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ACTION_ATTRIBUTE: String = js.native
    
    var BUTTON_DEFAULT_ATTRIBUTE: String = js.native
    
    var BUTTON_SELECTOR: String = js.native
    
    var CLOSED_EVENT: String = js.native
    
    var CLOSE_ACTION: String = js.native
    
    var CLOSING_EVENT: String = js.native
    
    var CONTAINER_SELECTOR: String = js.native
    
    var CONTENT_SELECTOR: String = js.native
    
    var DESTROY_ACTION: String = js.native
    
    var INITIAL_FOCUS_ATTRIBUTE: String = js.native
    
    var OPENED_EVENT: String = js.native
    
    var OPENING_EVENT: String = js.native
    
    var SCRIM_SELECTOR: String = js.native
    
    var SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
    
    var SURFACE_SELECTOR: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
    def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = js.native
    
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = js.native
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = js.native
    
    def isScrollable(): Boolean = js.native
    def isScrollable(el: HTMLElement): Boolean = js.native
  }
}
