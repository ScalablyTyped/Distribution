package typings.materialRipple

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.anon.BGFOCUSED
import typings.materialRipple.anon.DEACTIVATIONTIMEOUTMS
import typings.materialRipple.anon.PartialMDCRippleAdapter
import typings.materialRipple.anon.VARFGSCALE
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCRippleFoundation () extends MDCFoundation[MDCRippleAdapter] {
    def this(adapter: PartialMDCRippleAdapter) = this()
    /**
      * @param evt Optional event containing position information.
      */
    def activate(): Unit = js.native
    def activate(evt: Event): Unit = js.native
    def deactivate(): Unit = js.native
    def handleBlur(): Unit = js.native
    def handleFocus(): Unit = js.native
    def layout(): Unit = js.native
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation {
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
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: BGFOCUSED = js.native
    def defaultAdapter: MDCRippleAdapter = js.native
    def numbers: DEACTIVATIONTIMEOUTMS = js.native
    def strings: VARFGSCALE = js.native
  }
  
}

