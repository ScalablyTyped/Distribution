package typings.materialTooltip

import typings.materialBase.componentMod.MDCComponent
import typings.materialTooltip.anon.XPos
import typings.materialTooltip.constantsMod.AnchorBoundaryType
import typings.materialTooltip.foundationMod.MDCTooltipFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tooltip/component", "MDCTooltip")
  @js.native
  class MDCTooltip protected () extends MDCComponent[MDCTooltipFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTooltipFoundation, args: js.Any*) = this()
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    def setTooltipPosition(position: XPos): Unit = js.native
  }
  /* static members */
  object MDCTooltip {
    
    @JSImport("@material/tooltip/component", "MDCTooltip.attachTo")
    @js.native
    def attachTo(root: Element): MDCTooltip = js.native
  }
}
