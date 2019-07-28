package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialFloatingDashLabel.adapterMod.MDCFloatingLabelAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "floatingLabel")
@js.native
object floatingLabelNs extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabel
  
  @js.native
  class MDCFloatingLabelFoundation ()
    extends typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabelFoundation
  
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: Element): typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabel = js.native
  }
  
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: typings.atMaterialFloatingDashLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

