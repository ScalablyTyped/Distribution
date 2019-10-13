package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialTopDashAppDashBar.adapterMod.MDCTopAppBarAdapter
import typings.atMaterialTopDashAppDashBar.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "topAppBar")
@js.native
object topAppBar extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod.MDCTopAppBar
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod.MDCTopAppBarBaseFoundation
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod.MDCTopAppBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    val cssClasses: typings.atMaterialTopDashAppDashBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typings.atMaterialTopDashAppDashBar.constantsMod.numbers = js.native
    val strings: typings.atMaterialTopDashAppDashBar.constantsMod.strings = js.native
  }
  
}

