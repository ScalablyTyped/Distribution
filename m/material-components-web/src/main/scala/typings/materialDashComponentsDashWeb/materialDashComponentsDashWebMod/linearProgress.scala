package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialLinearDashProgress.adapterMod.MDCLinearProgressAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  @js.native
  class MDCLinearProgress ()
    extends typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressMod.MDCLinearProgress
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressMod.MDCLinearProgressFoundation
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressMod.MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typings.atMaterialLinearDashProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typings.atMaterialLinearDashProgress.constantsMod.strings = js.native
  }
  
}

