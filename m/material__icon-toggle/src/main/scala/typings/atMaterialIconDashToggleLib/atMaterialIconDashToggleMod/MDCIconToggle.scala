package typings
package atMaterialIconDashToggleLib.atMaterialIconDashToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle", "MDCIconToggle")
@js.native
class MDCIconToggle ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialIconDashToggleLib.adapterMod.MDCIconToggleAdapter, 
      atMaterialIconDashToggleLib.foundationMod.default
    ] {
  var disabled: scala.Boolean = js.native
  var on: scala.Boolean = js.native
  val ripple: atMaterialRippleLib.atMaterialRippleMod.MDCRipple = js.native
  def refreshToggleData(): scala.Unit = js.native
}

/* static members */
@JSImport("@material/icon-toggle", "MDCIconToggle")
@js.native
object MDCIconToggle extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialIconDashToggleLib.atMaterialIconDashToggleMod.MDCIconToggle = js.native
}

