package typings.materialFloatingLabel

import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/floating-label/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCFloatingLabel () extends MDCComponent[MDCFloatingLabelFoundation] {
    
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
  @js.native
  object MDCFloatingLabel extends js.Object {
    
    def attachTo(root: Element): MDCFloatingLabel = js.native
  }
  
  type MDCFloatingLabelFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCFloatingLabelFoundation], 
    MDCFloatingLabel
  ]
}
