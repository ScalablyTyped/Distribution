package typings.materialDialog

import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/dialog", "MDCDialog")
  @js.native
  class MDCDialog protected ()
    extends typings.materialDialog.componentMod.MDCDialog {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialDialog.foundationMod.MDCDialogFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCDialog {
    
    @JSImport("@material/dialog", "MDCDialog")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialDialog.componentMod.MDCDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialDialog.componentMod.MDCDialog]
  }
  
  @JSImport("@material/dialog", "MDCDialogFoundation")
  @js.native
  class MDCDialogFoundation ()
    extends typings.materialDialog.foundationMod.MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/dialog", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/dialog", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLLABLE")
    @js.native
    def SCROLLABLE: String = js.native
    inline def SCROLLABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLL_LOCK")
    @js.native
    def SCROLL_LOCK: String = js.native
    inline def SCROLL_LOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_LOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.STACKED")
    @js.native
    def STACKED: String = js.native
    inline def STACKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STACKED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/dialog", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "numbers.DIALOG_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
    inline def DIALOG_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "numbers.DIALOG_ANIMATION_OPEN_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
    inline def DIALOG_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/dialog", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "strings.ACTION_ATTRIBUTE")
    @js.native
    def ACTION_ATTRIBUTE: String = js.native
    inline def ACTION_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.BUTTON_DEFAULT_ATTRIBUTE")
    @js.native
    def BUTTON_DEFAULT_ATTRIBUTE: String = js.native
    inline def BUTTON_DEFAULT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_DEFAULT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.BUTTON_SELECTOR")
    @js.native
    def BUTTON_SELECTOR: String = js.native
    inline def BUTTON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    inline def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSE_ACTION")
    @js.native
    def CLOSE_ACTION: String = js.native
    inline def CLOSE_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    inline def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CONTAINER_SELECTOR")
    @js.native
    def CONTAINER_SELECTOR: String = js.native
    inline def CONTAINER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.DESTROY_ACTION")
    @js.native
    def DESTROY_ACTION: String = js.native
    inline def DESTROY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.INITIAL_FOCUS_ATTRIBUTE")
    @js.native
    def INITIAL_FOCUS_ATTRIBUTE: String = js.native
    inline def INITIAL_FOCUS_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_FOCUS_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    inline def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    inline def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SCRIM_SELECTOR")
    @js.native
    def SCRIM_SELECTOR: String = js.native
    inline def SCRIM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SUPPRESS_DEFAULT_PRESS_SELECTOR")
    @js.native
    def SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
    inline def SUPPRESS_DEFAULT_PRESS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPRESS_DEFAULT_PRESS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SURFACE_SELECTOR")
    @js.native
    def SURFACE_SELECTOR: String = js.native
    inline def SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/dialog", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTopsMisaligned")(els.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
    inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any], initialFocusEl.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
    
    inline def isScrollable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")().asInstanceOf[Boolean]
    inline def isScrollable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
