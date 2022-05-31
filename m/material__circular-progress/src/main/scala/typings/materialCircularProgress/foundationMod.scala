package typings.materialCircularProgress

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialCircularProgress.adapterMod.MDCCircularProgressAdapter
import typings.materialCircularProgress.anon.PartialMDCCircularProgres
import typings.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/circular-progress/foundation", JSImport.Default)
  @js.native
  class default () extends MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  
  @JSImport("@material/circular-progress/foundation", "MDCCircularProgressFoundation")
  @js.native
  class MDCCircularProgressFoundation ()
    extends MDCFoundation[MDCCircularProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
    
    /**
      * Puts the component in the closed state.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    def getProgress(): Double = js.native
    
    /**
      * @return Returns whether the progress indicator is hidden.
      */
    def isClosed(): Boolean = js.native
    
    def isDeterminate(): Boolean = js.native
    
    /**
      * Puts the component in the open state.
      */
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      *
      * @param isDeterminate - Whether the component is in determinate state
      */
    /* CompleteClass */
    override def setDeterminate(isDeterminate: Boolean): Unit = js.native
    
    /**
      * Sets the current progress value.
      *
      * @param value - the current progress value, should be between [0,1]
      */
    /* CompleteClass */
    override def setProgress(value: Double): Unit = js.native
  }
}
