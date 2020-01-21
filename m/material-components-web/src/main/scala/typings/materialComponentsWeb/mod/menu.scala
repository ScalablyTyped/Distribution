package typings.materialComponentsWeb.mod

import typings.materialMenu.adapterMod.MDCMenuAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  @js.native
  class MDCMenu ()
    extends typings.materialMenu.mod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends typings.materialMenu.mod.MDCMenuFoundation
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): typings.materialMenu.mod.MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typings.materialMenu.constantsMod.Corner = js.native
    val cssClasses: typings.materialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typings.materialMenu.constantsMod.numbers = js.native
    val strings: typings.materialMenu.constantsMod.strings = js.native
  }
  
}

