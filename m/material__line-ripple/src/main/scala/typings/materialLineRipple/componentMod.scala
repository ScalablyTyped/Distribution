package typings.materialLineRipple

import typings.materialBase.componentMod.MDCComponent
import typings.materialLineRipple.foundationMod.MDCLineRippleFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/line-ripple/component", "MDCLineRipple")
  @js.native
  class MDCLineRipple protected () extends MDCComponent[MDCLineRippleFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCLineRippleFoundation, args: js.Any*) = this()
    
    /**
      * Activates the line ripple
      */
    def activate(): Unit = js.native
    
    /**
      * Deactivates the line ripple
      */
    def deactivate(): Unit = js.native
    
    /**
      * Sets the transform origin given a user's click location.
      * The `rippleCenter` is the x-coordinate of the middle of the ripple.
      */
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  /* static members */
  object MDCLineRipple {
    
    @JSImport("@material/line-ripple/component", "MDCLineRipple.attachTo")
    @js.native
    def attachTo(root: Element): MDCLineRipple = js.native
  }
  
  type MDCLineRippleFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCLineRippleFoundation], 
    MDCLineRipple
  ]
}
