package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "floatingLabel")
@js.native
object floatingLabelNs extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel
  
  @js.native
  class MDCFloatingLabelFoundation ()
    extends atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabelFoundation
  
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel = js.native
  }
  
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: atMaterialFloatingDashLabelLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialFloatingDashLabelLib.adapterMod.MDCFloatingLabelAdapter = js.native
  }
  
}

