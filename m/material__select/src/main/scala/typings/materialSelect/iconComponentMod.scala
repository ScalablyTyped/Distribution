package typings.materialSelect

import typings.materialBase.componentMod.MDCComponent
import typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconComponentMod {
  
  @JSImport("@material/select/icon/component", "MDCSelectIcon")
  @js.native
  class MDCSelectIcon protected () extends MDCComponent[MDCSelectIconFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCSelectIconFoundation, args: js.Any*) = this()
    
    def foundationForSelect: MDCSelectIconFoundation = js.native
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon/component", "MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSelectIcon]
  }
  
  type MDCSelectIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectIconFoundation], 
    MDCSelectIcon
  ]
}
