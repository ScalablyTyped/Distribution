package typings.materialLinearProgress

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typings.materialLinearProgress.anon.PartialMDCLinearProgressA
import typings.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/linear-progress/foundation", JSImport.Default)
  @js.native
  class default () extends MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  
  @JSImport("@material/linear-progress/foundation", "MDCLinearProgressFoundation")
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
}
