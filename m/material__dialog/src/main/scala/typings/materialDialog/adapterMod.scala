package typings.materialDialog

import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/dialog/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  
  @js.native
  trait MDCDialogAdapter extends js.Object {
    
    def addBodyClass(className: String): Unit = js.native
    
    def addClass(className: String): Unit = js.native
    
    def areButtonsStacked(): Boolean = js.native
    
    def clickDefaultButton(): Unit = js.native
    
    def eventTargetMatches(target: Null, selector: String): Boolean = js.native
    def eventTargetMatches(target: EventTarget, selector: String): Boolean = js.native
    
    def getActionFromEvent(evt: Event): String | Null = js.native
    
    def getInitialFocusEl(): HTMLElement | Null = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def isContentScrollable(): Boolean = js.native
    
    def notifyClosed(action: String): Unit = js.native
    
    def notifyClosing(action: String): Unit = js.native
    
    def notifyOpened(): Unit = js.native
    
    def notifyOpening(): Unit = js.native
    
    def releaseFocus(): Unit = js.native
    
    def removeBodyClass(className: String): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def reverseButtons(): Unit = js.native
    
    def trapFocus(): Unit = js.native
    def trapFocus(focusElement: HTMLElement): Unit = js.native
  }
}
