package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object selectNs extends js.Object {
  @js.native
  class MDCSelect ()
    extends atMaterialSelectLib.selectMod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends atMaterialSelectLib.selectMod.MDCSelectFoundation
  
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialSelectLib.selectMod.MDCSelect = js.native
  }
  
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: atMaterialSelectLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialSelectLib.adapterMod.MDCSelectAdapter = js.native
    val strings: atMaterialSelectLib.constantsMod.strings = js.native
  }
  
}

