package typings.atMaterialRipple.atMaterialRippleMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialRipple.Anon_IsUnbounded
import typings.atMaterialRipple.adapterMod.MDCRippleAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple", "MDCRipple")
@js.native
class MDCRipple ()
  extends default[MDCRippleAdapter, typings.atMaterialRipple.foundationMod.default] {
  var unbounded: Boolean = js.native
  def activate(): Unit = js.native
  def deactivate(): Unit = js.native
  def layout(): Unit = js.native
}

/* static members */
@JSImport("@material/ripple", "MDCRipple")
@js.native
object MDCRipple extends js.Object {
  def attachTo(root: Element): MDCRipple = js.native
  def attachTo(root: Element, options: Anon_IsUnbounded): MDCRipple = js.native
  def createAdapter(instance: RippleCapableSurface): MDCRippleAdapter = js.native
}

