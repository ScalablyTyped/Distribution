package typings.materialComponentsWeb.mod

import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  @js.native
  class MDCLinearProgress ()
    extends typings.materialLinearProgress.mod.MDCLinearProgress
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typings.materialLinearProgress.mod.MDCLinearProgressFoundation
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): typings.materialLinearProgress.mod.MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typings.materialLinearProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typings.materialLinearProgress.constantsMod.strings = js.native
  }
  
}

