package typings.materialComponentsWeb.mod

import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typings.materialDom.focusTrapMod.FocusTrap
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialog {
  
  @JSImport("material-components-web", "dialog.MDCDialog")
  @js.native
  class MDCDialog protected ()
    extends typings.materialDialog.mod.MDCDialog {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialDialog.foundationMod.MDCDialogFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCDialog {
    
    @JSImport("material-components-web", "dialog.MDCDialog.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialDialog.componentMod.MDCDialog = js.native
  }
  
  @JSImport("material-components-web", "dialog.MDCDialogFoundation")
  @js.native
  class MDCDialogFoundation ()
    extends typings.materialDialog.mod.MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "dialog.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "dialog.cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    @scala.inline
    def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("material-components-web", "dialog.cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    @scala.inline
    def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.cssClasses.SCROLLABLE")
    @js.native
    def SCROLLABLE: String = js.native
    @scala.inline
    def SCROLLABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.cssClasses.SCROLL_LOCK")
    @js.native
    def SCROLL_LOCK: String = js.native
    @scala.inline
    def SCROLL_LOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_LOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.cssClasses.STACKED")
    @js.native
    def STACKED: String = js.native
    @scala.inline
    def STACKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STACKED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "dialog.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "dialog.numbers.DIALOG_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
    @scala.inline
    def DIALOG_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.numbers.DIALOG_ANIMATION_OPEN_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
    @scala.inline
    def DIALOG_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "dialog.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "dialog.strings.ACTION_ATTRIBUTE")
    @js.native
    def ACTION_ATTRIBUTE: String = js.native
    @scala.inline
    def ACTION_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.BUTTON_DEFAULT_ATTRIBUTE")
    @js.native
    def BUTTON_DEFAULT_ATTRIBUTE: String = js.native
    @scala.inline
    def BUTTON_DEFAULT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_DEFAULT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.BUTTON_SELECTOR")
    @js.native
    def BUTTON_SELECTOR: String = js.native
    @scala.inline
    def BUTTON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    @scala.inline
    def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.CLOSE_ACTION")
    @js.native
    def CLOSE_ACTION: String = js.native
    @scala.inline
    def CLOSE_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    @scala.inline
    def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.CONTAINER_SELECTOR")
    @js.native
    def CONTAINER_SELECTOR: String = js.native
    @scala.inline
    def CONTAINER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    @scala.inline
    def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.DESTROY_ACTION")
    @js.native
    def DESTROY_ACTION: String = js.native
    @scala.inline
    def DESTROY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.INITIAL_FOCUS_ATTRIBUTE")
    @js.native
    def INITIAL_FOCUS_ATTRIBUTE: String = js.native
    @scala.inline
    def INITIAL_FOCUS_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_FOCUS_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    @scala.inline
    def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    @scala.inline
    def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.SCRIM_SELECTOR")
    @js.native
    def SCRIM_SELECTOR: String = js.native
    @scala.inline
    def SCRIM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.SUPPRESS_DEFAULT_PRESS_SELECTOR")
    @js.native
    def SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
    @scala.inline
    def SUPPRESS_DEFAULT_PRESS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPRESS_DEFAULT_PRESS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "dialog.strings.SURFACE_SELECTOR")
    @js.native
    def SURFACE_SELECTOR: String = js.native
    @scala.inline
    def SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("material-components-web", "dialog.util.areTopsMisaligned")
    @js.native
    def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = js.native
    
    @JSImport("material-components-web", "dialog.util.createFocusTrapInstance")
    @js.native
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = js.native
    @JSImport("material-components-web", "dialog.util.createFocusTrapInstance")
    @js.native
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = js.native
    
    @JSImport("material-components-web", "dialog.util.isScrollable")
    @js.native
    def isScrollable(): Boolean = js.native
    @JSImport("material-components-web", "dialog.util.isScrollable")
    @js.native
    def isScrollable(el: HTMLElement): Boolean = js.native
  }
}
