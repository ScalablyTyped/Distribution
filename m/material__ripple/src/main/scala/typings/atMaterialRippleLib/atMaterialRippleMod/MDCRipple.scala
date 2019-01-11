package typings
package atMaterialRippleLib.atMaterialRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple", "MDCRipple")
@js.native
class MDCRipple ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialRippleLib.adapterMod.MDCRippleAdapter, 
      atMaterialRippleLib.foundationMod.default
    ] {
  var unbounded: scala.Boolean = js.native
  def activate(): scala.Unit = js.native
  def deactivate(): scala.Unit = js.native
  def layout(): scala.Unit = js.native
}

@JSImport("@material/ripple", "MDCRipple")
@js.native
object MDCRipple extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialRippleLib.atMaterialRippleMod.MDCRipple = js.native
  def attachTo(root: stdLib.Element, options: atMaterialRippleLib.Anon_IsUnbounded): atMaterialRippleLib.atMaterialRippleMod.MDCRipple = js.native
  def createAdapter(instance: atMaterialRippleLib.atMaterialRippleMod.RippleCapableSurface): atMaterialRippleLib.adapterMod.MDCRippleAdapter = js.native
}

