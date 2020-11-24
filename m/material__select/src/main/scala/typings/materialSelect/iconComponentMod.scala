package typings.materialSelect

import typings.materialBase.componentMod.MDCComponent
import typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/select/icon/component", JSImport.Namespace)
@js.native
object iconComponentMod extends js.Object {
  
  @js.native
  class MDCSelectIcon () extends MDCComponent[MDCSelectIconFoundation] {
    
    def foundationForSelect: MDCSelectIconFoundation = js.native
  }
  /* static members */
  @js.native
  object MDCSelectIcon extends js.Object {
    
    def attachTo(root: Element): MDCSelectIcon = js.native
  }
  
  type MDCSelectIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectIconFoundation], 
    MDCSelectIcon
  ]
}
