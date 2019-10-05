package typings.atMaterialTab

import typings.atMaterialTab.adapterMod.MDCTabAdapter
import typings.atMaterialTab.atMaterialTabMod.MDCTab
import typings.atMaterialTab.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", JSImport.Namespace)
@js.native
object atMaterialTabMod extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.atMaterialBase.componentMod.default[MDCTabAdapter, default] {
    var active: Boolean = js.native
  }
  
  @js.native
  class MDCTabFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.atMaterialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.atMaterialTab.constantsMod.strings = js.native
  }
  
}

