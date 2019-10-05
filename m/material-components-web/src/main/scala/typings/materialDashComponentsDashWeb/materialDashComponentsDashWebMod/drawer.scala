package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialDrawer.adapterMod.MDCDrawerAdapter
import typings.atMaterialDrawer.focusDashTrapMod.FocusTrap
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawer extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typings.atMaterialDrawer.atMaterialDrawerMod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends typings.atMaterialDrawer.atMaterialDrawerMod.MDCDrawer {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typings.atMaterialDrawer.atMaterialDrawerMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typings.atMaterialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typings.atMaterialDrawer.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: Element): typings.atMaterialDrawer.atMaterialDrawerMod.MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

