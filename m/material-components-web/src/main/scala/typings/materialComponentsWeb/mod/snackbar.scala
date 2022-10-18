package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialSnackbar.anon.PartialMDCSnackbarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbar {
  
  @JSImport("material-components-web", "snackbar.default")
  @js.native
  open class default ()
    extends typings.materialSnackbar.mod.default {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  
  @JSImport("material-components-web", "snackbar.MDCSnackbar")
  @js.native
  open class MDCSnackbar protected ()
    extends typings.materialSnackbar.mod.MDCSnackbar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSnackbar.foundationMod.MDCSnackbarFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSnackbar {
    
    @JSImport("material-components-web", "snackbar.MDCSnackbar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSnackbar.componentMod.MDCSnackbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSnackbar.componentMod.MDCSnackbar]
  }
  
  @JSImport("material-components-web", "snackbar.MDCSnackbarFoundation")
  @js.native
  open class MDCSnackbarFoundation ()
    extends typings.materialSnackbar.mod.MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "snackbar.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "snackbar.cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("material-components-web", "snackbar.cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "snackbar.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of milliseconds to wait between temporarily clearing the label text
      * in the DOM and subsequently restoring it. This is necessary to force IE 11
      * to pick up the `aria-live` content change and announce it to the user.
      */
    @JSImport("material-components-web", "snackbar.numbers.ARIA_LIVE_DELAY_MS")
    @js.native
    def ARIA_LIVE_DELAY_MS: Double = js.native
    inline def ARIA_LIVE_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LIVE_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.DEFAULT_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def DEFAULT_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    inline def DEFAULT_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.INDETERMINATE")
    @js.native
    def INDETERMINATE: Double = js.native
    inline def INDETERMINATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.MAX_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def MAX_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    inline def MAX_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.MIN_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def MIN_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    inline def MIN_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.SNACKBAR_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def SNACKBAR_ANIMATION_CLOSE_TIME_MS: Double = js.native
    inline def SNACKBAR_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNACKBAR_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.numbers.SNACKBAR_ANIMATION_OPEN_TIME_MS")
    @js.native
    def SNACKBAR_ANIMATION_OPEN_TIME_MS: Double = js.native
    inline def SNACKBAR_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNACKBAR_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "snackbar.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "snackbar.strings.ACTION_SELECTOR")
    @js.native
    def ACTION_SELECTOR: String = js.native
    inline def ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.ARIA_LIVE_LABEL_TEXT_ATTR")
    @js.native
    def ARIA_LIVE_LABEL_TEXT_ATTR: String = js.native
    inline def ARIA_LIVE_LABEL_TEXT_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LIVE_LABEL_TEXT_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    inline def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    inline def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.DISMISS_SELECTOR")
    @js.native
    def DISMISS_SELECTOR: String = js.native
    inline def DISMISS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISMISS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    inline def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    inline def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    inline def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.REASON_ACTION")
    @js.native
    def REASON_ACTION: String = js.native
    inline def REASON_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REASON_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.REASON_DISMISS")
    @js.native
    def REASON_DISMISS: String = js.native
    inline def REASON_DISMISS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REASON_DISMISS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "snackbar.strings.SURFACE_SELECTOR")
    @js.native
    def SURFACE_SELECTOR: String = js.native
    inline def SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("material-components-web", "snackbar.util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def announce(ariaEl: typings.std.Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def announce(ariaEl: typings.std.Element, labelEl: typings.std.Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any], labelEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
