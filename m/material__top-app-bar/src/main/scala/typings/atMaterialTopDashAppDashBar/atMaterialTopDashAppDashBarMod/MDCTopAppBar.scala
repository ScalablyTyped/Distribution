package typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.atMaterialTopDashAppDashBar.adapterMod.MDCTopAppBarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar", "MDCTopAppBar")
@js.native
class MDCTopAppBar ()
  extends default[
      MDCTopAppBarAdapter, 
      typings.atMaterialTopDashAppDashBar.standardFoundationMod.default
    ] {
  def initialize(): Unit = js.native
  def initialize(rippleFactory: js.Function1[/* el */ Element, MDCRipple]): Unit = js.native
}

/* static members */
@JSImport("@material/top-app-bar", "MDCTopAppBar")
@js.native
object MDCTopAppBar extends js.Object {
  def attachTo(root: Element): MDCTopAppBar = js.native
}

