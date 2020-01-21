package typings.materialRipple

import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCRippleFoundation
    extends typings.materialBase.foundationMod.default[MDCRippleAdapter] {
    def activate(): Unit = js.native
    def activate(event: Event_): Unit = js.native
    def deactivate(): Unit = js.native
    def deactivate(event: Event_): Unit = js.native
    def layout(): Unit = js.native
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typings.materialRipple.constantsMod.numbers = js.native
    val strings: typings.materialRipple.constantsMod.strings = js.native
  }
  
}

