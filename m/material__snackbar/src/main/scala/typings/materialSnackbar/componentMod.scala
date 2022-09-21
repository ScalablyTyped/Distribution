package typings.materialSnackbar

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialSnackbar.foundationMod.MDCSnackbarFoundation
import typings.materialSnackbar.typesMod.MDCSnackbarAnnouncerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/snackbar/component", "MDCSnackbar")
  @js.native
  open class MDCSnackbar protected () extends MDCComponent[MDCSnackbarFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCSnackbarFoundation, args: Any*) = this()
    
    def actionButtonText: String = js.native
    def actionButtonText_=(actionButtonText: String): Unit = js.native
    
    /* private */ var actionEl: Any = js.native
    
    /* private */ var announce: Any = js.native
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    def closeOnEscape: Boolean = js.native
    def closeOnEscape_=(closeOnEscape: Boolean): Unit = js.native
    
    /* private */ var deregisterKeyDownHandler: Any = js.native
    
    /* private */ var deregisterSurfaceClickHandler: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /* private */ var handleSurfaceClick: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(announcerFactory: MDCSnackbarAnnouncerFactory): Unit = js.native
    
    /* private */ var isActionButton: Any = js.native
    
    /* private */ var isActionIcon: Any = js.native
    
    def isOpen: Boolean = js.native
    
    /* private */ var labelEl: Any = js.native
    
    def labelText: String = js.native
    def labelText_=(labelText: String): Unit = js.native
    
    def open(): Unit = js.native
    
    /* private */ var registerKeyDownHandler: Any = js.native
    
    /* private */ var registerSurfaceClickHandler: Any = js.native
    
    /* private */ var surfaceEl: Any = js.native
    
    def timeoutMs: Double = js.native
    def timeoutMs_=(timeoutMs: Double): Unit = js.native
  }
  /* static members */
  object MDCSnackbar {
    
    @JSImport("@material/snackbar/component", "MDCSnackbar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCSnackbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSnackbar]
  }
}
