package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.materialChips.trailingactionAdapterMod.MDCChipTrailingActionAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionFoundationMod {
  
  @JSImport("@material/chips/trailingaction/foundation", JSImport.Default)
  @js.native
  class default () extends MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  @JSImport("@material/chips/trailingaction/foundation", "MDCChipTrailingActionFoundation")
  @js.native
  class MDCChipTrailingActionFoundation () extends MDCFoundation[MDCChipTrailingActionAdapter] {
    def this(adapter: PartialMDCChipTrailingAct) = this()
    
    def focus(): Unit = js.native
    
    def handleClick(evt: MouseEvent): Unit = js.native
    
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def isNavigable(): Boolean = js.native
    
    def removeFocus(): Unit = js.native
  }
}
