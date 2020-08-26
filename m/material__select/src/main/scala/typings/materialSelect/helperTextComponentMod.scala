package typings.materialSelect

import typings.materialBase.componentMod.MDCComponent
import typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/helper-text/component", JSImport.Namespace)
@js.native
object helperTextComponentMod extends js.Object {
  @js.native
  class MDCSelectHelperText () extends MDCComponent[MDCSelectHelperTextFoundation] {
    def foundationForSelect: MDCSelectHelperTextFoundation = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectHelperText extends js.Object {
    def attachTo(root: Element): MDCSelectHelperText = js.native
  }
  
  type MDCSelectHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectHelperTextFoundation], 
    MDCSelectHelperText
  ]
}

