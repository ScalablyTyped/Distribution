package typings.materialLinearProgress

import typings.materialBase.componentMod.MDCComponent
import typings.materialLinearProgress.foundationMod.MDCLinearProgressFoundation
import typings.materialProgressIndicator.mod.MDCProgressIndicator
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/linear-progress/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCLinearProgress ()
    extends MDCComponent[MDCLinearProgressFoundation]
       with MDCProgressIndicator {
    
    def buffer_=(value: Double): Unit = js.native
    
    def reverse_=(value: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    
    def attachTo(root: Element): MDCLinearProgress = js.native
  }
}
