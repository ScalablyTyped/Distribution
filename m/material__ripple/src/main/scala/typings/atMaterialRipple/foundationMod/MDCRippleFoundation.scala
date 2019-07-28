package typings.atMaterialRipple.foundationMod

import typings.atMaterialRipple.adapterMod.MDCRippleAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

