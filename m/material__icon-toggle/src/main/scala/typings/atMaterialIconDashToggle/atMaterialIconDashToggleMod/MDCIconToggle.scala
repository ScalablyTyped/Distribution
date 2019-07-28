package typings.atMaterialIconDashToggle.atMaterialIconDashToggleMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialIconDashToggle.adapterMod.MDCIconToggleAdapter
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle", "MDCIconToggle")
@js.native
class MDCIconToggle ()
  extends default[MDCIconToggleAdapter, typings.atMaterialIconDashToggle.foundationMod.default] {
  var disabled: Boolean = js.native
  var on: Boolean = js.native
  val ripple: MDCRipple = js.native
  def refreshToggleData(): Unit = js.native
}

/* static members */
@JSImport("@material/icon-toggle", "MDCIconToggle")
@js.native
object MDCIconToggle extends js.Object {
  def attachTo(root: Element): MDCIconToggle = js.native
}

