package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.chipChipMod.ChipTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod extends Shortcut {
  
  /**
    * Chips represent complex entities in small blocks, such as a contact.
    * Demos:
    *
    * - [Chips](https://mui.com/components/chips/)
    *
    * API:
    *
    * - [Chip API](https://mui.com/api/chip/)
    */
  @JSImport("@material-ui/core/Chip", JSImport.Default)
  @js.native
  val default: OverridableComponent[ChipTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[ChipTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `chipMod.foo` */
  override def _to: OverridableComponent[ChipTypeMap[js.Object, div]] = default
}
