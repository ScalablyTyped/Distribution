package typings.materialDialog

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialBase.typesMod.SpecificWindowEventListener
import typings.materialBase.typesMod.WindowEventType
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCDialogAdapter extends StObject {
    
    def addBodyClass(className: String): Unit = js.native
    
    def addClass(className: String): Unit = js.native
    
    def areButtonsStacked(): Boolean = js.native
    
    def clickDefaultButton(): Unit = js.native
    
    /**
      * Deregisters an event listener on the dialog's content element.
      */
    def deregisterContentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Deregisters an event listener to the window.
      */
    def deregisterWindowEventHandler[K /* <: WindowEventType */](evtType: K, handler: SpecificWindowEventListener[K]): Unit = js.native
    
    def eventTargetMatches(target: Null, selector: String): Boolean = js.native
    def eventTargetMatches(target: EventTarget, selector: String): Boolean = js.native
    
    def getActionFromEvent(evt: Event): String | Null = js.native
    
    def getInitialFocusEl(): HTMLElement | Null = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def isContentScrollable(): Boolean = js.native
    
    /**
      * @return true if the content has been scrolled all
      *     the way to the bottom. This is used in full-screen dialogs, where the
      *     footer scroll divider is expected only to appear when the content is
      *     "cut-off" by the footer bar.
      */
    def isScrollableContentAtBottom(): Boolean = js.native
    
    /**
      * @return true if the content has been scrolled (that is, for
      *     scrollable content, if it is at the "top"). This is used in full-screen
      *     dialogs, where the scroll divider is expected only to appear once the
      *     content has been scrolled "underneath" the header bar.
      */
    def isScrollableContentAtTop(): Boolean = js.native
    
    def notifyClosed(action: String): Unit = js.native
    
    def notifyClosing(action: String): Unit = js.native
    
    def notifyOpened(): Unit = js.native
    
    def notifyOpening(): Unit = js.native
    
    /**
      * Registers an event listener on the dialog's content element (indicated
      * with the 'mdc-dialog__content' class).
      */
    def registerContentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Registers an event listener to the window.
      */
    def registerWindowEventHandler[K /* <: WindowEventType */](evtType: K, handler: SpecificWindowEventListener[K]): Unit = js.native
    
    def releaseFocus(): Unit = js.native
    
    def removeBodyClass(className: String): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def reverseButtons(): Unit = js.native
    
    def trapFocus(): Unit = js.native
    def trapFocus(focusElement: HTMLElement): Unit = js.native
  }
}
