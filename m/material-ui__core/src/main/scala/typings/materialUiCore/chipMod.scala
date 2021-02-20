package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.chipChipMod.ChipProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod extends Shortcut {
  
  @JSImport("@material-ui/core/Chip", JSImport.Default)
  @js.native
  val default: ComponentType[ChipProps] = js.native
  
  type _To = ComponentType[ChipProps]
  
  /* This means you don't have to write `default`, but can instead just say `chipMod.foo` */
  override def _to: ComponentType[ChipProps] = default
}
