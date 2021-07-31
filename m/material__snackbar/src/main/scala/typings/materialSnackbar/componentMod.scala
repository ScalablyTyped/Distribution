package typings.materialSnackbar

import typings.materialBase.componentMod.MDCComponent
import typings.materialSnackbar.foundationMod.MDCSnackbarFoundation
import typings.materialSnackbar.typesMod.MDCSnackbarAnnouncerFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/snackbar/component", "MDCSnackbar")
  @js.native
  class MDCSnackbar protected () extends MDCComponent[MDCSnackbarFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCSnackbarFoundation, args: js.Any*) = this()
    
    def actionButtonText: String = js.native
    def actionButtonText_=(actionButtonText: String): Unit = js.native
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    def closeOnEscape: Boolean = js.native
    def closeOnEscape_=(closeOnEscape: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(announcerFactory: MDCSnackbarAnnouncerFactory): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def labelText: String = js.native
    def labelText_=(labelText: String): Unit = js.native
    
    def open(): Unit = js.native
    
    def timeoutMs: Double = js.native
    def timeoutMs_=(timeoutMs: Double): Unit = js.native
  }
  /* static members */
  object MDCSnackbar {
    
    @JSImport("@material/snackbar/component", "MDCSnackbar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCSnackbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSnackbar]
  }
}
