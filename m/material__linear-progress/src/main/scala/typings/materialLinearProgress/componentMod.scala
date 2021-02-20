package typings.materialLinearProgress

import typings.materialBase.componentMod.MDCComponent
import typings.materialLinearProgress.foundationMod.MDCLinearProgressFoundation
import typings.materialProgressIndicator.mod.MDCProgressIndicator
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/linear-progress/component", "MDCLinearProgress")
  @js.native
  class MDCLinearProgress protected ()
    extends MDCComponent[MDCLinearProgressFoundation]
       with MDCProgressIndicator {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCLinearProgressFoundation, args: js.Any*) = this()
    
    def buffer_=(value: Double): Unit = js.native
    
    def reverse_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object MDCLinearProgress {
    
    @JSImport("@material/linear-progress/component", "MDCLinearProgress.attachTo")
    @js.native
    def attachTo(root: Element): MDCLinearProgress = js.native
  }
}
