package typings.materialCircularProgress

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialCircularProgress.foundationMod.MDCCircularProgressFoundation
import typings.materialProgressIndicator.componentMod.MDCProgressIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/circular-progress/component", "MDCCircularProgress")
  @js.native
  open class MDCCircularProgress protected ()
    extends MDCComponent[MDCCircularProgressFoundation]
       with MDCProgressIndicator {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCCircularProgressFoundation, args: Any*) = this()
    
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
    
    /* private */ var determinateCircle: Any = js.native
    
    def initialize(): Unit = js.native
    
    /**
      * Whether the progress indicator is hidden.
      */
    def isClosed: Boolean = js.native
    
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
  }
  /* static members */
  object MDCCircularProgress {
    
    @JSImport("@material/circular-progress/component", "MDCCircularProgress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCCircularProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCCircularProgress]
  }
}
