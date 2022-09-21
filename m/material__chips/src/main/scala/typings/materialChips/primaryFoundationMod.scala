package typings.materialChips

import typings.materialChips.anon.PartialMDCChipActionAdapt
import typings.materialChips.foundationMod.MDCChipActionFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryFoundationMod {
  
  @JSImport("@material/chips/action/primary-foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipPrimaryActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action/primary-foundation", "MDCChipPrimaryActionFoundation")
  @js.native
  open class MDCChipPrimaryActionFoundation () extends MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
}
