package typings.materialComponentsWeb.mod

import typings.materialCircularProgress.adapterMod.MDCCircularProgressAdapter
import typings.materialCircularProgress.anon.ARIAVALUENOW
import typings.materialCircularProgress.anon.CLOSEDCLASS
import typings.materialCircularProgress.anon.PartialMDCCircularProgres
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "circularProgress")
@js.native
object circularProgress extends js.Object {
  
  @js.native
  class MDCCircularProgress ()
    extends typings.materialCircularProgress.mod.MDCCircularProgress
  /* static members */
  @js.native
  object MDCCircularProgress extends js.Object {
    
    def attachTo(root: Element): typings.materialCircularProgress.componentMod.MDCCircularProgress = js.native
  }
  
  @js.native
  class MDCCircularProgressFoundation ()
    extends typings.materialCircularProgress.mod.MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  /* static members */
  @js.native
  object MDCCircularProgressFoundation extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCCircularProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_VALUENOW: String = js.native
    
    var DETERMINATE_CIRCLE_SELECTOR: String = js.native
    
    var RADIUS: String = js.native
    
    var STROKE_DASHOFFSET: String = js.native
  }
}
