package typings.materialTabs

import typings.materialBase.componentMod.default
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab", JSImport.Namespace)
@js.native
object tabMod extends js.Object {
  @js.native
  class MDCTab () extends default[MDCTabAdapter] {
    val computedLeft: Double = js.native
    val computedWidth: Double = js.native
    var isActive: Boolean = js.native
    var preventDefaultOnClick: Boolean = js.native
    def measureSelf(): Unit = js.native
  }
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTabs.tabFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.materialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.materialTabs.tabConstantsMod.strings = js.native
  }
  
}

