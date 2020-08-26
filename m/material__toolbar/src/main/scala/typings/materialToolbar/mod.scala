package typings.materialToolbar

import typings.materialBase.mod.MDCComponent
import typings.materialToolbar.adapterMod.MDCToolbarAdapter
import typings.materialToolbar.foundationMod.default
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCToolbar () extends MDCComponent[MDCToolbarAdapter] {
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
    val cssClasses: typings.materialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typings.materialToolbar.constantsMod.numbers = js.native
    val strings: typings.materialToolbar.constantsMod.strings = js.native
  }
  
}

