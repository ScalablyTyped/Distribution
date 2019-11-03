package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialTab.adapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tab")
@js.native
object tab extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.atMaterialTab.atMaterialTabMod.MDCTab
  
  @js.native
  class MDCTabFoundation ()
    extends typings.atMaterialTab.atMaterialTabMod.MDCTabFoundation
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typings.atMaterialTab.atMaterialTabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.atMaterialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.atMaterialTab.constantsMod.strings = js.native
  }
  
}

