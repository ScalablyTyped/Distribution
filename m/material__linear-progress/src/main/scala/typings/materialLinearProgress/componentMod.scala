package typings.materialLinearProgress

import typings.materialBase.componentMod.MDCComponent
import typings.materialLinearProgress.foundationMod.MDCLinearProgressFoundation
import typings.materialProgressIndicator.mod.MDCProgressIndicator
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/linear-progress/component", "MDCLinearProgress")
  @js.native
  class MDCLinearProgress protected ()
    extends MDCComponent[MDCLinearProgressFoundation]
       with MDCProgressIndicator {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCLinearProgressFoundation, args: js.Any*) = this()
    
    def buffer_=(value: Double): Unit = js.native
    
    /**
      * Puts the component in the closed state.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      */
    /* CompleteClass */
    var determinate: Boolean = js.native
    
    /**
      * Puts the component in the open state.
      */
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /**
      * The current progress value. Value should be between [0, 1].
      */
    /* CompleteClass */
    var progress: Double = js.native
    
    def reverse_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object MDCLinearProgress {
    
    @JSImport("@material/linear-progress/component", "MDCLinearProgress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCLinearProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCLinearProgress]
  }
}
