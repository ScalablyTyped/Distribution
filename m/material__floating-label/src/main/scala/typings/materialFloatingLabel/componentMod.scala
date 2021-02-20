package typings.materialFloatingLabel

import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/floating-label/component", "MDCFloatingLabel")
  @js.native
  class MDCFloatingLabel protected () extends MDCComponent[MDCFloatingLabelFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCFloatingLabelFoundation, args: js.Any*) = this()
    
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
    
    @JSImport("@material/floating-label/component", "MDCFloatingLabel.attachTo")
    @js.native
    def attachTo(root: Element): MDCFloatingLabel = js.native
  }
  
  type MDCFloatingLabelFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCFloatingLabelFoundation], 
    MDCFloatingLabel
  ]
}
