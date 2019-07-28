package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialSelect.adapterMod.MDCSelectAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object selectNs extends js.Object {
  @js.native
  class MDCSelect ()
    extends typings.atMaterialSelect.atMaterialSelectMod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends typings.atMaterialSelect.atMaterialSelectMod.MDCSelectFoundation
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typings.atMaterialSelect.atMaterialSelectMod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typings.atMaterialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typings.atMaterialSelect.constantsMod.strings = js.native
  }
  
}

