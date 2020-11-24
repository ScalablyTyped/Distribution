package typings.materialComponentsWeb.mod

import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typings.materialLinearProgress.anon.ANIMATIONREADYCLASS
import typings.materialLinearProgress.anon.ARIAVALUENOW
import typings.materialLinearProgress.anon.PartialMDCLinearProgressA
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  
  @js.native
  class MDCLinearProgress ()
    extends typings.materialLinearProgress.mod.MDCLinearProgress
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    
    def attachTo(root: Element): typings.materialLinearProgress.componentMod.MDCLinearProgress = js.native
  }
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typings.materialLinearProgress.mod.MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    
    def cssClasses: ANIMATIONREADYCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  object animationDimensionPercentages extends js.Object {
    
    var PRIMARY_FULL: Double = js.native
    
    var PRIMARY_HALF: Double = js.native
    
    var SECONDARY_FULL: Double = js.native
    
    var SECONDARY_HALF: Double = js.native
    
    var SECONDARY_QUARTER: Double = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var ANIMATION_READY_CLASS: String = js.native
    
    var CLOSED_ANIMATION_OFF_CLASS: String = js.native
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
    
    var REVERSED_CLASS: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_VALUENOW: String = js.native
    
    var BUFFER_BAR_SELECTOR: String = js.native
    
    var FLEX_BASIS: String = js.native
    
    var PRIMARY_BAR_SELECTOR: String = js.native
  }
}
