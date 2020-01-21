package typings.materialComponentsWeb.mod

import typings.materialDrawer.adapterMod.MDCDrawerAdapter
import typings.materialDrawer.focusTrapMod.FocusTrap
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawer extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typings.materialDrawer.mod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends typings.materialDrawer.mod.MDCDrawer {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typings.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typings.materialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typings.materialDrawer.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    def attachTo(root: Element): typings.materialDrawer.mod.MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

