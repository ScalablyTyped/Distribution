package typings.atMaterialTopDashAppDashBar

import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.atMaterialTopDashAppDashBar.adapterMod.MDCTopAppBarAdapter
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod.MDCTopAppBar
import typings.atMaterialTopDashAppDashBar.fixedFoundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar", JSImport.Namespace)
@js.native
object atMaterialTopDashAppDashBarMod extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation ()
    extends typings.atMaterialTopDashAppDashBar.shortFoundationMod.default
  
  @js.native
  class MDCTopAppBar ()
    extends typings.atMaterialBase.componentMod.default[
          MDCTopAppBarAdapter, 
          typings.atMaterialTopDashAppDashBar.standardFoundationMod.default
        ] {
    def initialize(): Unit = js.native
    def initialize(rippleFactory: js.Function1[/* el */ Element, MDCRipple]): Unit = js.native
  }
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typings.atMaterialTopDashAppDashBar.foundationMod.default
  
  @js.native
  class MDCTopAppBarFoundation ()
    extends typings.atMaterialTopDashAppDashBar.standardFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): MDCTopAppBar = js.native
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

