package typings.materialCircularProgress

import typings.materialBase.componentMod.MDCComponent
import typings.materialCircularProgress.foundationMod.MDCCircularProgressFoundation
import typings.materialProgressIndicator.mod.MDCProgressIndicator
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/circular-progress/component", "MDCCircularProgress")
  @js.native
  class MDCCircularProgress protected ()
    extends MDCComponent[MDCCircularProgressFoundation]
       with MDCProgressIndicator {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCCircularProgressFoundation, args: js.Any*) = this()
    
    def initialize(): Unit = js.native
    
    /**
      * Whether the progress indicator is hidden.
      */
    def isClosed: Boolean = js.native
  }
  /* static members */
  object MDCCircularProgress {
    
    @JSImport("@material/circular-progress/component", "MDCCircularProgress.attachTo")
    @js.native
    def attachTo(root: Element): MDCCircularProgress = js.native
  }
}
