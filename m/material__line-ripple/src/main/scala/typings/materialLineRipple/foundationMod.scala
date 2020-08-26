package typings.materialLineRipple

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typings.materialLineRipple.anon.LINERIPPLEACTIVE
import typings.materialLineRipple.anon.PartialMDCLineRippleAdapt
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCLineRippleFoundation () extends MDCFoundation[MDCLineRippleAdapter] {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
    def activate(): Unit = js.native
    def deactivate(): Unit = js.native
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    def cssClasses: LINERIPPLEACTIVE = js.native
    /**
      * See {@link MDCLineRippleAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: LINERIPPLEACTIVE = js.native
    /**
      * See {@link MDCLineRippleAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

