package typings.materialTextfield

import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon/component", JSImport.Namespace)
@js.native
object iconComponentMod extends js.Object {
  @js.native
  class MDCTextFieldIcon () extends MDCComponent[MDCTextFieldIconFoundation] {
    def foundationForTextField: MDCTextFieldIconFoundation = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): MDCTextFieldIcon = js.native
  }
  
  type MDCTextFieldIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldIconFoundation], 
    MDCTextFieldIcon
  ]
}

