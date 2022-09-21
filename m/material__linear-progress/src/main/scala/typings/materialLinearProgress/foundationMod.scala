package typings.materialLinearProgress

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typings.materialLinearProgress.anon.PartialMDCLinearProgressA
import typings.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/linear-progress/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  
  @JSImport("@material/linear-progress/foundation", "MDCLinearProgressFoundation")
  @js.native
  open class MDCLinearProgressFoundation ()
    extends MDCFoundation[MDCLinearProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var calculateAndSetDimensions: Any = js.native
    
    /**
      * Puts the component in the closed state.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var determinate: Any = js.native
    
    def getBuffer(): Double = js.native
    
    /**
      * @return the current progress value [0,1];
      */
    /* CompleteClass */
    override def getProgress(): Double = js.native
    
    /**
      * Handles the transitionend event emitted after `close()` is called and the
      * opacity fades out. This is so that animations are removed only after the
      * progress indicator is completely hidden.
      */
    def handleTransitionEnd(): Unit = js.native
    
    /**
      * @return Whether the component is closed.
      */
    /* CompleteClass */
    override def isClosed(): Boolean = js.native
    
    /**
      * @return Whether the component is determinate.
      */
    /* CompleteClass */
    override def isDeterminate(): Boolean = js.native
    
    /* private */ var observer: Any = js.native
    
    /**
      * Puts the component in the open state.
      */
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* private */ var progress: Any = js.native
    
    def restartAnimation(): Unit = js.native
    
    def setBuffer(value: Double): Unit = js.native
    
    /* private */ var setBufferBarProgress: Any = js.native
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      *
      * @param isDeterminate - Whether the component is in determinate state
      */
    /* CompleteClass */
    override def setDeterminate(isDeterminate: Boolean): Unit = js.native
    
    /* private */ var setPrimaryBarProgress: Any = js.native
    
    /**
      * Sets the current progress value.
      *
      * @param value - the current progress value, should be between [0,1]
      */
    /* CompleteClass */
    override def setProgress(value: Double): Unit = js.native
  }
}
