package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawerNs extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends atMaterialDrawerLib.atMaterialDrawerMod.MDCDismissibleDrawerFoundation {
    def this(adapter: atMaterialDrawerLib.adapterMod.MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends atMaterialDrawerLib.atMaterialDrawerMod.MDCDrawer {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends atMaterialDrawerLib.atMaterialDrawerMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: atMaterialDrawerLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialDrawerLib.adapterMod.MDCDrawerAdapter = js.native
    val strings: atMaterialDrawerLib.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialDrawerLib.atMaterialDrawerMod.MDCDrawer = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def createFocusTrapInstance(
      surfaceEl: stdLib.Element,
      focusTrapFactory: js.Function0[atMaterialDrawerLib.focusDashTrapMod.FocusTrap]
    ): atMaterialDrawerLib.focusDashTrapMod.FocusTrap = js.native
  }
  
}

