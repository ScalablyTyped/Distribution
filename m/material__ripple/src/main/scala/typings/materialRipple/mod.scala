package typings.materialRipple

import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.anon.BGFOCUSED
import typings.materialRipple.anon.DEACTIVATIONTIMEOUTMS
import typings.materialRipple.anon.PartialMDCRippleAdapter
import typings.materialRipple.anon.VARFGSCALE
import typings.materialRipple.typesMod.MDCRippleAttachOpts
import typings.materialRipple.typesMod.MDCRippleCapableSurface
import typings.materialRipple.typesMod.MDCRipplePoint
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/ripple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCRipple ()
    extends typings.materialRipple.componentMod.MDCRipple
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    
    def attachTo(root: Element): typings.materialRipple.componentMod.MDCRipple = js.native
    def attachTo(root: Element, opts: MDCRippleAttachOpts): typings.materialRipple.componentMod.MDCRipple = js.native
    
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  @js.native
  class MDCRippleFoundation ()
    extends typings.materialRipple.foundationMod.MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    
    def cssClasses: BGFOCUSED = js.native
    
    def defaultAdapter: MDCRippleAdapter = js.native
    
    def numbers: DEACTIVATIONTIMEOUTMS = js.native
    
    def strings: VARFGSCALE = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var BG_FOCUSED: String = js.native
    
    var FG_ACTIVATION: String = js.native
    
    var FG_DEACTIVATION: String = js.native
    
    var ROOT: String = js.native
    
    var UNBOUNDED: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var DEACTIVATION_TIMEOUT_MS: Double = js.native
    
    var FG_DEACTIVATION_MS: Double = js.native
    
    var INITIAL_ORIGIN_SCALE: Double = js.native
    
    var PADDING: Double = js.native
    
    var TAP_DELAY_MS: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var VAR_FG_SCALE: String = js.native
    
    var VAR_FG_SIZE: String = js.native
    
    var VAR_FG_TRANSLATE_END: String = js.native
    
    var VAR_FG_TRANSLATE_START: String = js.native
    
    var VAR_LEFT: String = js.native
    
    var VAR_TOP: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
    def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    
    def supportsCssVariables(windowObj: /* globalThis */ js.Any): Boolean = js.native
    def supportsCssVariables(windowObj: /* globalThis */ js.Any, forceRefresh: Boolean): Boolean = js.native
  }
}
