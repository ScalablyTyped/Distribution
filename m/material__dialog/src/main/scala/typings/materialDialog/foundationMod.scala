package typings.materialDialog

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.materialDialog.typesMod.DialogConfigOptions
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/dialog/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  @JSImport("@material/dialog/foundation", "MDCDialogFoundation")
  @js.native
  open class MDCDialogFoundation () extends MDCFoundation[MDCDialogAdapter] {
    def this(adapter: PartialMDCDialogAdapter) = this()
    
    /* private */ val animFrame: Any = js.native
    
    /* private */ var animationFrame: Any = js.native
    
    /* private */ var animationTimer: Any = js.native
    
    /* private */ var areButtonsStacked: Any = js.native
    
    /* private */ var autoStackButtons: Any = js.native
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    /* private */ val contentScrollHandler: Any = js.native
    
    /* private */ var detectStackedButtons: Any = js.native
    
    /* private */ var dialogOpen: Any = js.native
    
    /* private */ var escapeKeyAction: Any = js.native
    
    def getAutoStackButtons(): Boolean = js.native
    
    def getEscapeKeyAction(): String = js.native
    
    def getScrimClickAction(): String = js.native
    
    def getSuppressDefaultPressSelector(): String = js.native
    
    /* private */ var handleAnimationTimerEnd: Any = js.native
    
    /** Handles click on the dialog root element. */
    def handleClick(evt: MouseEvent): Unit = js.native
    
    /** Handles keydown on the document. */
    def handleDocumentKeydown(evt: KeyboardEvent): Unit = js.native
    
    /** Handles keydown on the dialog root element. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles scroll event on the dialog's content element -- showing a scroll
      * divider on the header or footer based on the scroll position. This handler
      * should only be registered on full-screen dialogs with scrollable content.
      */
    /* private */ var handleScrollEvent: Any = js.native
    
    /**
      * Handles `transitionend` event triggered when surface scrim animation is
      * finished.
      */
    def handleSurfaceScrimTransitionEnd(): Unit = js.native
    
    /**
      * Used only in instances of showing a secondary dialog over a full-screen
      * dialog. Hides the "surface scrim" displayed over the full-screen dialog.
      */
    def hideSurfaceScrim(): Unit = js.native
    
    /* private */ var isFullscreen: Any = js.native
    
    def isOpen(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    /* private */ var layoutInternal: Any = js.native
    
    def open(): Unit = js.native
    def open(dialogOptions: DialogConfigOptions): Unit = js.native
    
    /**
      * Runs the given logic on the next animation frame, using setTimeout to
      * factor in Firefox reflow behavior.
      */
    /* private */ var runNextAnimationFrame: Any = js.native
    
    /* private */ var scrimClickAction: Any = js.native
    
    def setAutoStackButtons(autoStack: Boolean): Unit = js.native
    
    def setEscapeKeyAction(action: String): Unit = js.native
    
    def setScrimClickAction(action: String): Unit = js.native
    
    def setSuppressDefaultPressSelector(selector: String): Unit = js.native
    
    /**
      * Used only in instances of showing a secondary dialog over a full-screen
      * dialog. Shows the "surface scrim" displayed over the full-screen dialog.
      */
    def showSurfaceScrim(): Unit = js.native
    
    /* private */ var suppressDefaultPressSelector: Any = js.native
    
    /* private */ var toggleScrollDividerFooter: Any = js.native
    
    /* private */ var toggleScrollDividerHeader: Any = js.native
    
    /* private */ var toggleScrollableClasses: Any = js.native
    
    /* private */ val windowOrientationChangeHandler: Any = js.native
    
    /* private */ val windowResizeHandler: Any = js.native
  }
}
