package typings.materialRipple

import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.anon.PartialMDCRippleAdapter
import typings.materialRipple.typesMod.MDCRippleAttachOpts
import typings.materialRipple.typesMod.MDCRippleCapableSurface
import typings.materialRipple.typesMod.MDCRipplePoint
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/ripple", "MDCRipple")
  @js.native
  class MDCRipple protected ()
    extends typings.materialRipple.componentMod.MDCRipple {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialRipple.foundationMod.MDCRippleFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCRipple {
    
    @JSImport("@material/ripple", "MDCRipple.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialRipple.componentMod.MDCRipple = js.native
    @JSImport("@material/ripple", "MDCRipple.attachTo")
    @js.native
    def attachTo(root: Element, opts: MDCRippleAttachOpts): typings.materialRipple.componentMod.MDCRipple = js.native
    
    @JSImport("@material/ripple", "MDCRipple.createAdapter")
    @js.native
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  @JSImport("@material/ripple", "MDCRippleFoundation")
  @js.native
  class MDCRippleFoundation ()
    extends typings.materialRipple.foundationMod.MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/ripple", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "cssClasses.BG_FOCUSED")
    @js.native
    def BG_FOCUSED: String = js.native
    @scala.inline
    def BG_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BG_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.FG_ACTIVATION")
    @js.native
    def FG_ACTIVATION: String = js.native
    @scala.inline
    def FG_ACTIVATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_ACTIVATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.FG_DEACTIVATION")
    @js.native
    def FG_DEACTIVATION: String = js.native
    @scala.inline
    def FG_DEACTIVATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.UNBOUNDED")
    @js.native
    def UNBOUNDED: String = js.native
    @scala.inline
    def UNBOUNDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNBOUNDED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/ripple", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "numbers.DEACTIVATION_TIMEOUT_MS")
    @js.native
    def DEACTIVATION_TIMEOUT_MS: Double = js.native
    @scala.inline
    def DEACTIVATION_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEACTIVATION_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.FG_DEACTIVATION_MS")
    @js.native
    def FG_DEACTIVATION_MS: Double = js.native
    @scala.inline
    def FG_DEACTIVATION_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.INITIAL_ORIGIN_SCALE")
    @js.native
    def INITIAL_ORIGIN_SCALE: Double = js.native
    @scala.inline
    def INITIAL_ORIGIN_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_ORIGIN_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.PADDING")
    @js.native
    def PADDING: Double = js.native
    @scala.inline
    def PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.TAP_DELAY_MS")
    @js.native
    def TAP_DELAY_MS: Double = js.native
    @scala.inline
    def TAP_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP_DELAY_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/ripple", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "strings.VAR_FG_SCALE")
    @js.native
    def VAR_FG_SCALE: String = js.native
    @scala.inline
    def VAR_FG_SCALE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_SIZE")
    @js.native
    def VAR_FG_SIZE: String = js.native
    @scala.inline
    def VAR_FG_SIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_TRANSLATE_END")
    @js.native
    def VAR_FG_TRANSLATE_END: String = js.native
    @scala.inline
    def VAR_FG_TRANSLATE_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_END")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_TRANSLATE_START")
    @js.native
    def VAR_FG_TRANSLATE_START: String = js.native
    @scala.inline
    def VAR_FG_TRANSLATE_START_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_START")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_LEFT")
    @js.native
    def VAR_LEFT: String = js.native
    @scala.inline
    def VAR_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_TOP")
    @js.native
    def VAR_TOP: String = js.native
    @scala.inline
    def VAR_TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_TOP")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/ripple", "util.getNormalizedEventCoords")
    @js.native
    def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    @JSImport("@material/ripple", "util.getNormalizedEventCoords")
    @js.native
    def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    
    @JSImport("@material/ripple", "util.supportsCssVariables")
    @js.native
    def supportsCssVariables(windowObj: /* globalThis */ js.Any): Boolean = js.native
    @JSImport("@material/ripple", "util.supportsCssVariables")
    @js.native
    def supportsCssVariables(windowObj: /* globalThis */ js.Any, forceRefresh: Boolean): Boolean = js.native
  }
}
