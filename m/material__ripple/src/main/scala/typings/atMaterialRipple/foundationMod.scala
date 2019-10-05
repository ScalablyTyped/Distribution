package typings.atMaterialRipple

import typings.atMaterialRipple.adapterMod.MDCRippleAdapter
import typings.atMaterialRipple.foundationMod.MDCRippleFoundation
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCRippleFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCRippleAdapter] {
    def activate(): Unit = js.native
    def activate(event: Event): Unit = js.native
    def deactivate(): Unit = js.native
    def deactivate(event: Event): Unit = js.native
    def layout(): Unit = js.native
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typings.atMaterialRipple.constantsMod.numbers = js.native
    val strings: typings.atMaterialRipple.constantsMod.strings = js.native
  }
  
}

