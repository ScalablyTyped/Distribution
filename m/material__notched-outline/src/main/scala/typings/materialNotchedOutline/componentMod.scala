package typings.materialNotchedOutline

import typings.materialBase.componentMod.MDCComponent
import typings.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/notched-outline/component", "MDCNotchedOutline")
  @js.native
  class MDCNotchedOutline protected () extends MDCComponent[MDCNotchedOutlineFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCNotchedOutlineFoundation, args: js.Any*) = this()
    
    /**
      * Updates classes and styles to close the notch.
      */
    def closeNotch(): Unit = js.native
    
    /**
      * Updates classes and styles to open the notch to the specified width.
      * @param notchWidth The notch width in the outline.
      */
    def notch(notchWidth: Double): Unit = js.native
  }
  /* static members */
  object MDCNotchedOutline {
    
    @JSImport("@material/notched-outline/component", "MDCNotchedOutline.attachTo")
    @js.native
    def attachTo(root: Element): MDCNotchedOutline = js.native
  }
  
  type MDCNotchedOutlineFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCNotchedOutlineFoundation], 
    MDCNotchedOutline
  ]
}
