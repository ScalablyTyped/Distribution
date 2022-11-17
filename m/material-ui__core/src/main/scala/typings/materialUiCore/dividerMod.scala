package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.dividerDividerMod.DividerTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dividers](https://mui.com/components/dividers/)
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/api/divider/)
    */
  @JSImport("@material-ui/core/Divider", JSImport.Default)
  @js.native
  val default: OverridableComponent[DividerTypeMap[js.Object, "hr"]] = js.native
  
  type _To = OverridableComponent[DividerTypeMap[js.Object, "hr"]]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: OverridableComponent[DividerTypeMap[js.Object, "hr"]] = default
}
