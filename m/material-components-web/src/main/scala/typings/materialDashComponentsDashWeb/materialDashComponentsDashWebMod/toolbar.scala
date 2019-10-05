package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "toolbar")
@js.native
object toolbar extends js.Object {
  @js.native
  class MDCToolbar ()
    extends typings.atMaterialToolbar.atMaterialToolbarMod.MDCToolbar
  
  @js.native
  class MDCToolbarFoundation ()
    extends typings.atMaterialToolbar.atMaterialToolbarMod.MDCToolbarFoundation
  
  /* static members */
  @js.native
  object MDCToolbar extends js.Object {
    def attachTo(root: Element): typings.atMaterialToolbar.atMaterialToolbarMod.MDCToolbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCToolbarFoundation extends js.Object {
    val cssClasses: typings.atMaterialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typings.atMaterialToolbar.constantsMod.numbers = js.native
    val strings: typings.atMaterialToolbar.constantsMod.strings = js.native
  }
  
}

