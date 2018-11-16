package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menu")
@js.native
object menuNs extends js.Object {
  @js.native
  class MDCMenu ()
    extends atMaterialMenuLib.menuMod.MDCMenu
  
  @js.native
  class MDCMenuFoundation ()
    extends atMaterialMenuLib.menuMod.MDCMenuFoundation
  
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialMenuLib.menuMod.MDCMenu = js.native
  }
  
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: atMaterialMenuLib.constantsMod.Corner = js.native
    val cssClasses: atMaterialMenuLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialMenuLib.adapterMod.MDCMenuAdapter = js.native
    val numbers: atMaterialMenuLib.constantsMod.numbers = js.native
    val strings: atMaterialMenuLib.constantsMod.strings = js.native
  }
  
}

