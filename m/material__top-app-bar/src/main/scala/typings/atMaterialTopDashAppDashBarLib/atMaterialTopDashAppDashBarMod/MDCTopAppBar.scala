package typings
package atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar", "MDCTopAppBar")
@js.native
class MDCTopAppBar ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTopDashAppDashBarLib.adapterMod.MDCTopAppBarAdapter, 
      atMaterialTopDashAppDashBarLib.standardFoundationMod.default
    ] {
  def initialize(): scala.Unit = js.native
  def initialize(
    rippleFactory: js.Function1[/* el */ stdLib.Element, atMaterialRippleLib.atMaterialRippleMod.MDCRipple]
  ): scala.Unit = js.native
}

@JSImport("@material/top-app-bar", "MDCTopAppBar")
@js.native
object MDCTopAppBar extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarMod.MDCTopAppBar = js.native
}

