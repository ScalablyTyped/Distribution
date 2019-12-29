package typings.atMaterialToolbar

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import typings.atMaterialToolbar.foundationMod.default
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", JSImport.Namespace)
@js.native
object atMaterialToolbarMod extends js.Object {
  @js.native
  class MDCToolbar () extends MDCComponent[MDCToolbarAdapter, default] {
    var fixedAdjustElement: HTMLElement = js.native
  }
  
  @js.native
  class MDCToolbarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCToolbar extends js.Object {
    def attachTo(root: Element): MDCToolbar = js.native
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

