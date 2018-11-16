package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "toolbar")
@js.native
object toolbarNs extends js.Object {
  @js.native
  class MDCToolbar ()
    extends atMaterialToolbarLib.toolbarMod.MDCToolbar
  
  @js.native
  class MDCToolbarFoundation ()
    extends atMaterialToolbarLib.toolbarMod.MDCToolbarFoundation
  
  @js.native
  object MDCToolbar extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialToolbarLib.toolbarMod.MDCToolbar = js.native
  }
  
  @js.native
  object MDCToolbarFoundation extends js.Object {
    val cssClasses: atMaterialToolbarLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialToolbarLib.adapterMod.MDCToolbarAdapter = js.native
    val numbers: atMaterialToolbarLib.constantsMod.numbers = js.native
    val strings: atMaterialToolbarLib.constantsMod.strings = js.native
  }
  
}

