package typings.materialDrawer

import typings.materialBase.componentMod.default
import typings.materialDrawer.adapterMod.MDCDrawerAdapter
import typings.materialDrawer.focusTrapMod.FocusTrap
import typings.materialList.mod.MDCList
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected ()
    extends typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: MDCDrawerAdapter) = this()
  }
  
  @js.native
  class MDCDrawer protected ()
    extends default[
          MDCDrawer, 
          typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation | typings.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
        ] {
    def this(args: js.Any*) = this()
    /**
      * Returns true if drawer is in the open position.
      */
    var open: Boolean = js.native
    def initialize(focusTrapFactory: FocusTrap, listFactory: MDCList): Unit = js.native
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
    def attachTo(root: Element): MDCDrawer = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, focusTrapFactory: js.Function0[FocusTrap]): FocusTrap = js.native
  }
  
}

