package typings.materialComponentsWeb.mod

import typings.materialSelect.adapterMod.MDCSelectAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object select extends js.Object {
  @js.native
  class MDCSelect ()
    extends typings.materialSelect.mod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends typings.materialSelect.mod.MDCSelectFoundation
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typings.materialSelect.mod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typings.materialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typings.materialSelect.constantsMod.strings = js.native
  }
  
}

