package typings.materialLinearProgress

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typings.materialLinearProgress.anon.ANIMATIONREADYCLASS
import typings.materialLinearProgress.anon.ARIAVALUENOW
import typings.materialLinearProgress.anon.PartialMDCLinearProgressA
import typings.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/linear-progress/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends MDCFoundation[MDCLinearProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
    
    def getDeterminate(): Boolean = js.native
    
    def getProgress(): Double = js.native
    
    /**
      * Handles the transitionend event emitted after `close()` is called and the
      * opacity fades out. This is so that animations are removed only after the
      * progress indicator is completely hidden.
      */
    def handleTransitionEnd(): Unit = js.native
    
    def setBuffer(value: Double): Unit = js.native
    
    def setReverse(isReversed: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    
    def cssClasses: ANIMATIONREADYCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  class default () extends MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ANIMATIONREADYCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
}
