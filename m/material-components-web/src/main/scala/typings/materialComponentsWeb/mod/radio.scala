package typings.materialComponentsWeb.mod

import typings.materialRadio.adapterMod.MDCRadioAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "radio")
@js.native
object radio extends js.Object {
  @js.native
  class MDCRadio ()
    extends typings.materialRadio.mod.MDCRadio
  
  @js.native
  class MDCRadioFoundation ()
    extends typings.materialRadio.mod.MDCRadioFoundation
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): typings.materialRadio.mod.MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typings.materialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typings.materialRadio.constantsMod.strings = js.native
  }
  
}

