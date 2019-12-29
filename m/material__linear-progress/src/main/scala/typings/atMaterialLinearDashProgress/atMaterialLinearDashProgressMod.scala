package typings.atMaterialLinearDashProgress

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialLinearDashProgress.adapterMod.MDCLinearProgressAdapter
import typings.atMaterialLinearDashProgress.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/linear-progress", JSImport.Namespace)
@js.native
object atMaterialLinearDashProgressMod extends js.Object {
  @js.native
  class MDCLinearProgress () extends MDCComponent[MDCLinearProgressAdapter, default] {
    var buffer: Double = js.native
    var determinate: Boolean = js.native
    var progress: Double = js.native
    var reverse: Boolean = js.native
    def close(): Unit = js.native
    def open(): Unit = js.native
  }
  
  @js.native
  class MDCLinearProgressFoundation () extends default
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typings.atMaterialLinearDashProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typings.atMaterialLinearDashProgress.constantsMod.strings = js.native
  }
  
}

