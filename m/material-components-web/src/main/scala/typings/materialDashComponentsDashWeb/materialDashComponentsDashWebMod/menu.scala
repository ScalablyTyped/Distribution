package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialMenu.adapterMod.MDCMenuAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  @js.native
  class MDCMenu ()
    extends typings.atMaterialMenu.atMaterialMenuMod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends typings.atMaterialMenu.atMaterialMenuMod.MDCMenuFoundation
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): typings.atMaterialMenu.atMaterialMenuMod.MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typings.atMaterialMenu.constantsMod.Corner = js.native
    val cssClasses: typings.atMaterialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typings.atMaterialMenu.constantsMod.numbers = js.native
    val strings: typings.atMaterialMenu.constantsMod.strings = js.native
  }
  
}

