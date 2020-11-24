package typings.materialTooltip

import typings.materialBase.componentMod.MDCComponent
import typings.materialTooltip.anon.XPos
import typings.materialTooltip.constantsMod.AnchorBoundaryType
import typings.materialTooltip.foundationMod.MDCTooltipFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tooltip/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTooltip () extends MDCComponent[MDCTooltipFoundation] {
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    def setTooltipPosition(position: XPos): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTooltip extends js.Object {
    
    def attachTo(root: Element): MDCTooltip = js.native
  }
}
