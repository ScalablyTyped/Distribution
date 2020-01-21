package typings.materialTab

import typings.materialTab.adapterMod.MDCTabAdapter
import typings.materialTab.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.materialBase.componentMod.default[MDCTabAdapter, default] {
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
    val cssClasses: typings.materialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.materialTab.constantsMod.strings = js.native
  }
  
}

