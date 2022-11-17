package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.gridGridMod.GridTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Grid](https://mui.com/components/grid/)
    *
    * API:
    *
    * - [Grid API](https://mui.com/api/grid/)
    */
  @JSImport("@material-ui/core/Grid", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[GridTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `gridMod.foo` */
  override def _to: OverridableComponent[GridTypeMap[js.Object, "div"]] = default
}
