package typings.materialLineRipple

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialLineRipple.foundationMod.MDCLineRippleFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/line-ripple/component", "MDCLineRipple")
  @js.native
  open class MDCLineRipple protected () extends MDCComponent[MDCLineRippleFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCLineRippleFoundation, args: Any*) = this()
    
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
    
    @JSImport("@material/line-ripple/component", "MDCLineRipple")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCLineRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCLineRipple]
  }
  
  type MDCLineRippleFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCLineRippleFoundation], 
    MDCLineRipple
  ]
}
