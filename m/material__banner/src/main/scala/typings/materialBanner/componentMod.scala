package typings.materialBanner

import typings.materialBanner.constantsMod.CloseReason
import typings.materialBanner.constantsMod.MDCBannerFocusTrapFactory
import typings.materialBanner.foundationMod.MDCBannerFoundation
import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/banner/component", "MDCBanner")
  @js.native
  open class MDCBanner protected () extends MDCComponent[MDCBannerFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCBannerFoundation, args: Any*) = this()
    
    /**
      * Closes the banner and fires events.CLOSING to indicate the beginning of its
      * closing animation and then events.CLOSED once the animation finishes.
      * @param reason Why the banner was closed. Value will be passed to
      *     events.CLOSING and events.CLOSED via the `event.detail.reason`
      *     property. Standard values are CloseReason.PRIMARY and
      *     CloseReason.SECONDARY, but CloseReason.UNSPECIFIED is provided for
      *     custom handling of programmatic closing of the banner.
      */
    def close(reason: CloseReason): Unit = js.native
    
    /* private */ var contentEl: Any = js.native
    
    /* private */ var deregisterContentClickHandler: Any = js.native
    
    /* private */ var focusTrap: Any = js.native
    
    /* private */ var focusTrapFactory: Any = js.native
    
    def getPrimaryActionText(): String = js.native
    
    /** Returns null if the banner has no secondary action. */
    def getSecondaryActionText(): String | Null = js.native
    
    def getText(): String = js.native
    
    /* private */ var handleContentClick: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: MDCBannerFocusTrapFactory): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def layout(): Unit = js.native
    
    /**
      * Opens the banner and fires events.OPENING to indicate the beginning of its
      * opening animation and then events.OPENED once the animation finishes.
      */
    def open(): Unit = js.native
    
    /* private */ var primaryActionEl: Any = js.native
    
    /* private */ var registerContentClickHandler: Any = js.native
    
    @JSName("root")
    var root_MDCBanner: HTMLElement = js.native
    
    /* private */ var secondaryActionEl: Any = js.native
    
    def setPrimaryActionText(actionButtonText: String): Unit = js.native
    
    def setSecondaryActionText(actionButtonText: String): Unit = js.native
    
    def setText(text: String): Unit = js.native
    
    /* private */ var textEl: Any = js.native
  }
  /* static members */
  object MDCBanner {
    
    @JSImport("@material/banner/component", "MDCBanner")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCBanner = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCBanner]
  }
}
