package typings.materialComponentsWeb.mod

import typings.materialTab.adapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tab")
@js.native
object tab extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.materialTab.mod.MDCTab
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTab.mod.MDCTabFoundation
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typings.materialTab.mod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.materialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.materialTab.constantsMod.strings = js.native
  }
  
}

