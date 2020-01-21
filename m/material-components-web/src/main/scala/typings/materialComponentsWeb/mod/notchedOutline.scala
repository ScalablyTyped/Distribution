package typings.materialComponentsWeb.mod

import typings.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "notchedOutline")
@js.native
object notchedOutline extends js.Object {
  @js.native
  class MDCNotchedOutline ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutline
  
  @js.native
  class MDCNotchedOutlineFoundation ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutlineFoundation
  
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    def attachTo(root: Element): typings.materialNotchedOutline.mod.MDCNotchedOutline = js.native
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    val cssClasses: typings.materialNotchedOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typings.materialNotchedOutline.constantsMod.strings = js.native
  }
  
}

