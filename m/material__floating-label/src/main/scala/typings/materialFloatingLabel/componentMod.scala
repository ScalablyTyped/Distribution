package typings.materialFloatingLabel

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/floating-label/component", "MDCFloatingLabel")
  @js.native
  open class MDCFloatingLabel protected () extends MDCComponent[MDCFloatingLabelFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCFloatingLabelFoundation, args: Any*) = this()
    
    /**
      * Styles the label to float/dock.
      * @param shouldFloat If true, floats the label by adding a CSS class; otherwise, docks it by removing the class.
      */
    def float(shouldFloat: Boolean): Unit = js.native
    
    def getWidth(): Double = js.native
    
    /**
      * Styles the label as required.
      * @param isRequired If true, adds an asterisk to the label, indicating that it is required.
      */
    def setRequired(isRequired: Boolean): Unit = js.native
    
    /**
      * Styles the label to produce the label shake for errors.
      * @param shouldShake If true, shakes the label by adding a CSS class; otherwise, stops shaking by removing the class.
      */
    def shake(shouldShake: Boolean): Unit = js.native
  }
  /* static members */
  object MDCFloatingLabel {
    
    @JSImport("@material/floating-label/component", "MDCFloatingLabel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCFloatingLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCFloatingLabel]
  }
  
  type MDCFloatingLabelFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCFloatingLabelFoundation], 
    MDCFloatingLabel
  ]
}
