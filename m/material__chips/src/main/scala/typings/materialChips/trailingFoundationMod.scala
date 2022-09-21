package typings.materialChips

import typings.materialChips.anon.PartialMDCChipActionAdapt
import typings.materialChips.foundationMod.MDCChipActionFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingFoundationMod {
  
  @JSImport("@material/chips/action/trailing-foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action/trailing-foundation", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation () extends MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
}
