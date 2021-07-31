package typings.materialTooltip

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTooltip.adapterMod.MDCTooltipAdapter
import typings.materialTooltip.anon.PartialMDCTooltipAdapter
import typings.materialTooltip.anon.XPos
import typings.materialTooltip.constantsMod.AnchorBoundaryType
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tooltip/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTooltipFoundation {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  
  @JSImport("@material/tooltip/foundation", "MDCTooltipFoundation")
  @js.native
  class MDCTooltipFoundation () extends MDCFoundation[MDCTooltipAdapter] {
    def this(adapter: PartialMDCTooltipAdapter) = this()
    
    def handleAnchorBlur(): Unit = js.native
    
    def handleAnchorFocus(): Unit = js.native
    
    def handleAnchorMouseEnter(): Unit = js.native
    
    def handleAnchorMouseLeave(): Unit = js.native
    
    def handleClick(): Unit = js.native
    
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def handleTransitionEnd(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    def setTooltipPosition(position: XPos): Unit = js.native
    
    def show(): Unit = js.native
  }
}
